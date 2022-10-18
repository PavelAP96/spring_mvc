<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pavelpahomkin
  Date: 18.10.2022
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYpE html>
<html>
<head>
    <title>All Employees</title>
</head>
<body>
    <h2>All Employees</h2>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Operations</th>
        </tr>
        <c:forEach var="emp" items="${allEmps}">
            <c:url var="update" value="/emp/update">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>
            <c:url var="delete" value="/emp/delete">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="Update" onclick="window.location.href = '${update}'"/>
                    <input type="button" value="Delete" onclick="window.location.href = '${delete}'">
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <input type="button" value="Add" onclick="window.location.href = 'add'">
</body>
</html>
