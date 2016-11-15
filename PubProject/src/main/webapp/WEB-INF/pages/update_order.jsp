<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 14.11.2016
  Time: 23:32
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
<h1 align="center">Edit Order</h1>
<c:url var="saveUrl" value="/update_order?id=${orderAttribute.id}" />
<form:form align="center" modelAttribute="orderAttribute" method="POST" action="${saveUrl}">
    <table align="center">
        <tr>
            <td>Id:</td>
            <td><input type="text" value="id" disabled="true"/>
        </tr>

        <tr>
            <td><form:label path="name_beer">Name</form:label></td>
            <td><form:input path="name_beer"/></td>
        </tr>
        <tr>
            <td><form:label path="count">Count</form:label></td>
            <td><form:input path="count"/></td>
        </tr>
        <tr>
            <td><form:label path="price">Price</form:label></td>
            <td><form:input path="price"/></td>
        </tr>
        <tr>
    </table>
    <input type="submit" value="Save" />
</form:form>
</body>
</html>
