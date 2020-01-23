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
	
	MDBoardDao dao = new MDBoardDao();
	int res = dao.delete(seq);

	if(res > 0){	
%>
	<script type="text/javascript">
		alert("글 삭제에 성공 하였습니다.")
		location.href="boardlist.jsp";
	</script>

<%
	}else{
%>
	<script type="text/javascript">
		alert("글 삭제에 실패 하였습니다.")
		location.href="boarddetail.jsp?seq=<%=seq%>";
	</script>
<%		
	}
%>

</body>
</html>