<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<font color="blue"><h2>用户注册</h2></font>
<s:actionerror cssStyle="color: red;size: 12px"/>
----------------------------------------------------
<s:fielderror cssStyle="color: blue"/>
<!--
<form action="register.action">
    username:<input type="text" name="username" size="20"><br>
    password:<input type="password" name="password" size="20"/><br>
    repassword:<input type="password" name="repassword" size="20"/><br>
    age:<input type="text" name="age" size="20"/><br>
    birthday:<input type="text" name="birthday" size="20"/> <br>
    graduation:<input type="text" name="graduation" size="20"/> <br>
    <input type="submit" value="submit">
</form>
-->
<s:form action="register" theme="simple">
   username:<s:textfield name="username" label="username"/><br>
    password:<s:password name="password" label="password"></s:password><br>
    repassword:<s:password name="repassword" label="repassword"/><br>
    age:<s:textfield name="age" label="age"/><br>
    birthday:<s:textfield name="birthday" label="birthday"/><br>
    graduation:<s:textfield name="graduation" label="graduation"/><br>
    <s:submit value="submit"/>
</s:form>

</body>
</html>
