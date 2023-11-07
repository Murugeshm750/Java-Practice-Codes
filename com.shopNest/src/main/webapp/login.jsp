<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body{
    width: 100vw;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    background-color: #8EC5FC;
    background-image: linear-gradient(62deg, #8EC5FC 0%, #E0C3FC 100%);
    font-family: Arial, Helvetica, sans-serif;
}
.login
{
    width: 400px;
    height: 350px;
    padding: 20px;
    box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
    margin-top: 10px;

}
.login form
{
    position: relative;
}
.login .input label
{
    font-size: 20px;
}
.login .input input
{
    width: 100%;
    height: 30px;
    margin-top: 10px;
    border: none;
    outline: none;
    border-radius: 5px;
    padding-inline: 5px;
    margin-bottom: 5px;
}
.login #sub
{
    width: 100%;
    margin-top: 20px;
    height: 40px;
    text-transform: uppercase;
    font-weight: bold;
    letter-spacing: 1px;
    border: none;
    outline: none;
    border-radius: 5px;
    box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    background-image: linear-gradient( 135deg, #69FF97 10%, #00E4FF 100%);
}
.login a
{
    position: absolute;
    margin-top: 20px;
    text-decoration: none;
    color: black;
    width: 100%;
    text-align: center;
    font-size: 20px;
}
.login a span
{
    text-decoration: underline;
}
</style>
<body>
 <h1>Login To Start Shopping</h1>
    <div class="login">
        <form action="log" method="post">
            <div class="input">
                <label for="username">Username</label><span style="color: red;">*</span><br>
                <input type="text" name="username" id="textBox" placeholder="username" required>
            </div>
            <div class="input">
                <label for="password">Password</label><span style="color: red;">*</span><br>
                <input type="text" name="password" id="textBox" placeholder="password" required>
            </div>
            <input type="submit" id="sub" value="login"><br>
            <a href="register.jsp">New User? <span>Register here</span></a>
        </form>
    </div>
</body>
</html>