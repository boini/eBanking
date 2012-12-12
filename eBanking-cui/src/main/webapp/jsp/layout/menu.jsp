<script>
    $(document).ready(function(){
        var selector = "#" + $("#actionName").text();
        $(selector).addClass("active");
    });
</script>
<div id="menu-header">
    <h5>Выберите действие</h5>
</div>
<ul class="nav nav-list">
    <li id="main-action"><a href="/main.action">Главная страница</a></li>

    <li class="nav-header">Выписки</li>
    <li id="info-action"><a href="/onlineInfo.action">Онлайн информация</a></li>
    <li id="card-action"><a href="/cardAccountInfo.action">Выписка по карт-счетам</a></li>

    <li class="nav-header">Платежи</li>
    <li id="payment-action"><a href="/payment.action">Оплатить услуги</a></li>
    <li id="history-action"><a href="/clientOperationHistory.action">Архив операций</a></li>

    <li class="nav-header">Карты</li>
    <li id="transfer-action"><a href="/transfer.action">Переводы между картами</a></li>
    <li id="cardinfo-action"><a href="#">Мои карты</a></li>

    <li class="nav-header">Сервис</li>
    <li id="pass-action"><a href="/changePassword.action">Поменять пароль</a></li>
    <li id="clogin-action"><a href="/changeLogin.action">Смена логина</a></li>
</ul>
