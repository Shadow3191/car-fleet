
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

    <%--<label for="carModel"><b>Car Model</b></label>--%>
    <%--<select name="carModel">--%>
        <%--&lt;%&ndash;<option>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<c:forEach items="${carslist}" var="car">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<table cellspacing="0" cellpadding="0" border="4" style="width: 25%;">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<tbody>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<td>${car.carModel}</td>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;</tbody>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</table>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</c:forEach>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</option>&ndash;%&gt;--%>

    <%--</select>--%>


    <p></p>
    <button type="submit" class="registerbtn"> Create </button>
</form>
</body>
</html>
