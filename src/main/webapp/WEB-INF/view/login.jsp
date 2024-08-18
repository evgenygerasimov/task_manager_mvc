<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Security Example </title>
</head>
<body>


<form:form action="/auth" method="post" modelAttribute="user">
    <div><label> User Name : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form:form>
<br>
<br>
<input type="button" value="Registration"
       onclick="window.location.href = '/addNewUser'"/>
</body>
</html>