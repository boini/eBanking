CREATE DATABASE  IF NOT EXISTS `ebanking` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ebanking`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: ebanking
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;




--
-- Table structure for table `operation_status`
--

DROP TABLE IF EXISTS `operation_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operation_status` (
  `operation_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_status` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`operation_status_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operation_status`
--

LOCK TABLES `operation_status` WRITE;
/*!40000 ALTER TABLE `operation_status` DISABLE KEYS */;
INSERT INTO `operation_status` VALUES (1,'C','Completed'),(2,'N','New'),(3,'E','Error. Not enough money.'),(4,'P','Processing');
/*!40000 ALTER TABLE `operation_status` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `card_type`
--

DROP TABLE IF EXISTS `card_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `card_type` (
  `card_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `card_type_name` varchar(100) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`card_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `card_type`
--

LOCK TABLES `card_type` WRITE;
/*!40000 ALTER TABLE `card_type` DISABLE KEYS */;
INSERT INTO `card_type` VALUES (1,'VISA','Visa card'),(2,'MC','Mastercard');
/*!40000 ALTER TABLE `card_type` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `corporation`
--

DROP TABLE IF EXISTS `corporation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corporation` (
  `corporation_id` int(11) NOT NULL AUTO_INCREMENT,
  `corporation_name` varchar(45) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`corporation_id`),
  UNIQUE KEY `corporation_name_UNIQUE` (`corporation_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping data for table `corporation`
--

LOCK TABLES `corporation` WRITE;
/*!40000 ALTER TABLE `corporation` DISABLE KEYS */;
INSERT INTO `corporation` VALUES (1,'VELCOM','Velcom'),(2,'MTS','Mts'),(3,'LIFE','life:)'),(4,'SOLO','Solo'),(5,'SHPARKI_DAMAVIK','SHPARKI DAMAVIK'),(6,'BYFLY','By Fly'),(7,'COSMOS_TV','Cosmos TV'),(8,'BELTELECOM_PHONE','Beltelecom Phone'),(9,'RENT','Rent'),(10,'ELECTRICITY','Electricity');
/*!40000 ALTER TABLE `corporation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currency`
--

DROP TABLE IF EXISTS `currency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currency` (
  `currency_id` int(11) NOT NULL AUTO_INCREMENT,
  `currency_code` varchar(3) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`currency_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currency`
--

LOCK TABLES `currency` WRITE;
/*!40000 ALTER TABLE `currency` DISABLE KEYS */;
INSERT INTO `currency` VALUES (1,'USD','Unitated states dollar'),(2,'BYR','Belarusian rubles'),(3,'EUR','Euro');
/*!40000 ALTER TABLE `currency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rate`
--

DROP TABLE IF EXISTS `rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rate` (
  `rate_id` int(11) NOT NULL AUTO_INCREMENT,
  `currency_id` int(11) NOT NULL,
  `purchase` decimal(20,2) NOT NULL,
  `sale` decimal(20,2) NOT NULL,
  PRIMARY KEY (`rate_id`),
  KEY `currency_rate_idx` (`currency_id`),
  CONSTRAINT `currency_rate` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`currency_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rate`
--

LOCK TABLES `rate` WRITE;
/*!40000 ALTER TABLE `rate` DISABLE KEYS */;
INSERT INTO `rate` VALUES (1,1,8580.00,8660.00),(2,3,11050.00,11220.00);
/*!40000 ALTER TABLE `rate` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `country_id` int(11) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(100) NOT NULL,
  PRIMARY KEY (`country_id`),
  UNIQUE KEY `country_name_UNIQUE` (`country_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'Belarus'),(2,'Russia');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operation_type`
--

DROP TABLE IF EXISTS `operation_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operation_type` (
  `operation_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_type` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`operation_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operation_type`
--

LOCK TABLES `operation_type` WRITE;
/*!40000 ALTER TABLE `operation_type` DISABLE KEYS */;
INSERT INTO `operation_type` VALUES (1,'P','Payment'),(2,'TT','Transfer to'),(3,'TF','Transfer from');
/*!40000 ALTER TABLE `operation_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_USER'),(2,'ROLE_ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `city_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(100) NOT NULL,
  `country_id` int(11) NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `city_country_fk_idx` (`country_id`),
  CONSTRAINT `fk_city_country` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (1,'Minsk',1),(2,'Moscow',2);
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;








--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` int(11) NOT NULL,
  `region` varchar(30) DEFAULT NULL,
  `house_number` varchar(5) DEFAULT NULL,
  `flat_number` varchar(5) DEFAULT NULL,
  `street` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  KEY `address_sity_idx` (`city_id`),
  CONSTRAINT `fk_address_city` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,1,'Central','12','123','Kolasa');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `client` (
  `client_id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `middlename` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `date_of_birth` date NOT NULL,
  `address_id` int(11) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `mobile_number` varchar(20) DEFAULT NULL,
  `personal_number` varchar(20) NOT NULL,
  `secret_word` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`client_id`),
  KEY `address_client_idx` (`address_id`),
  CONSTRAINT `fk_client_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'Anton','Aleksandrovich','Kholodok','1990-02-15',1,'+375171234567','+375291258458','123456780HD12','secretword','toshaskywalker@gmail.com'),(2,'Blabla','Blablabla','Blablabla','1990-01-01',1,'+375291234567','+375291234567','123456780HD12','test','toshaskywalker@gmail.com'),(3,'Aleksandr','Dmitrievich','Volkov','2012-12-02',NULL,'+375171234567','+375291258458','123456780HD12','secretword2','toshaskywalker@gmail.com');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `client_id` int(11) DEFAULT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `login_UNIQUE` (`login`),
  KEY `client_account_idx` (`client_id`),
  KEY `account_role_idx` (`role_id`),
  CONSTRAINT `fk_account_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_account_role` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'test','6e2ee32f257460d4d524a9c793fdb03b',1,1),(2,'admin','6e2ee32f257460d4d524a9c793fdb03b',NULL,2),(3,'volkov','fb7cd37b9ff57838ff089ada61e24910',3,1),(4,'blabla','9bfa5af55fd23639e55cb77b0b6f6a46',2,1);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `card_account`
--

DROP TABLE IF EXISTS `card_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `card_account` (
  `card_account_id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(11) NOT NULL,
  `balance` decimal(20,2) NOT NULL DEFAULT '0.00',
  `currency_id` int(11) NOT NULL,
  `number` varchar(45) NOT NULL,
  PRIMARY KEY (`card_account_id`),
  KEY `card_account_client_idx` (`client_id`),
  KEY `card_account_currency_idx` (`currency_id`),
  CONSTRAINT `fk_card_account_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_card_account_currency` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`currency_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `card_account`
--

LOCK TABLES `card_account` WRITE;
/*!40000 ALTER TABLE `card_account` DISABLE KEYS */;
INSERT INTO `card_account` VALUES (1,1,0.00,1,'1234567890'),(2,2,0.00,1,'11111111111111'),(3,1,0.00,2,'2323232323232323');
/*!40000 ALTER TABLE `card_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `card`
--

DROP TABLE IF EXISTS `card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `card` (
  `card_id` int(11) NOT NULL AUTO_INCREMENT,
  `card_account_id` int(11) NOT NULL,
  `card_type_id` int(11) NOT NULL,
  `expiration_date` date NOT NULL,
  `card_number` varchar(16) NOT NULL,
  `cvv` varchar(3) NOT NULL,
  `credit_limit` decimal(20,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`card_id`),
  KEY `card_account_id_idx` (`card_account_id`),
  KEY `card_type_card_fk_idx` (`card_type_id`),
  CONSTRAINT `fk_card_card_account` FOREIGN KEY (`card_account_id`) REFERENCES `card_account` (`card_account_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_card_card_type` FOREIGN KEY (`card_type_id`) REFERENCES `card_type` (`card_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `card`
--

LOCK TABLES `card` WRITE;
/*!40000 ALTER TABLE `card` DISABLE KEYS */;
INSERT INTO `card` VALUES (1,1,1,'2012-12-21','1111222233334444','123',0.00),(3,3,2,'2013-01-25','1234123412341234','321',0.00);
/*!40000 ALTER TABLE `card` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `bank_account`
--

DROP TABLE IF EXISTS `bank_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank_account` (
  `bank_account_id` int(11) NOT NULL AUTO_INCREMENT,
  `corporation_id` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `currency_id` int(11) NOT NULL,
  `amount` decimal(20,2) NOT NULL DEFAULT '0.00',
  `number` varchar(45) NOT NULL,
  PRIMARY KEY (`bank_account_id`),
  KEY `corporation_id_idx` (`corporation_id`),
  KEY `client_id_idx` (`client_id`),
  KEY `currency_id_idx` (`currency_id`),
  CONSTRAINT `client_id` FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `corporation_id` FOREIGN KEY (`corporation_id`) REFERENCES `corporation` (`corporation_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `currency_id` FOREIGN KEY (`currency_id`) REFERENCES `currency` (`currency_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_account`
--

LOCK TABLES `bank_account` WRITE;
/*!40000 ALTER TABLE `bank_account` DISABLE KEYS */;
INSERT INTO `bank_account` VALUES (1,1,NULL,2,1058000.00,'1111111111'),(2,1,NULL,1,12000.00,'2222222222'),(3,2,NULL,2,4000000.00,'3333333333'),(4,2,NULL,1,120300.00,'4444444444'),(5,3,NULL,2,12300000.00,'5555555555'),(6,3,NULL,1,1231301.00,'66666666666'),(7,4,NULL,2,100000.00,'777777777'),(8,4,NULL,1,100001.00,'8888888889'),(9,5,NULL,2,100000.00,'999999999'),(10,5,NULL,1,100000.00,'123123123123'),(11,6,NULL,2,100000.00,'123412341234'),(12,6,NULL,1,100000.00,'13579135790'),(13,7,NULL,2,100000.00,'5423234636'),(14,7,NULL,1,100000.00,'546635254234'),(15,8,NULL,2,100000.00,'242552524443'),(16,8,NULL,1,100000.00,'24256356536'),(17,9,NULL,2,100000.00,'23424234565'),(18,9,NULL,1,100000.00,'234656563243'),(19,10,NULL,2,100000.00,'242342431'),(20,10,NULL,1,100000.00,'2134568546');
/*!40000 ALTER TABLE `bank_account` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `account_log`
--

DROP TABLE IF EXISTS `account_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_action` varchar(100) NOT NULL,
  `log_message` varchar(500) NOT NULL,
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`log_id`),
  KEY `fk_account_log_account_idx` (`account_id`),
  CONSTRAINT `fk_account_log_account` FOREIGN KEY (`account_id`) REFERENCES `account` (`account_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_log`
--

LOCK TABLES `account_log` WRITE;
/*!40000 ALTER TABLE `account_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `account_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `app_log`
--

DROP TABLE IF EXISTS `app_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `app_log` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_action` varchar(500) NOT NULL,
  `log_message` varchar(2000) NOT NULL,
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1135 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `operation`
--

DROP TABLE IF EXISTS `operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operation` (
  `operation_id` int(11) NOT NULL AUTO_INCREMENT,
  `operation_status_id` int(11) NOT NULL,
  `operation_type_id` int(11) NOT NULL,
  `operation_key` varchar(100) DEFAULT NULL,
  `processing_date` timestamp NULL DEFAULT NULL,
  `transaction_date` timestamp NULL DEFAULT NULL,
  `card_id` int(11) NOT NULL,
  `address_id` int(11) DEFAULT NULL,
  `transaction_amount` decimal(20,2) NOT NULL DEFAULT '0.00',
  `contractor_bank_account_id` int(11) DEFAULT NULL,
  `contractor_card_id` int(11) DEFAULT NULL,
  `card_account_amount` decimal(20,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`operation_id`),
  KEY `fk_operation_operation_status_idx` (`operation_status_id`),
  KEY `fk_operation_operation_type_idx` (`operation_type_id`),
  KEY `fk_operation_card_idx` (`card_id`),
  KEY `fk_operation_address_idx` (`address_id`),
  KEY `fk_operation_card_account_idx` (`contractor_bank_account_id`),
  KEY `fk_operation_contractor_card` (`contractor_card_id`),
  CONSTRAINT `fk_operation_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_bank_account` FOREIGN KEY (`contractor_bank_account_id`) REFERENCES `bank_account` (`bank_account_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_card` FOREIGN KEY (`card_id`) REFERENCES `card` (`card_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_contractor_card` FOREIGN KEY (`contractor_card_id`) REFERENCES `card` (`card_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_operation_status` FOREIGN KEY (`operation_status_id`) REFERENCES `operation_status` (`operation_status_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_operation_operation_type` FOREIGN KEY (`operation_type_id`) REFERENCES `operation_type` (`operation_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operation`
--

LOCK TABLES `operation` WRITE;
/*!40000 ALTER TABLE `operation` DISABLE KEYS */;
INSERT INTO `operation` VALUES (1,3,1,'Number=291258458','2012-12-19 09:06:38',NULL,1,NULL,1.00,2,NULL,0.00);
/*!40000 ALTER TABLE `operation` ENABLE KEYS */;
UNLOCK TABLES;

INSERT INTO `ebanking`.`corporation` (`corporation_id`, `corporation_name`, `description`) VALUES ('11', 'EBANKING', 'Ebanking ');
INSERT INTO `ebanking`.`operation_type` (`operation_type_id`, `operation_type`, `description`) VALUES ('4', 'CH', 'Charge');
INSERT INTO `ebanking`.`bank_account` (`bank_account_id`, `corporation_id`, `currency_id`, `amount`, `number`) VALUES ('21', '11', '2', '1000000', 'EBANKING-BYR');
INSERT INTO `ebanking`.`bank_account` (`bank_account_id`, `corporation_id`, `currency_id`, `amount`, `number`) VALUES ('22', '11', '1', '1000000', 'EBANKING-USD');

ALTER TABLE `ebanking`.`account` DROP FOREIGN KEY `fk_account_client` ;
ALTER TABLE `ebanking`.`account` 
  ADD CONSTRAINT `fk_account_client`
  FOREIGN KEY (`client_id` )
  REFERENCES `ebanking`.`client` (`client_id` )
  ON DELETE CASCADE
  ON UPDATE NO ACTION;

ALTER TABLE `ebanking`.`card_account` DROP FOREIGN KEY `fk_card_account_client` ;
ALTER TABLE `ebanking`.`card_account` 
  ADD CONSTRAINT `fk_card_account_client`
  FOREIGN KEY (`client_id` )
  REFERENCES `ebanking`.`client` (`client_id` )
  ON DELETE CASCADE
  ON UPDATE NO ACTION;

ALTER TABLE `ebanking`.`card` DROP FOREIGN KEY `fk_card_card_account` ;
ALTER TABLE `ebanking`.`card` 
  ADD CONSTRAINT `fk_card_card_account`
  FOREIGN KEY (`card_account_id` )
  REFERENCES `ebanking`.`card_account` (`card_account_id` )
  ON DELETE CASCADE
  ON UPDATE NO ACTION;



/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-12-19 19:49:20

