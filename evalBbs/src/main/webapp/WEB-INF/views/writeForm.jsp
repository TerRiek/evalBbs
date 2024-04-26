<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>글 작성하기 페이지</h1>
    <hr>
    <a href="/list">목록보기</a>
    <form action="/write" method="post">
        <input type="text" name="title" placeholder="게시물제목">
        <input type="text" name="content" placeholder="게시물내용">
        <input type="text" name="writer" placeholder="작성자">
        <input type="text" name="regdate" placeholder="날짜">
        <input type="submit" value="글 작성하기">
    </form>
</body>
</html>