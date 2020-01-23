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
<title>Insert title here</title>
</head>
<body>

<%

	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String content =request.getParameter("content");
	MDBoardVo vo = new MDBoardVo(writer, title, content);
	
	MDBoardDao dao = new MDBoardDao();
	int res = dao.insert(vo);


	if(res > 0){	
%>

	<script type="text/javascript">
		alert("글 등록에 성공 하였습니다.")
		location.href="boardlist.jsp";
	</script>

<%
	}else{
%>
	<script type="text/javascript">
		alert("글 등록에 실패 하였습니다.")
		location.href="boardlist.jsp";
	</script>
<%		
	}
%>

</body>
</html>