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

    <title>Welcome</title>

</head>
<body>
<div class="container">

    <h1>Welcome</h1>

    <c:if test="${pageContext.request.userPrincipal.login != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} |
            <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

    </c:if>

    <h4 class="text-center"><a href="${contextPath}/addDamage"> Add damage </a> </h4>
    <h4 class="text-center"><a href="${contextPath}/damages"> Damage list </a> </h4>

</div>

</body>
</html>