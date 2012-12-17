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

    <li class="nav-header">Clients</li>
    <li id="payment-action"><a href="/clients.action">View clients</a></li>

</ul>
