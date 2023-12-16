<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<h1>새로운 친구 추가</h1>
<form action="addok" method="post">
    <table id="edit">
        <tr><td>카테고리</td><td><input type="text" name="category"/></td></tr>
        <tr><td>이름</td><td><input type="text" name="name"/></td></tr>
        <tr><td>성별</td><td><input type="text" name="gender"/></td></tr>
        <tr><td>생년월일</td><td><input type="date" name="birthDate"/></td></tr>
        <tr><td>나이</td><td><input type="number" name="age"/></td></tr>
        <tr><td>전화번호</td><td><input type="tel" name="phoneNumber"/></td></tr>
        <tr><td>이메일</td><td><textarea cols="50" rows="5" name="email"></textarea></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>
</body>
</html>