<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>


<head>
    <meta charset="utf-8">

    <title>Login</title>
</head>
<body>
<jsp:include page="login.jsp" />

    <h1>LOGIN</h1>
    <p>Please fill in this form to log</p>
    <hr>
        <%--@elvariable id="form-signin" type=""--%>
        <form:form action="/login" modelAttribute="login" method="post">

        <div class="form-group ${error != null ? 'has-error' : ''}">

            <%--@declare id="login"--%><%--@declare id="password"--%>
            <span>${message}</span>
                <form:input type="hidden" path="login"/><br>

                <form:label path="text">Login:</form:label>
                <form:input path="text"/><br>

                <form:label path="password">Password:</form:label>
                <form:input path="password"/><br>

            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <hr>
            <button type="submit" class="registerbtn">Login</button>
            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a> </h4>

        </div>
        </form:form>

</body>

</html>