<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2/13/2018
  Time: 8:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty vardas}">
<div>name : ${vardas}</div>
</c:if>
<div>surname : ${pavarde}</div>
    <c:choose>
    <c:when test = "${amzius > 18}">
        <div>Tu zinok esi senas ${vardas}</div>
        </c:when>
        <c:otherwise>Vis dar jauniklis${vardas}
        </c:otherwise>
    </c:choose>

<div>age :${amzius}</div>
<div>city :${miestas}</div>
<div>car :${automobilis}</div>

</body>
</html>
