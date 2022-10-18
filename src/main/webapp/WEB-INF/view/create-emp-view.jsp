<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pavelpahomkin
  Date: 18.10.2022
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Create employee</title>
</head>
<body>
  <h2>Create Employee</h2>
  <br>
  <form:form modelAttribute="employee" action="save">
    <form:hidden path="id"/>
    Name: <form:input path="name"/>
      <br>
      Surname: <form:input path="surname"/>
      <br>
      Department: <form:input path="department"/>
      <br>
      Salary: <form:input path="salary"/>
      <br>
      <input value="Save" type="submit">
  </form:form>

</body>
</html>
