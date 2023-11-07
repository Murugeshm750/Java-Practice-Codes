 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Customer Registration</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<h2>Register here</h2><br>
    <div class="register">
        <form method="post" action="reg">
            <label><b>User Name <span style="color: red;">*</span>
            </b>
            </label>	<br>
            <input type="text" name="uname" id="textBox" placeholder="Username" required>
            <br>
            <label><b>Email <span style="color: red;">*</span>
            </b>
            </label>	<br>
            <input type="text" name="mail" id="textBox" placeholder="Email" required>
            <br>
            <label><b>Password <span style="color: red;">*</span>
            </b>
            </label>	<br>
            <input type="Password" name="pass" id="textBox" placeholder="Password" required>
            <br>
            <label><b>Gender <span style="color: red;">*</span>
            </b>
            </label>	<br>
                  <div class="select">
                    <input type="radio" name="gender" value="male"> Male   
                    <input type="radio" name="gender" value="female"> Female 
                    <input type="radio" name="gender" value="other"> Other
                  </div> 
            
            <label><b>Address <span style="color: red;">*</span>
            </b>
            </label>	<br>
            <textarea rows="2" cols="20" id="textBox" class="form-control" name="address" required></textarea>
            <br><br>
            <input type="submit" id="sub" value="Register">
            <br><br>
            <a href="login.jsp">Already registered? <span>Sign in instead</span></a>
        </form>
</div>
</body>
</html>