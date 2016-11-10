<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="\resources\css\style_emp_a.css" media="screen" />
</head>
<body>

    <h2 align="center">Employee Administrator</h2>

<form:form method="post" action="add" commandName="employee">

    <table align="center">
        <tr>
            <td><form:label path="first_name">
                Name
            </form:label></td>
            <td><form:input path="first_name" /></td>
        </tr>
        <tr>
            <td><form:label path="second_name">
                Surname
            </form:label></td>
            <td><form:input path="second_name" /></td>
        </tr>
        <tr>
            <td><form:label path="birthday">
                Year of birth
            </form:label></td>
            <td><form:input path="birthday" /></td>
        </tr>
        <tr>
            <td><form:label path="position">
                Position
            </form:label></td>
            <td><form:input path="position" /></td>
        </tr>
        <tr>
            <td><form:label path="salary">
                Salary
            </form:label></td>
            <td><form:input path="salary" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit"
                                   value="Add employee" /></td>
        </tr>
    </table>
    </form:form>

<c:if test="${!empty employee_for_admin}">
    <table class="data" align="center">
        <tr>
            <th>Name</th>
            <th>Birthday</th>
            <th>Position</th>
            <th>Salary</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${employee_for_admin}" var="employeeA">
            <tr>
                <td>${employeeA.first_name}, ${employeeA.second_name}</td>
                <td>${employeeA.birthday}</td>
                <td>${employeeA.position}</td>
                <td>${employeeA.salary}</td>
                <td><a href="delete/${employeeA.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>