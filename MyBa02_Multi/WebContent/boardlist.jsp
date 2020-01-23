<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<%@page import="com.multi.dao.MDBoardDao"%>
<%@page import="com.multi.vo.MDBoardVo"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<script type="text/javascript">
	function allChk(chk){
		var chks = document.getElementsByName("chk");
		for(var i=0 ; i<chks.length ; i++){
			chks[i].checked = chk;	
		}
	}
</script>

	<%
		MDBoardDao dao = new MDBoardDao();
		List<MDBoardVo> list = dao.selectAll();
	%>
	<h1>글 목록(주히딘)</h1>
	<form action="muldel.jsp" method="post" id="muldelform">
		<table border="1">
			<col width="30px">
			<col width="50px">
			<col width="100px">
			<col width="300px">
			<col width="100px">
			<tr>
				<th><input type="checkbox" name="all" onclick="allChk(this.checked)"></th>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>작성일</th>
			</tr>
<%
	if(list.size() == 0){
%>					
			<tr>
				<td colspan="5">-----------작성된 글이 없습니다.-----------</td>	
			</tr>
<%
	}else{
		for(int i=0; i<list.size(); i++){
%>			
			
			<tr>
				<td><input type="checkbox" name="chk" value="<%=list.get(i).getSeq()%>"></td>
				<td><%=list.get(i).getSeq() %></td>
				<td><%=list.get(i).getWriter()%></td>
				<td><a href="boarddetail.jsp?seq=<%=list.get(i).getSeq()%>"><%=list.get(i).getTitle() %></a></td>
				<td><%=list.get(i).getRegdate() %></td>
			</tr>
			
<%
		}
	}
%>				
			<tr>
				<td colspan="5" align="right">
					<input type="button" value="글쓰기" onclick="location.href='boardwrite.jsp'">
					<input type="submit" value="선택한 글 삭제">
				</td>
			</tr>		
		</table>
	</form>
	
	<script type="text/javascript">
		
		
		
	</script>
	
	
	
	
</body>
</html>