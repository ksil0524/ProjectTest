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
<title>Board Detail</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<style type="text/css">
#updateform{
display: none;
}
</style>
</head>
<body>
<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	MDBoardDao dao = new MDBoardDao();
	MDBoardVo vo = dao.selectOne(seq);

%>

<script type="text/javascript">
	
	function updateFormView(){
		$("#detailform").hide();
		$("#updateform").show();
	}
	
	function detailFormView(){
		$("#updateform").hide();
		$("#detailform").show();
	}

</script>

	<div id="detailform">
	<h1>Board Detail</h1>
		<table border="1">
			<col width="100px;">
			<col width="400px;">
			<tr>
				<th>번호</th>
				<td><%=vo.getSeq() %></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><%=vo.getWriter() %></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><%=vo.getTitle() %></td>
			</tr>
			<tr>
				<th>작성날짜</th>
				<td><%=vo.getRegdate() %></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="60" readonly="readonly"><%=vo.getContent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<button onclick="updateFormView();">수정하기</button>
					<button onclick="location.href='boarddelete.jsp?seq=<%=vo.getSeq()%>'">삭제하기</button>
					<button onclick="location.href='boardlist.jsp'">돌아가기</button>
				</td>
			</tr>
		</table>
	</div>
	<div id="updateform">
		<h1>글 수정</h1>
		<form action="boardupdate_res.jsp" method="post">
		<input type="hidden" name="seq" value="<%=vo.getSeq() %>">
			<table border="1">
				<col width="100px;">
				<col width="400px;">
				<tr>
					<th>번호</th>
					<td><%=vo.getSeq() %></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><%=vo.getWriter() %></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" value="<%=vo.getTitle() %>"></td>
				</tr>
				<tr>
					<th>작성날짜</th>
					<td><%=vo.getRegdate() %></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="10" cols="60" name="content"><%=vo.getContent() %></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input type="submit" value="수정하기">
						<input type="button" value="취소" onclick="detailFormView();">
					</td>
				</tr>
			</table>
		</form>
	</div>




</body>
</html>