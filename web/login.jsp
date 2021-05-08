<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:actionerror/>
----------------------
<s:fielderror/>
<form action="login.action">

    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    age:<input type="text" name="age"><br>
    birthday:<input type="text" name="birthday"/> <br>

    <input type="submit" value="submit"/>


</form>

</body>
</html>
