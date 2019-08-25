
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Damage</title>
</head>
<body>
<h1>Add Damage</h1>
<form modelAttribute="damage" method="post">

    <label for="description"><b>Damage</b></label>
    <input type="text" placeholder="Damage" name="description" required><p></p>

    <label for="damageType"><b>DamageType</b></label>
    <%--<input type="text" placeholder="DamageType" name="damageType" required><p></p>--%>
    <select name="damageType">
        <option> ENGINE </option>
        <option> CARSHEET </option>
        <option> WHEEL </option>
        <option> GLASS </option>
    </select>
    <p></p>

    <label for="drivable"><b>Drivable</b></label>
    <%--<input type="text" placeholder="Drivable" name="drivable" required><p></p>--%>
    <select name="drivable">
    <option> true </option>
    <option>  false </option>
    </select>

    <p></p>
    <button type="submit" class="registerbtn"> Create </button>
</form>
</body>
</html>
