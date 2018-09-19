<%--
  Created by IntelliJ IDEA.
  User: kamil
  Date: 19.09.18
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Hardware</title>
</head>
<body>
    <h1>Welcome admin</h1>
    <h2>Lets add some hardware</h2>

    <form:form method="post" modelAttribute="hardware">
        <div>
            <form:label path="serial">Serial</form:label>
            <form:input path="serial"></form:input>
            <form:errors path="serial"></form:errors>
        </div>
        <div>
            <form:label path="type">Type</form:label>
            <form:select path="type" items="types"></form:select>
            //how to?
        </div>
    </form:form>
</body>
</html>
