<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>

    <div id="hintLogin">ELEGANT LOGIN FORM</div>
    <div id="loginFrom">
        <div id="loginTitle">LOG IN</div>
        <form id="login-container" action="#" method="post">
            <input class="frame" type="text" placeholder="user" name="user">
            <input class="frame" type="password" placeholder="Password" name="password">
            <input class="submits" type="submit" value="Submit">
        </form>
        <div id="bottomTest">
            <p>There are already accounts? <a href="#">Login</a></p>
            <p><a href="#">Forgot your password?</a></p>
        </div>
        <div id="heightCollapse"></div>
    </div>

</body>
</html>