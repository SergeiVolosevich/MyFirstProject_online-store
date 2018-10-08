<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:import url="bootstrap.jsp"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<c:import url="header.jsp"/>
    <div class="container text-dark">
        <div class="row mt-1 mb-3">
            <div class="col-md-6 mx-auto bg-light">
                <div class="panel panel-default" style="margin:20px">
                    <div class="panel-heading">
                        <h3 style="color: #212529" class="panel-title" ><spring:message code="login"/></h3>
                    </div>
                    <div class="panel-body">
                        <form name="form_login" action="<c:url value="/login"/>" method="post">
                            <div class="form-group">
                                <label for="username"><spring:message code="email"/></label>
                                <input type="text" name="user" class="form-control" id="username" placeholder="<spring:message code="email"/>">
                            </div>
                            <div class="form-group">
                                <label for="password"><spring:message code="password"/></label>
                                <input type="password" name="password" class="form-control" id="password" placeholder="<spring:message code="password"/>">
                            </div>
                            <div class="custom-control custom-checkbox mb-1">
                                <input type="checkbox" class="custom-control-input" id="remember-me">
                                <label class="custom-control-label" for="remember-me"><spring:message code="remember"/></label>
                            </div>
                                <c:if test="${logout}">
                                    <div class="alert alert-success" role="alert">
                                        <spring:message code="logout_success"/>
                                    </div>
                                </c:if>
                                <c:if test="${error}">
                                    <div class="alert alert-danger" role="alert">
                                        <spring:message code="login_error"/>
                                    </div>
                                </c:if>
                            <div class="pt-2 d-flex justify-content-between">
                            <a href="${pageContext.request.contextPath}"><spring:message code="back_startPage"/></a>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <button  type="submit" class="btn btn-outline-dark"><spring:message code="sign_in"/></button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<c:import url="footer.jsp"/>
</body>
</html>