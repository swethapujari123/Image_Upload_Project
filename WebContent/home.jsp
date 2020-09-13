<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>image upload</h1>
<table>
<form action="./imageUpload" method="post">
<tr>
<td> ID </td> <td><input type ="text" name="id"/></td></tr>
<tr><td>image upload</td> <td><input type="file" name="image"/></td></tr>
<tr><td colspan="2"><input type="submit" value="upload"/></td></tr>

</form>
</table>
</center>
</body>
</html>