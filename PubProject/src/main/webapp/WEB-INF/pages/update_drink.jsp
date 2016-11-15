<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 06.11.2016
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="\resources\css\style_emp_a.css" media="screen" />
</head>
<body>
<h1 align="center">Edit Drink</h1>
<c:url var="saveUrl" value="/update_drink?id=${drinkAttribute.id}" />
<form:form align="center" modelAttribute="drinkAttribute" method="POST" action="${saveUrl}">
    <table align="center">
        <tr>
            <td>Id:</td>
            <td><input type="text" value="id" disabled="true"/>
        </tr>

        <tr>
            <td><form:label path="drink_name">Name</form:label></td>
            <td><form:input path="drink_name"/></td>
        </tr>
        <tr>
    </table>
    <input type="submit" value="Save" />
</form:form>
</body>
</html>
