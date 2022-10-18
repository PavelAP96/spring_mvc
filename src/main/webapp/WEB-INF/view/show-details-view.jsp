<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Show Details</title>
</head>
<body>
<%--    Your Name: ${param.get("empName")}--%>
    Name: ${employee.name}
    <br>
    Name: ${employee.surname}
    <br>
    Name: ${employee.salary}
    <br>
    Department: ${employee.department}
    <br>
    Car: ${employee.carBrand}
    <br>
    Lang:
    <ul>
        <c:forEach var="lang" items="${employee.languagesArray}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
    <br>
    Telephone: ${employee.telephone}
    <br>
    Email: ${employee.email}
    <br>
    <a href="details">Back</a>
</body>
</html>
