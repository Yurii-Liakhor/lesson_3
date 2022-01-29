<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Car Information</h2>
<form:form method = "POST" action = "/004_Samples_war_exploded/add_car">
    <table>
        <tr>
            <td><form:label path = "manufacturer">Manufacturer</form:label></td>
            <td><form:input path = "manufacturer" /></td>
        </tr>
        <tr>
            <td><form:label path = "model">Model</form:label></td>
            <td><form:input path = "model" /></td>
        </tr>
        <tr>
            <td><form:label path = "year">Year</form:label></td>
            <td><form:input path = "year" /></td>
        </tr>
        <tr>
            <td>
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
