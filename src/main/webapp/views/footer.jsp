<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
        <div class="container jumbotron p-1" style="text-align: left; color: #000000;">
        	<div class="row">
        		<div class="col-xl-4 text-center">
        			<p><a href="<c:url value="/toDo"/>" title="<spring:message code="contact_information"/>">
        			<spring:message code="contact_information"/></a></p>
        			<table class="d-flex justify-content-center">
        				<tr>
        					<td><spring:message code="number1"/></td>
        				</tr>
        				<tr>
        					<td><spring:message code="number2"/></td>
        				</tr>
        				<tr>
        					<td><spring:message code="number3"/></td>
        				</tr>
        				<tr>
        					<td><spring:message code="number4"/></td>
        				</tr>
        		     </table>

        <!-- Social networks -->
        			<div class="row justify-content-center">
        				<div class="col-xl-1 d-flex justify-content-center">
        					<a href="<c:url value="/toDo"/>"><img class="rounded-circle"
        					src="<c:url value="/resources/images/vk_logo.jpg"/>" alt="vk" style="height: 30px; width:30px"></a>
        				</div>
        				<div class="col-xl-1 d-flex justify-content-center">
        					<a href="<c:url value="/toDo"/>"><img class="rounded-circle"
        					src="<c:url value="/resources/images/viber1.jpg"/>" alt="vk" style="height: 30px; width:30px"></a>
        				</div>
        				<div class="col-xl-1 d-flex justify-content-center">
        					<a href="<c:url value="/toDo"/>"><img class="rounded-circle"
        					src="<c:url value="/resources/images/insta_logo.jpg"/>" alt="vk" style="height: 30px; width:30px"></a>
        				</div>
        				<div class="col-xl-1 d-flex justify-content-center">
        					<a href="<c:url value="/toDo"/>"><img class="rounded-circle"
        					src="<c:url value="/resources/images/facebook_logo.png"/>" alt="vk" style="height: 30px; width:30px"></a>
        				</div>
        			</div>
        		</div>
        		<div class="col-xl-4 d-flex justify-content-center">
        			<ul style="list-style-type: none" class="text-left">
        				<li>
        					<p><spring:message code="company"/></p>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="about_us"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="news"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="requisites"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="vacancies"/></a>
        				</li>
        			</ul>
        		</div>

        		<div class="col-xl-4 d-flex justify-content-center">
        			<ul style="list-style-type: none" class="text-left">
        				<li>
        					<p><spring:message code="information"/></p>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="discounts"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="shares"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="recommendations"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="buy"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="return"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="payment"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="delivery"/></a>
        				</li>
        				<li>
        					<a href="<c:url value="/toDo"/>"><spring:message code="pickup"/></a>
        				</li>
        			</ul>
        		</div>
        	</div>
        	<div class="row">
        		<hr align="center" width="100%">
        		<p class="text-center"><spring:message code="footer"/></p>
        	</div>
        	</div>
        </div>
</body>
</html>