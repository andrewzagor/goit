<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 12.11.2016
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="\resources\css\style_emp_a.css" media="screen" />
    <title>Result filter</title>
</head>
<body>
<table class="data" align="center">
    <tr>
        <th>Name Product</th>
        <th>Count</th>
    </tr>
    <c:forEach items="${filter_storage}" var="storageF">
        <tr>
            <td>${storageF.name_product}
            <td>${storageF.count}
        </tr>
    </c:forEach>
</table>
</body>
</html>
