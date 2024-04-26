<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%> 


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>상세 페이지</h1>
    <hr>
    <ul>
        <li>게시물번호 : ${dto.bno}</li>
        <li>게시물제목 : ${dto.title}</li>
        <li>게시물내용 : ${dto.content}</li>
        <li>작성자 : ${dto.writer}</li>
        <li>작성일자 : ${dto.regdate}</li>
        <li><a href="/delete?bno=${dto.bno}">삭제하기</a></li>
        <li><a href="/list">목록보기</a></li>
    </ul>
</body>
</html>