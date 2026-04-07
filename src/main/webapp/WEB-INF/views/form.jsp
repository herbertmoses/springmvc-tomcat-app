<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h2>User Form</h2>

<form:form action="submit" method="post" modelAttribute="user">

    Name: <form:input path="name"/>
    <form:errors path="name" style="color:red"/><br><br>

    Email: <form:input path="email"/>
    <form:errors path="email" style="color:red"/><br><br>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>