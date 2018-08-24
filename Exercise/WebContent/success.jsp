<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> success </h1>


<h3> My name is ${email}</h3>
<!-- OR -->
<h3> <%= request.getSession().getAttribute("email") %> </h3>


<h3> My name is <%= getServletContext().getAttribute("email") %> </h3>
</body>
</html>