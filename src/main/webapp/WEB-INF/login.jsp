<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Login</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

</head>
<body>

    <div class="container">
        <h1>LOGIN</h1>
        <p>Please fill in this form to log</p>
        <hr>

        <form method="POST" action="${contextPath}/login" class="form-signin">
            <div class="form-group ${error != null ? 'has-error' : ''}">
                <span>${message}</span>

            <label for="login"><b>Login</b></label>
            <input type="text" placeholder="Enter Login" name="login" required autofocus="true">

            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" required>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <hr>
            <button type="submit" class="registerbtn">Login</button>

            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a> </h4>

    </div>
</form>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="${contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>