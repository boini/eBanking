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
    <li id="clients-action"><a href="/clients.action">View clients</a></li>

    <li class="nav-header">Corporations</li>
    <li id="corporations-action"><a href="/corporations.action">View corporations</a></li>

    <li class="nav-header">Rates</li>
    <li><a href="/rate.action">Change rates</a></li>

    <li class="nav-header">Logs</li>
    <li id="appLog-action"><a href="/appLog.action">App logs</a></li>

</ul>
