<%@page import="com.multi.vo.MDBoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<%@page import="com.multi.dao.MDBoardDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	int seq = Integer.parseInt(request.getParameter("seq"));
	String title = request.getParameter("title");
	String content =request.getParameter("content");
	MDBoardVo vo = new MDBoardVo(seq, title, content);
	
	MDBoardDao dao = new MDBoardDao();
	int res = dao.update(vo);


	if(res > 0){	
%>

	<script type="text/javascript">
		alert("글 수정에 성공 하였습니다.")
		location.href="boarddetail.jsp?seq=<%=seq%>";
	</script>

<%
	}else{
%>
	<script type="text/javascript">
		alert("글 수정에 실패 하였습니다.")
		location.href="boarddetail.jsp?seq=<%=seq%>";
	</script>
<%		
	}
%>

</body>
</html>