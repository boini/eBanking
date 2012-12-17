<script>
    $(document).ready(function(){
        var selector = "#" + $("#actionName").text();
        $(selector).addClass("active");
    });
</script>
<div id="menu-header">
    <h5>Choose action</h5>
</div>
<ul class="nav nav-list">
    <li id="main-action"><a href="/main.action">Main page</a></li>

    <li class="nav-header">Bank statements</li>
    <li id="info-action"><a href="/onlineInfo.action">Online info</a></li>
    <li id="card-action"><a href="/cardAccountInfo.action">Bank statement by card accounts</a></li>

    <li class="nav-header">Payments</li>
    <li id="payment-action"><a href="/payment.action">Pay for services</a></li>
    <li id="history-action"><a href="/clientOperationHistory.action">Archive of operations</a></li>

    <li class="nav-header">Cards</li>
    <li id="transfer-action"><a href="/transfer.action">Transfers between cards</a></li>

    <li class="nav-header">Service</li>
    <li id="pass-action"><a href="/changePassword.action">Change password</a></li>
    <li id="clogin-action"><a href="/changeLogin.action">Change login</a></li>
</ul>
