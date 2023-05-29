<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet/JSP Test</title>
</head>
<body>
<h1>お問合せフォーム</h1>
<form action="../servlet/contact" method="post">
	<p>氏名 <input type="text" name="name" required></p>
	<p>会社 <input type="text" name="company"></p>
	<p>メールアドレス <input type="email" name="mail" required></p>
	<p>お問合せ内容</p>
	<p><textarea name="content" cols=30 rows=5 required></textarea></p>
	<p>受信を希望するメールマガジンを選択してください。</p>
	<p>
	<input type="checkbox" name="magazine" value="総合案内">総合案内
	<input type="checkbox" name="magazine" value="セミナー案内">セミナー案内
	<input type="checkbox" name="magazine" value="求人採用案内">求人採用案内
	</p>
	<p>資料請求を希望されますか？</p>
	<p>
	<input type="radio" name="information" value="Yes" checked>Yes
	<input type="radio" name="information" value="No">No
	</p>
	<p><input type="submit" value="送信"></p>
</form>

</body>
</html>