<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:import url="bootstrap.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Start Page</title>
</head>
<body>
	<!-- Header -->
    <c:import url="header.jsp"/>
        <div class="container-fluid" >
        <!-- Carousel and news-->
        	<div class="row">
        		<!-- Carousel -->
        		<div id="corusel" class="carousel slide carousel-fade col-xl-8" data-ride="carousel" data-interval="3000" data-pause="hover" data-keyboard="true" data-wrap="true">
        			<ul class="carousel-indicators">
        				<li data-target="#corusel" data-slide-to="0" class="active"></li>
        				<li data-target="#corusel" data-slide-to="1"></li>
        			</ul>
        		<!-- Carousel Items -->
        		<div class="carousel-inner">
        			<div class="carousel-item active">
        				<a href="https://www.21vek.by/"><img class="d-block w-100 h-100"
        				src="<c:url value="/resources/images/carousel1.jpg"/>" alt="Logo" title="21Vek"></a>
        			</div>
        			<div class="carousel-item">
        				<a href="https://www.onliner.by/"><img class="d-block img-fluid"
        				src="<c:url value="/resources/images/carousel2.jpg"/>" alt="Logo" title="Oliner"></a>
        			</div>
        		</div>
        		<!-- Carousel controles -->
        		<a class="carousel-control-prev" href="#corusel" role="button" data-slide="prev">
            		<span class="carousel-control-prev-icon" aria-hidden="true"></span>
            		<span class="sr-only">Previous</span>
          		</a>
          		<a class="carousel-control-next" href="#corusel" role="button" data-slide="next">
            		<span class="carousel-control-next-icon" aria-hidden="true"></span>
           			<span class="sr-only">Next</span>
          		</a>
        		</div>

        		<!-- News -->
        		<div id="news" class="col-xl-4 list-group list-group-flush shadow-sm p-2 mb-2 bg-info">
        			<a href="<c:url value="/toDo"/>"
        			class="mb-2" style="text-align: left; color: #000000;"><spring:message code="news"/></a>
        			<a href="<c:url value="/toDo"/>" class="list-group-item list-group-item-action flex-column align-items-start">
        				<div class="d-flex w-100 justify-content-between">
              				<h5 class="mb-1"><spring:message code="list_goup_news"/></h5>
              				<small><spring:message code="date_of_news"/></small>
           				</div>
           				<p class="mb-1"><spring:message code="text_of_news"/></p>
        			</a>
        			<a href="<c:url value="/toDo"/>" class="list-group-item list-group-item-action flex-column align-items-start">
                         <div class="d-flex w-100 justify-content-between">
                             <h5 class="mb-1"><spring:message code="list_goup_news"/></h5>
                            <small><spring:message code="date_of_news"/></small>
                         </div>
                         <p class="mb-1"><spring:message code="text_of_news"/></p>
                    </a>
          			<a href="<c:url value="/toDo"/>" class="list-group-item list-group-item-action flex-column align-items-start">
                          <div class="d-flex w-100 justify-content-between">
                             <h5 class="mb-1"><spring:message code="list_goup_news"/></h5>
                             <small><spring:message code="date_of_news"/></small>
                          </div>
                          <p class="mb-1"><spring:message code="text_of_news"/></p>
                    </a>
        		</div>
        	</div>
        </div>

        <!-- Content -->
        <div  class="container-fluid text-center">
        <h1 class="display-1">TODO</h1>
        <div>
            <form:form action="logout" method="post">
             <button class="btn btn-primary" type="submit">Logout</button>
            </form:form>
            </div>
        <p>Input list of popular products from database</p>
        <p>input them into the table whith max rows 5</p>
        </div>

<!-- Footer -->
    <c:import url="footer.jsp"/>
</body>
</html>