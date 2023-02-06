<%--
  Created by IntelliJ IDEA.
  User: UO271572
  Date: 06/02/2023
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container" id="main-container">
    <h2>Vista productos tienda</h2>
    <ul>
        <c:forEach var="item" items="${storeProduct}">
            <tr>
                <li>${item.name}</li>
            </tr>
        </c:forEach>
    </ul>
    <a href="index.jsp">Volver</a>
</div>
</body>
</html>
