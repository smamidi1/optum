<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
</head>
<body>
<center><h1>Register here</h1></center>
<form:form method="POST" action="/loadHome" modelAttribute="student">
			<div style="margin-left:30%;height:600px;">
				<table style="align:center;height:300px;width:400px;">
					
					<tr>
						<td><b>Student Name :</b></td>
						<td><form:input path="StudentName"/></td>
					</tr>
					<tr>
						<td><b>Student Email :</b></td>
						<td><form:input path="StudentEmail" required></form:input></td>
					</tr>
					<tr>
						<td><b>Phone Number :</b></td>
						<td><form:input path="phoneNum" ></form:input></td>
					</tr>
					<tr>
						<td><b>Class Id :</b></td>
						<td><form:input path="classId" ></form:input></td>
					</tr>
					
					<tr>
						<td colspan="2"><input type="submit" value="Submit"></td>
					</tr>
				</table>
				</div>
			</form:form>
</body>
</html>