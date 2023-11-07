<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
    position: relative;
    background-color: rgba(96, 100, 88, 0.338);
}
.login-form
{
    width: max-content;
    height: max-content;
    box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    padding: 40px 60px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    border-radius: 3px;
}
.login-form .form-tittle
{
    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
    text-transform: uppercase;
    margin: 10px 0px; 
    font-size: 1.2rem;
}
.login-form .form-input
{
    width: 100%;
}
.login-form .form-input label
{
    display: flex;
    flex-direction: row;
    margin: 5px 0px;
    width: 100%;
    font-size: 1.2rem;
    font-family: sans-serif;
}
.login-form .form-input input
{
    width: 100%;
    height: 2rem;
    font-size: 1.2rem;
    border: none;
    outline: none;
    border-radius: 3px;
    padding-inline-start: 5px;
}
.captcha
{
    width: 100%;
    padding: 10px 0px;
}
.captcha .preview
{
    width: 100%;
    height: 2rem;
    border: 1px dashed;
    background-color: rgba(255, 255, 255, 0.244);
    color: black;
    font-size: 1.2rem;
    user-select: none;
    margin:5px 0px;
    letter-spacing: 2.5px;
    text-align: center;
}
.captcha .captcha-form
{
    margin: 15px 0;
}
.captcha .captcha-form input
{
    height: 2rem;
    width: 70%;
    font-size: 1.2rem;
    border: none;
    outline: none;
    border-radius: 3px;
    padding-inline-start: 5px;
}
.captcha .captcha-form .captcha-refresh
{
    height: 1.5rem;
    width:25%;
    font-family: sans-serif;
    border: none;
    outline: none;
    border-radius: 3px;
    cursor: pointer;
}
.login-form .form-input #login-btn
{
    width: 100%;
    background-color: rgba(0, 34, 255, 0.584);
    height: 2rem;
    text-transform: uppercase;
    font-size: 1.5rem;
    font-weight: 600;
    letter-spacing: 1px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
    
}
    </style>
</head>
<body>
   <form action="AdminLogin" method="post">
    <div class="login-form">
        <div class="form-tittle">
            <h1>Login Form</h1>
        </div>
        <div class="form-input">
            <label for="username">Email</label>
            <input type="text" id="username" required name="email">
        </div>
        <div class="form-input">
            <label for="Password">Password</label>
            <input type="password" id="Password" required name="password">
        </div>
        <div class="captcha">
            <div class="preview"><span></span> </div>
            <div class="captcha-form">
                <input type="text" id="captcha-form" name="captcha" placeholder="Enter captcha" required>
                <button class="captcha-refresh">
                    Refresh
                </button>
            </div>
        </div>
        <div class="form-input">
            <button id="login-btn">Login</button>
        </div>
    </div>
   </form>
    <script src="/Test_Application/login.js">
    </script>
</body>
</html>