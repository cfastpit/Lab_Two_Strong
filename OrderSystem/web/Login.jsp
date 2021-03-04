<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Fast Tech Login</title>
         <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Enter User ID and Password</h1>
    
    <form action="login" method="post">
        <input type="hidden" name="action" value="login">        
        
        <label class="pad_top">UserID:</label>
        <input type="text" name="userID" required><br>
        
        <label class="pad_top">Password:</label>
        <input type="password" name="password" required><br>
        
        <label>&nbsp;</label>
        <input type="submit" value="login" class="margin_left">
    </form>
    </body>
</html>
