<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


  <h3> Testing JSPs uploading </h3>
  
  <%
  int i =3;
  int j = 4;
  int k = i+j;
  out.print(k+" is the value of i+j");
  
   
  %>
  Another way for displaying k is : <%=k %>
  
  <% for (int f=0;f<5 ;f++){ %>
  <br> The value of i is <%= f %> 
  <%} %>
</body>
</html>