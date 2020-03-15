<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="pd" uri="/WEB-INF/tlds/TagLibraryDescriptor.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> from date.jsp page</h1>
<pd:printDate>
<h1> Inside printdate tag body</h1>
</pd:printDate>
<h1>outside printdate tag body</h1>
<h2> End of page</h2>
</body>
</html>