<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
</head>
<body>
<h1>Welcome in (Alpha)TweetCool!</h1>

    <form action="newtweet" method="post">
        <input type="text" name="name" placeholder="Your name" value="">
        <input type="text" name="message" placeholder="Message" value="">
        <input type="submit" class="submit" value="Submit">
    </form>
<p><strong>${error}</strong></p>

<a href="index.html">Go back to the <em>index</em> page.</a>
<br>
<a href="tweets">Click here to check <em>tweets</em> page.</a>
</body>
</html>
