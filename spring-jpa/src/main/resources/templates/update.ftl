<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Person List</title>
</head>
<body>
<form action="/postUpdate" method="post">
    <input type="hidden" name="id" value="${person.id}">
    <input type="text" name="name" value="${person.name}" placeholder="First name"><br>
    <input type="text" name="family" value="${person.family}" placeholder="Last name"><br>
    <input type="submit" value="Save"/>
</form>
</body>
</html>