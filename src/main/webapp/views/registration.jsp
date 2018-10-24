<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:import url="bootstrap.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
<c:import url="header.jsp"/>
    <div class="container text-dark">
        <div class="row mt-1 mb-3">
            <div class="col-md-6 mx-auto bg-light">
                <div class="panel panel-default" style="margin:20px">
                    <div class="panel-heading">
                        <h3 style="color: #212529" class="panel-title" ><spring:message code="registration_form"/></h3>
                    </div>
                    <div class="panel-body">
                        <c:url value="/registration" var="action"/>
                            <form:form modelAttribute="user" method = "POST" action = "${action}">


                                <div class="form-group">
                                    <form:label path = "userName"><spring:message code="email"/></form:label>
                                        <spring:message code="email" var="email_placeholder"/>
                                    <form:input class="form-control" path = "userName" placeholder="${email_placeholder}" />
                                    <small class="form-text text-muted"><spring:message code="username_help"/></small>

                                            <form:errors path="userName" class="text-danger"/>

                                </div>

                                <div class="form-group">
                                    <form:label path = "password"><spring:message code="password"/></form:label>
                                        <spring:message code="password" var="password_placeholder"/>
                                    <form:password class="form-control" path ="password" placeholder="${password_placeholder}"/>
                                    <small class="form-text text-muted"><spring:message code="password_help"/></small>

                                            <form:errors path="password" class="text-danger"/>

                                </div>

                                <div class="form-group">
                                    <form:label path = "copyPassword"><spring:message code="copy_password"/></form:label>
                                        <spring:message code="copy_password" var="retype_password_placeholder"/>
                                    <form:password class="form-control" path ="copyPassword" placeholder="${retype_password_placeholder}"/>
                                    <small class="form-text text-muted"><spring:message code="copy_password"/></small>

                                            <form:errors path="copyPassword" class="text-danger"/>

                                </div>

                                <div class="form-group">
                                    <form:label path = "email"><spring:message code="mail"/></form:label>
                                    <spring:message code="mail" var="mail_placeholder"/>
                                    <form:input class="form-control" path ="email" placeholder="${mail_placeholder}"/>
                                    <small class="form-text text-muted"><spring:message code="email_help"/></small>

                                            <form:errors path="email" class="text-danger"/>

                                </div>

                                <div class="pt-2 d-flex justify-content-between">
                                      <a href="${pageContext.request.contextPath}"><spring:message code="back_startPage"/></a>
                                      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                      <button  type="submit" class="btn btn-outline-dark"><spring:message code="registred"/></button>
                                </div>
                            </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<c:import url="footer.jsp"/>
</body>
</html>