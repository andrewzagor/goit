<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 19.10.2016
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/css/reset.css" type="text/css" media="all">
    <link rel="stylesheet" href="/resources/css/layout.css" type="text/css" media="all">
    <link rel="stylesheet" href="/resources/css/style.css" type="text/css" media="all">
</head>
<body id="page2">
<div class="body-bg wrap">
    <!-- header -->
    <header>
        <div class="container">
            <h1><a href="index.html">Zur Alten Ziegelh</a></h1>
            <div class="indent">
                <p align="center"><table>
                <tr>
                    <th>Name</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th>Volume</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th>Price</th>
                    <th>&nbsp;&nbsp;&nbsp;</th>
                    <th></th>
                </tr>
                <tr>
                    <td>${PubMenuDark.name}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td align="center">${PubMenuDark.volume}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td align="center">${PubMenuDark.price}</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td>&nbsp;&nbsp;&nbsp;</td>
                    <td>${PubMenuDark.description}</td>
                </tr>
            </table>
                <p align="center">
            </div>
        </div>

    </header>
</div>
</body>
</html>
