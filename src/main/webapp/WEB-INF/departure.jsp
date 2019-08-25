<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Departure</title>
</head>
<body>
<h1>Add departure</h1>
<form modelAttribute="departure" method="post">

    <label for="depFrom"><b>Departure from</b></label>
    <input type="text" placeholder="from" name="depFrom" required><p></p>

    <label for="depTo"><b>Departure to</b></label>
    <input type="text" placeholder="to" name="depTo" required><p></p>

    <label for="distance"><b>Distance</b></label>
    <input type="text" placeholder="Distance" name="distance" required><p></p>

    <button type="submit" class="register">Save</button>
</form>
</body>
</html>