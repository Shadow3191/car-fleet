<%--
  Created by IntelliJ IDEA.
  User: patryk
  Date: 22.08.2019
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Car</title>
</head>
<body>
 <h1>Dodaj auto</h1>
<form modelAttribute="carForm" method="post">

    <label for="carModel"><b>Model</b></label>
    <input type="text" placeholder="Podaj model" name="carModel" required><p></p>

    <label for="initialMileage"><b>Początkowy stan licznika</b></label>
    <input type="text" placeholder="stan początkowy licznika" name="initialMileage" required><p></p>

    <label for="finaleMileage"><b>Końcowy stan licznika</b></label>
    <input type="text" placeholder="Enter final milage" name="finaleMileage" required><p></p>

    <label for="vinNr"><b>Numer VIN</b></label>
    <input type="text" placeholder="Podaj nr VIN" name="vinNr" required><p></p>

    <label for="amountOfFuel"><b>Stan paliwa</b></label>
    <input type="amountOfFuel" placeholder="stan paliwa" name="amountOfFuel" required><p></p>
    <hr>
 <button type="submit" class="registerbtn">Register</button>
 </form>
</body>
</html>
