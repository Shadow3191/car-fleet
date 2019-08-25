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
    <title>Damages</title>
</head>

<body>
    <h1>Damages</h1>

    <form:form method="post" modelAttribute="damagesList">

        <div class="container">

            <c:forEach items="${damagesList}" var="damage">
                <table cellspacing="0" cellpadding="0" border="2" style="width: 25%;">
                    <tr>
                        <th>l.p</th>
                        <th>Damage Type</th>
                        <th>Drivable</th>
                        <th>Description</th>
                    </tr>

                    <tbody>
                    <tr>
                        <td>${damage.id}</td>
                        <td>${damage.damageType}</td>
                        <td>${damage.drivable}</td>
                        <td>${damage.description}</td>
                    </tr>
                    </tbody>
                </table>
            </c:forEach>

            <h4 class="text-center"><a href="${contextPath}/welcome">Back to welcome list </a> </h4>
            <h4 class="text-center"><a href="${contextPath}/adddamage">Add new damage </a> </h4>

        </div>
    </form:form>
</body>
</html>

