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
    <li><a href="/clients.action">View clients</a></li>

    <li class="nav-header">Rates</li>
    <li><a href="#">Change rates</a></li>

    <li class="nav-header">Logs</li>
    <li><a href="#">App logs</a></li>
    <li><a href="#">Account logs</a></li>

</ul>