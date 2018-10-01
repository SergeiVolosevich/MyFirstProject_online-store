<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <div class="container mt-3">
    	<div class="row">
    		<div class="col-xl-5 text-left pt-1">
    			<ul class="list-inline">
    				<li class="list-inline-item"><a class="text-light" href="<c:url value="/toDo"/>"><spring:message code="about_company"/></a></li>
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>"><spring:message code="delivery"/></a></li>
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>"><spring:message code="payment"/></a></li>
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>"><spring:message code="promotional_products"/></a></li>
    			</ul>
    		</div>
    		<div class="col-xl-5 text-right pt-1">
    			<ul class="list-inline">
    			    <li class="list-inline-item"><spring:message code="work_at"/></li>
    				<li class="list-inline-item">
    				<big><spring:message code="phone_number"/></big></li>
    				<li class="list-inline-item"><spring:message code="provaider"/></li>
    				<li class="list-inline-item"><a href="?language=ru">RU</a></li>
                    <li class="list-inline-item"><a href="?language=en">EN</a></li>
    			</ul>
    		</div>
    		<div class="col-xl-2 pt-1">

    			<div class="btn-group">
    			<a class="btn btn-primary" href="<c:url value="/login"/>" role="button"><spring:message code="sign_in"/></a>
    			<a class="btn btn-primary" href="<c:url value="/registration"/>" role="button"><spring:message code="registration"/></a>
    	        </div>
    			</div>
            </div>

    	<div class="row">
    		<div id="logo" class="col-xl-2">
    			<a href="${pageContext.request.contextPath}" title="<spring:message code="main_page"/>">
    			<img src="<c:url value="/resources/images/logo.jpg"/>" alt="Logo" style="height: 53px; width:147px;"></a>
    		</div>
    		<div class="col-xl-7 navbar navbar-expand-sm bg-primary justify-content-end">
    			<form class="form-inline">
        			<input class="form-control mr-sm-2" type="search"
        			placeholder="<spring:message code="enter_the_name"/>">
        			<button class="btn btn-success" type="submit"><spring:message code="search"/></button>
      			</form>
    		</div>
    		<div class="col">
    			<button type="button" class="btn btn-secondary float-right"><span class="badge badge-pill badge-light mr-2">
    			<img src="<c:url value="/resources/images/basket.jpg"/>" style="height: 20px; width:20px;">
    			</span><spring:message code="basket"/></button>
    		</div>
    	</div>
    </div>

    <!-- Navigation -->
    <div class="container">
	    <nav id="wrapper" class="navbar navbar-expand-sm bg-light mt-2">
	        <ul id="nav" class="navbar-nav" >
	            <c:forEach var="elem" items="${listCatalogs}">
                    <li class="nav-item" >
                            <a class="nav-link" href="${elem}">
                                <c:out value="${elem}"/>
                            </a>
                    </li>
                </c:forEach>
            </ul>
	    </nav>
    </div>

<div class="container">
    <div id="content">
    <%@ include file="subcatalogs.jsp"%>
    </div>
</div>
</body>
</html>