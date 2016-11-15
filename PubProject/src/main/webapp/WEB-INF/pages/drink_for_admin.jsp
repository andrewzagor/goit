<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 06.11.2016
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="\resources\css\style_emp_a.css" media="screen" />
    <title>Drink Admin</title>
</head>
<body>
<form:form method="post" action="add_drink" commandName="drink">

    <h2 align="center">Drink Administrator</h2>
    <table align="center">
        <tr>
            <td><form:label path="drink_name">
                Name
            </form:label></td>
            <td><form:input path="drink_name" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit"
                                                  value="Add drink" /></td>
        </tr>
    </table>
</form:form>

<c:if test="${!empty drink_for_admin}">
    <table class="data" align="center">
        <tr>
            <th>Name Drink</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${drink_for_admin}" var="drinkA">
            <tr>
                <td>${drinkA.drink_name}
                <td><a href="deleteDrink/${drinkA.id}">Delete</a></td>
                <td><a href="/update_drink?iddrinkupd=${drinkA.id}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<td>
    <a href="/pubmenu_for_admin"><p style="text-align: center">Exit</p></a>
</td>

</body>
</html>
