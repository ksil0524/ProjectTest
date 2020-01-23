<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<%@page import="com.multi.dao.MDBoardDao"%>
<%@page import="com.multi.vo.MDBoardVo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board Write</title>
</head>
<body>
	<h1>Board Write</h1>
	<form action="boardwrite_res.jsp" method="post">
		<table>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="60" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="작성완료">
					<input type="button" value="돌아가기" onclick="location.href='boardlist.jsp'">
				</td>
			</tr>
		
		
		</table>
		
		
	</form>
	
	
</body>
</html>