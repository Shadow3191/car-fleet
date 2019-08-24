<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="utf-8">
    <title>Registration</title>
</head>
<body>
<form:form action="" method="post" modelAttribute="driverForm">
    <div class="container">
        <h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>

        <form:label path="login"><b>Login</b></form:label>
        <form:input path="login" type="text" placeholder="Enter Login" name="login" required=""/>

        <form:label path="email"><b>Email</b></form:label>
        <form:input path="email" type="text" placeholder="Enter Email" name="email" required=""/>

        <form:label path="password"><b>Password</b></form:label>
        <form:input path="password" type="password" placeholder="Enter Password" name="password" required=""/>

        <form:label path="password"><b>Repeat Password</b></form:label>
        <form:input path="passwordConfirm" type="password" placeholder="Repeat Password" name="password" required=""/>
        <hr>
        <button type="submit" class="registerbtn">Register</button>
    </div>
</form:form>
</body>
</html>