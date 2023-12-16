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
    <title>자세히 보기</title>
</head>
<body>
<h1>Post Form</h1>
<form>
    <input type="hidden" name="seq" value="${u.seq}" />
    <table id="post">
        <tr><td>카테고리 : </td><td>${u.category}</td></tr>
        <tr><td>이름 : </td><td>${u.name}</td></tr>
        <tr><td>성별 : </td><td>${u.gender}</td></tr>
        <tr><td>나이(생년월일) : </td><td>${u.age}살 (${u.birthDate})</td></tr>
        <tr><td>전화번호 : </td><td>${u.phoneNumber}</td></tr>
        <tr><td>이메일 : </td><td>${u.email}</td></tr>
    </table>
    <a href="../editform/${u.seq}">글수정</a>
    <input type="button" value="뒤로가기" onclick="history.back()" />
</form>
</body>
</html>