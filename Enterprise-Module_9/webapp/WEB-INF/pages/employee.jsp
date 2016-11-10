<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 20.10.2016
  Time: 6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/css/reset.css" type="text/css" media="all">
    <link rel="stylesheet" href="/resources/css/layout.css" type="text/css" media="all">
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css" media="all">
</head>
<body id="employee">
<div class="body-bg wrap">
    <!-- header -->
    <header>
        <div class="container">
            <h1><a href="index.html">Zur Alten Ziegelh</a></h1>
            <div class="indent">
                <p align="center"><table>
                <tr>
                    <th>First Name</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th>Second Name</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th>Position</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th>Birthday</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th></th>
                </tr>
                <c:forEach items="${employee}" var="Employee">
                <tr>
                    <td>${Employee.first_name}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td align="center">${Employee.last_name}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td align="center">${Employee.position}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td align="center">${Employee.birthday}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <c:if test="${Employee.id==2}">
                        <td><img src="/resources/image/id=2.jpg"/></td>
                    </c:if>
                    <c:if test="${Employee.id==1}">
                        <td><img src="/resources/image/id=1.jpg"/></td>
                    </c:if>
                    <c:if test="${Employee.id==3}">
                        <td><img src="/resources/image/id=3.jpg"/></td>
                    </c:if>
                    <c:if test="${Employee.id==4}">
                        <td><img src="/resources/image/id=4.jpg"/></td>
                    </c:if>
                    <c:if test="${Employee.id==5}">
                        <td><img src="/resources/image/id=5.jpg"/></td>
                    </c:if>
                </tr>
                </c:forEach>
            </table>
                <p align="center">
            </div>
        </div>

    </header>
</div>
</body>
</html>
