<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:import url="bootstrap.jsp"/>
<head>
	<title></title>
</head>
<body>
<!--Header-->
<c:import url="header.jsp"/>

<ul>
<c:forEach var="elem" items="${productList}">
 <li>
        <c:out value="${elem}"/>

        </li>
</c:forEach>
</ul>
<c:import url="footer.jsp"/>

</body>
</html>