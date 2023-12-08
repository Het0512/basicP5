<%--
  Created by IntelliJ IDEA.
  User: junghwan
  Date: 12/8/23
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        img, label {display: inline-block;}
        label {width: 130px}
        button {background-color: blue; color: white; font-size: 15px}
    </style>
</head>
<body>
<div style='width:100%; text-align: center; padding-top: 100px'>
    <img src="../img/Bible_verse.jpeg" height="400" alt="데살로니가전서 5:16-18">
    <form method="post" action="loginOk">
        <div><label>User ID: </label><input type="text" name="userid"/></div>
        <div><label>Password: </label>
        <input type="password" name="password"/></div>
        <button type="submit">login</button>
    </form>
</div>
</body>
</html>
