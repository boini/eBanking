-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- Хост: localhost
-- Время создания: Дек 05 2012 г., 22:30
-- Версия сервера: 5.5.28-log
-- Версия PHP: 5.4.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `ebanking`
--

-- --------------------------------------------------------

--
-- Структура таблицы `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL,
  `client_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  KEY `client_account_idx` (`client_id`),
  KEY `account_role_idx` (`role_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `account`
--

INSERT INTO `account` (`account_id`, `login`, `password`, `client_id`, `role_id`) VALUES
(1, 'test', '6e2ee32f257460d4d524a9c793fdb03b', 1, 1);

-- --------------------------------------------------------

--
-- Структура таблицы `account_log`
--

CREATE TABLE IF NOT EXISTS `account_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_action` varchar(100) NOT NULL,
  `log_message` varchar(500) NOT NULL,
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`log_id`),
  KEY `fk_account_log_account_idx` (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `address`
--

CREATE TABLE IF NOT EXISTS `address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` int(11) NOT NULL,
  `region` varchar(30) DEFAULT NULL,
  `house_number` varchar(5) DEFAULT NULL,
  `flat_number` varchar(5) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  KEY `address_sity_idx` (`city_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `address`
--

INSERT INTO `address` (`address_id`, `city_id`, `region`, `house_number`, `flat_number`, `street`) VALUES
(1, 1, 'Central', '12', '123', 'Kolasa');

-- --------------------------------------------------------

--
-- Структура таблицы `app_log`
--

CREATE TABLE IF NOT EXISTS `app_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_action` varchar(100) NOT NULL,
  `log_message` varchar(500) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `card`
--

CREATE TABLE IF NOT EXISTS `card` (
  `card_id` int(11) NOT NULL AUTO_INCREMENT,
  `card_account_id` int(11) NOT NULL,
  `card_type_id` int(11) NOT NULL,
  `expiration_date` date NOT NULL,
  `card_number` varchar(16) NOT NULL,
  `cvv` varchar(3) NOT NULL,
  `credit_limit` decimal(20,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`card_id`),
  KEY `card_account_id_idx` (`card_account_id`),
  KEY `card_type_card_fk_idx` (`card_type_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `card`
--

INSERT INTO `card` (`card_id`, `card_account_id`, `card_type_id`, `expiration_date`, `card_number`, `cvv`, `credit_limit`) VALUES
(1, 1, 1, '2013-02-03', '2222222222222222', '123', '0.00'),
(2, 2, 1, '2013-02-03', '1234567890123456', '123', '0.00');

-- --------------------------------------------------------

--
-- Структура таблицы `card_account`
--

CREATE TABLE IF NOT EXISTS `card_account` (
  `card_account_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `balance` decimal(20,2) NOT NULL DEFAULT '0.00',
  `currency_id` int(11) NOT NULL,
  PRIMARY KEY (`card_account_id`),
  KEY `card_account_client_idx` (`client_id`),
  KEY `card_account_currency_idx` (`currency_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `card_account`
--

INSERT INTO `card_account` (`card_account_id`, `client_id`, `balance`, `currency_id`) VALUES
(1, 1, '1500.00', 1),
(2, 1, '2000000.00', 2);

-- --------------------------------------------------------

--
-- Структура таблицы `card_type`
--

CREATE TABLE IF NOT EXISTS `card_type` (
  `card_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `card_type_name` varchar(100) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`card_type_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `card_type`
--

INSERT INTO `card_type` (`card_type_id`, `card_type_name`, `description`) VALUES
(1, 'VISA', 'Visa card');

-- --------------------------------------------------------

--
-- Структура таблицы `city`
--

CREATE TABLE IF NOT EXISTS `city` (
  `city_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(100) NOT NULL,
  `country_id` int(11) NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `city_country_fk_idx` (`country_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `city`
--

INSERT INTO `city` (`city_id`, `city_name`, `country_id`) VALUES
(1, 'Minsk', 1);

-- --------------------------------------------------------

--
-- Структура таблицы `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `client_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `middlename` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `date_of_birth` date NOT NULL,
  `address_id` int(11) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `mobile_number` varchar(20) DEFAULT NULL,
  `personal_number` varchar(20) NOT NULL,
  `secret_word` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`client_id`),
  KEY `address_client_idx` (`address_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `client`
--

INSERT INTO `client` (`client_id`, `firstname`, `middlename`, `lastname`, `date_of_birth`, `address_id`, `phone_number`, `mobile_number`, `personal_number`, `secret_word`, `email`) VALUES
(1, 'Alexander', 'Alexandrovich', 'Aleksin', '1990-01-01', 1, '80171234567', '+375291234567', '123456780HD12', 'test', 'test@email.com');

-- --------------------------------------------------------

--
-- Структура таблицы `country`
--

CREATE TABLE IF NOT EXISTS `country` (
  `country_id` int(11) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(100) NOT NULL,
  PRIMARY KEY (`country_id`),
  UNIQUE KEY `country_name_UNIQUE` (`country_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `country`
--

INSERT INTO `country` (`country_id`, `country_name`) VALUES
(1, 'Belarus');

-- --------------------------------------------------------

--
-- Структура таблицы `currency`
--

CREATE TABLE IF NOT EXISTS `currency` (
  `currency_id` int(11) NOT NULL AUTO_INCREMENT,
  `currency_code` varchar(3) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`currency_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `currency`
--

INSERT INTO `currency` (`currency_id`, `currency_code`, `description`) VALUES
(1, 'USD', 'Unitated states dollar'),
(2, 'BYR', 'Belarusian rubles');

-- --------------------------------------------------------

--
-- Структура таблицы `operation`
--

CREATE TABLE IF NOT EXISTS `operation` (
  `operation_id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_status_id` int(11) NOT NULL,
  `operation_type_id` int(11) NOT NULL,
  `operation_key` varchar(100) NOT NULL,
  `processing_date` timestamp NULL DEFAULT NULL,
  `transaction_date` timestamp NULL DEFAULT NULL,
  `card_id` int(11) NOT NULL,
  `address_id` int(11) NOT NULL,
  `transaction_amount` decimal(20,2) NOT NULL DEFAULT '0.00',
  `contractor_account_id` int(11) NOT NULL,
  PRIMARY KEY (`operation_id`),
  KEY `fk_operation_operation_status_idx` (`operation_status_id`),
  KEY `fk_operation_operation_type_idx` (`operation_type_id`),
  KEY `fk_operation_card_idx` (`card_id`),
  KEY `fk_operation_address_idx` (`address_id`),
  KEY `fk_operation_card_account_idx` (`contractor_account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `operation_status`
--

CREATE TABLE IF NOT EXISTS `operation_status` (
  `operation_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_status` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`operation_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `operation_type`
--

CREATE TABLE IF NOT EXISTS `operation_type` (
  `operation_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_type` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`operation_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `role`
--

INSERT INTO `role` (`role_id`, `role_name`) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `fk_account_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_account_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `account_log`
--
ALTER TABLE `account_log`
  ADD CONSTRAINT `fk_account_log_account` FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `fk_address_city` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `fk_card_card_account` FOREIGN KEY (`card_account_id`) REFERENCES `card_account` (`card_account_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_card_card_type` FOREIGN KEY (`card_type_id`) REFERENCES `card_type` (`card_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `card_account`
--
ALTER TABLE `card_account`
  ADD CONSTRAINT `fk_card_account_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_card_account_currency` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`currency_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `city`
--
ALTER TABLE `city`
  ADD CONSTRAINT `fk_city_country` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `fk_client_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ограничения внешнего ключа таблицы `operation`
--
ALTER TABLE `operation`
  ADD CONSTRAINT `fk_operation_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_operation_card` FOREIGN KEY (`card_id`) REFERENCES `card` (`card_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_operation_card_account` FOREIGN KEY (`contractor_account_id`) REFERENCES `card_account` (`card_account_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_operation_operation_status` FOREIGN KEY (`operation_status_id`) REFERENCES `operation_status` (`operation_status_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_operation_operation_type` FOREIGN KEY (`operation_type_id`) REFERENCES `operation_type` (`operation_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
