<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ask Detail</title>
</head>
<body>
<h1>Write your details</h1>
<%--    <form action="showDetails" method="get">--%>
<%--        <input type="text" name="empName" placeholder="Write your name"/>--%>
<%--        <input type="submit"/>--%>
<%--    </form>--%>
<form:form action="showDetails" modelAttribute="employee">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department: <form:select path="department">
<%--    <form:option value="Information Technologies" label="IT"/>--%>
<%--    <form:option value="HR" label="HR"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    <br>
    Car: <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--    BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    MB<form:radiobutton path="carBrand" value="MB"/>--%>
    <br>
    <br>
    Lang: <form:checkboxes path="languagesArray" items="${employee.languages}"/>
<%--    EN <form:checkbox path="languagesArray" value="English"/>--%>
<%--    DE <form:checkbox path="languagesArray" value="Deutsch"/>--%>
    <br>
    <br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    Telephone: <form:input path="telephone"/>
    <form:errors path="telephone"/>
    <br>
    <br>
    <input type="submit" value="OK!">
</form:form>
</body>
</html>
