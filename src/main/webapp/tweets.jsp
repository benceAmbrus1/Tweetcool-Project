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
<c:forEach var="tweet" items="${tweets}">
    <p>Content: <c:out value="${tweet.message}"/><p>
    <p>Poster: <c:out value="${tweet.name}"/> / <c:out value="${tweet.date}"/><p><br>
</c:forEach>
<a href="index.html">Go back to the <em>index</em> page.</a>
<br>
<a href="newtweet.jsp">Click here for new <strong>Tweet</strong>!</a>
</body>
</html>
