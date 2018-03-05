<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" crossorigin="anonymous">

</head>
<body>

<table class="table table-striped">
<thead>
<tr>
    <th>ID</th>
    <th>NAME</th>
    <th>SURNAME</th>
    <th>PHONE</th>
    <th>EMAIL</th>
</tr>
</thead>
<tbody>
<c:forEach var="st" items="${studentList}">
    <tr>
        <td>${st.id}</td>
        <td>${st.name}</td>
        <td>${st.surname}</td>
        <td>${st.phone}</td>
        <td>${st.email}</td>
    </tr>
</c:forEach>
</tbody>
</table>

<%--js bibliotekos turi buti failo apacioje--%>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"  crossorigin="anonymous"></script>
</body>
</html>
