<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="css/register.css">
</head>
<body>

    <div id="hintRegister">Welcome to you register</div>
    <div id="registerFrom">
        <div id="registerTitle">NEW USER</div>
        <form id="register-container" action="#" method="post">
            <p>用户名：</p>
            <input class="frame" type="text" placeholder="user" name="user">
            <p>密码：</p>
            <input class="frame" type="password" placeholder="Password" name="password">
            <p>邮箱：</p>
            <input class="frame" type="text" placeholder="mailbox" name="mailbox">
            <p>验证码：</p>
            <input class="frameHalf" type="text" placeholder="verify" name="verify">
            <span id="verifyImg"></span>
            <input class="submits" type="submit" value="sign in">

        </form>
        <div id="bottomTest">
            <p>No account yet?<a href="#">Signup</a></p>
            <p><a href="#">Forgot your password?</a></p>
        </div>
        <div id="heightCollapse"></div>
    </div>

</body>
</html>