<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chat Page</title>
</head>
<body>
<h1>ChatPage</h1>
<form name="message" action="ChatServlet" id="messageForm">
		<h4>Message</h4>
        <input name="message" type="text" id="message" size="50" />
        <input name="submitmsg" type="submit"  id="submitmsg" value="Submit" />  
</form>

<textarea name="paragraph_text" cols="50" rows="20"></textarea>

</body>
</html>