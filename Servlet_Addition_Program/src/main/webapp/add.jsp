<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Addition Program in Java</title>
</head>
<style>
*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	}
	body
	{
		color:white;
		background-color:red;
		display:flex;
		justify-content:center;
		align-items:center;
		width:100vw;
		height:100vh;
		padding:10px;
	}
</style>
<body>
	<h1>Addition Program in Java</h1>
	<%
		// Get the input values from the HTML form
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		// Call the Addition class to calculate the sum
		Addition add = new Addition();
		int sum = add.add(num1, num2);

		// Display the result
		out.println("<p>The sum of " + num1 + " and " + num2 + " is " + sum + ".</p>");
	%>
</body>
</html>
