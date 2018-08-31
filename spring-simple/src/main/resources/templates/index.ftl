<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Person List</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Family</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <#list persons as p>
    <tr>
        <td>${p.name}</td>
        <td>${p.family}</td>
        <td><a href="/getPerson?id=${p?index}">update</a></td>
        <td><a href="/getDelete?id=${p?index}">delete</a></td>
    </tr>
    </#list>
</table>
<br>
<a href="/getRegister">Register new person ?</a>
</body>
</html>