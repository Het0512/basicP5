<%--
  Created by IntelliJ IDEA.
  User: 한은택
  Date: 2023-12-01
  Time: 오후 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>친구 수정</title>
</head>
<body>
<h1>Edit Form</h1>
<form action="../editok" method="POST">
    <input type="hidden" name="seq" value="${u.seq}" />
    <table id="edit">
        <tr><td>카테고리</td><td><input type="text" name="category" value="${u.category}" /></td></tr>
        <tr><td>이름</td><td><input type="text" name="name" value="${u.name}" /></td></tr>
        <tr><td>성별</td><td><input type="text" name="gender" value="${u.gender}" /></td></tr>
        <tr><td>생년월일</td><td><input type="date" name="birthDate" value="${u.birthDate}" /></td></tr>
        <tr><td>나이</td><td><input type="number" name="age" value="${u.age}" /></td></tr>
        <tr><td>전화번호</td><td><input type="tel" name="phoneNumber" value="${u.phoneNumber}" /></td></tr>
        <tr><td>이메일</td><td><textarea cols="50" rows="5" name="email">${u.email}</textarea></td></tr>
    </table>
    <input type="submit" value="수정하기" />
    <input type="button" value="취소하기" onclick="history.back()" />
</form>
</body>
</html>