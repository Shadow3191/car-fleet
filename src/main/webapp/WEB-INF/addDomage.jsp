<%@ page import="pl.groupproject.carfleet.repository.DamageRepository" %>
<%@ page import="pl.sda.user.model.DamageType" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="utf-8">
    <title>Add Domage</title>
</head>
<body>
<form:form method="post">
    <div class="container">

        <h1>Domage</h1>
        <p>Please fill in this form to create a new car domage.</p>
        <hr>
        <label for="damageType"><b>Damage Type</b></label>
        <input type="text" placeholder="Enter damageType" name="damageType" required><p></p>
        <select name="damageType">
            <option>${damageType.ENGINE}</option>
            <option>${damageType.CARSHEET}</option>
            <option>${damageType.WHEEL}</option>
            <option>${damageType.GLASS}</option>
        </select>

        <label for="description"><b>Description</b></label>
        <input type="text" placeholder="Enter description" name="description" required><p></p>

        <label for="drivable"><b>Drivable?</b></label>
        <input type="text" placeholder="Drivable T/F" name="drivable" required><p></p>

        <label path="login"><b> ...  </b></label>
        <input path="login" type="text" placeholder="Enter Login" name="login"/><br>

        <hr>
        <input type="submit" class="registrationDomage" value="RegisterDomage">
    </div>
</form:form>
</body>
</html>

<%--damageType -pole wyboru z enum--%>
<%--description--%>
<%--drivable -pole wyboru--%>