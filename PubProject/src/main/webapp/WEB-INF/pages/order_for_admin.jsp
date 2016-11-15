<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 14.11.2016
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="\resources\css\style_emp_a.css" media="screen" />
    <title>Order Admin</title>
</head>
<body>
<form:form method="post" action="add_order" commandName="order">

    <h2 align="center">Order Administrator</h2>
    <table align="center">
        <tr>
            <td><form:label path="name_beer">
                Beer Name
            </form:label></td>
            <td><form:input path="name_beer" /></td>
        </tr>
        <tr>
        <tr>
            <td><form:label path="count">
                Count
            </form:label></td>
            <td><form:input path="count" /></td>
        </tr>
        <tr>
        <tr>
            <td><form:label path="price">
                Price
            </form:label></td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit"
                                                  value="Add order" /></td>
        </tr>
    </table>
</form:form>

<c:if test="${!empty order_for_admin}">
    <table class="data" align="center">
        <tr>
            <th>Name Order</th>
            <th>&nbsp;</th>
            <th>Count</th>
            <th>&nbsp;</th>
            <th>Price</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${order_for_admin}" var="orderA">
            <tr>
                <td>${orderA.name_beer}
                <td>${orderA.count}
                <td>${orderA.price}
                <td><a href="deleteOrder/${orderA.id}">Delete</a></td>
                <td><a href="/update_order?idorderupd=${orderA.id}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<td>
    <a href="/pubmenu_for_admin"><p style="text-align: center">Exit</p></a>
</td>

</body>
</html>
