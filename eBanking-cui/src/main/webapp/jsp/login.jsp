<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<head>
    <link rel="stylesheet" href="../css/normalize.css">
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/common.css">
    <title>Login</title>
</head>
<body>

    <div class="container login-container">

        <form class="form-signin" action="<c:url value='j_spring_security_check'/>" method="POST">
            <h3 class="form-signin-heading">Please sign in</h3>
            <input type="text" name="j_username" class="input-block-level" placeholder="Email address">
            <input type="password" name="j_password" class="input-block-level" placeholder="Password">
            <button class="btn btn-big btn-primary" type="submit">Sign in</button>
        </form>

    </div>

    <script type="text/javascript" src="../js/jquery-1.8.2.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
</body>
</html>