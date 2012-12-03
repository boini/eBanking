<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<head>
    <link rel="stylesheet" href="../css/normalize.css">
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/common.css">
    <title>Login</title>
</head>
<body>

    <div class="container login-container">

        <s:form cssClass="form-signin" action="/j_spring_security_check" method="post">
            <h3 css="form-signin-heading">Please sign in</h3>
            <s:textfield name="j_username" cssClass="input-block-level" placeholder="Login" />
            <s:password name="j_password" cssClass="input-block-level" placeholder="Password" />
            <s:submit cssClass="btn btn-big btn-primary" label="Sign In" />
        </s:form>

    </div>

    <script type="text/javascript" src="../js/jquery-1.8.2.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
</body>
</html>