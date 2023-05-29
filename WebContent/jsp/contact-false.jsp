<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../header.html" %>

<%@page import="bean.Form" %>

<% Form form=(Form)request.getAttribute("form"); %>
<p>氏名：<%=form.getName() %></p>
<p>会社：<%=form.getCompany() %></p>
<p>メールアドレス：<%=form.getMail() %></p>
<p>お問合せ内容</p>
<%=form.getContent() %><br>
<% if(form.getMagazines() != null)  { %>
	<p>配信を希望するメールマガジン</p>
	<% for(String s : form.getMagazines()) { %>
		・<%=s %><br>
	<% } %>
<% }else { %>
	<p>メールマガジンの配信を希望しない。</p>
<% }  %>
<p>資料請求を希望：<%=form.getInformation() %></p>

<%@ include file="../footer.html" %>