<%--
  Created by IntelliJ IDEA.
  User: patryk
  Date: 22.08.2019
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auta</title>
</head>
<body>
    <h1>Auta</h1>

<%--     zrobic do tego tabelke--%>

        <c:forEach items="${carslist}" var="car">
                 <table cellspacing="0" cellpadding="0" border="4" style="width: 25%;">
                     <tbody>
                        <tr>
                            <td>${car.carModel}</td>
                            <td>${car.carsDto().vinNr}</td>
                            <td><a href="/cars" target="/cars"><button>${car.carsDto().reservation}</button></a><br></td>
                        </tr>
                     </tbody>
                 </table>
        </c:forEach>
</body>
</html>