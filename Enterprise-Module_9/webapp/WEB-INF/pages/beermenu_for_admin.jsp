<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 05.11.2016
  Time: 22:05
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

<h2 align="center">Beer menu Administrator</h2>

<form:form method="post" action="add_beer" commandName="beer">

    <table align="center">
        <tr>
            <td><form:label path="name">
                Name
            </form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="kindOfBeer">
                Kind of Beer
            </form:label></td>
            <td><form:input path="kindOfBeer" /></td>
        </tr>
        <tr>
            <td><form:label path="volume">
                Volume
            </form:label></td>
            <td><form:input path="volume" /></td>
        </tr>
        <tr>
            <td><form:label path="price">
                Price
            </form:label></td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td><form:label path="description">
                Description
            </form:label></td>
            <td><form:input path="description" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit"
                                                  value="Add beer" /></td>
        </tr>
    </table>
</form:form>

<c:if test="${!empty beer_for_admin}">
    <table class="data" align="center">
        <tr>
            <th>Name</th>
            <th>Kind_of_beer</th>
            <th>Volume</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <c:forEach items="${beer_for_admin}" var="beerA">
            <tr>
                <td>${beerA.name}</td>
                <td>${beerA.kindOfBeer}</td>
                <td>${beerA.volume}</td>
                <td>${beerA.price}</td>
                <td>${beerA.description}</td>
                <td><a href="deleteBeer/${beerA.id}">Delete</a></td>
                <td><a href="/update_beer?idupd=${beerA.id}">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
