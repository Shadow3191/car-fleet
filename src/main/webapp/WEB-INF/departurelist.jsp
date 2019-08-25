<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Departures</title>
</head>
<body>
<h1>Departures</h1>


<c:forEach items="${departureForm}" var="departure">
    <table cellspacing="0" cellpadding="0" border="4" style="width: 25%;">
        <tbody>
        <tr>
            <td>${departure.id}</td>
            <td>${departure.depFrom}</td>
            <td>${departure.depTo}</td>
            <td>${departure.distance}</td>
        </tr>
        </tbody>
    </table>
</c:forEach>

</body>
</html>