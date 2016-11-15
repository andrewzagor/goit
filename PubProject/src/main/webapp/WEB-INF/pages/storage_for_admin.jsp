<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 06.11.2016
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="\resources\css\style_emp_a.css" media="screen" />
    <title>Storage Admin</title>
</head>
<body>
<form:form method="post" action="add_storage" commandName="storage">

    <h2 align="center">Storage Administrator</h2>
    <table align="center">
        <tr>
            <td><form:label path="name_product">
                Name
            </form:label></td>
            <td><form:input path="name_product" /></td></tr>
        <tr><td><form:label path="count">
                Count
            </form:label></td>
            <td><form:input path="count" /></td></tr>
        <tr>
            <td colspan="2" align="center"><input type="submit"
                                                  value="Add product" /></td>
        </tr>
    </table>
</form:form>

<c:if test="${!empty storage_for_admin}">
    <table class="data" align="center">
        <tr>
            <th>Name Product</th>
            <th>Count</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${storage_for_admin}" var="storageA">
            <tr>
                <td>${storageA.name_product}
                <td>${storageA.count}
                <td><a href="deleteStorage/${storageA.id}">Delete</a></td>
                <td><a href="/update_storage?idstupd=${storageA.id}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>

<td>
    <a href="/pubmenu_for_admin"><p style="text-align: center">Exit</p></a>
</td>

</html>
