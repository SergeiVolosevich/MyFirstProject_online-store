<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <div class="container-fluid">
    	<div class="row">
    		<div class="col-xl-5 text-left">
    			<ul class="list-inline">
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>">О компании</a></li>
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>">Доставка</a></li>
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>">Оплата</a></li>
    				<li class="list-inline-item"><a href="<c:url value="/toDo"/>">Акционные товары</a></li>
    			</ul>
    		</div>
    		<div class="col-xl-5 text-right">
    			<ul class="list-inline">
    				<li class="list-inline-item">Работаем с 9-21</li>
    				<li class="list-inline-item">НОМЕР ТЕЛЕФОНА</li>
    				<li class="list-inline-item">МТС/velcom</li>
    			</ul>
    		</div>
    		<div class="col-xl-2">
    			<div class="btn-group">
    				<div class="dropdown dropleft  float-right" role="group">
    					<button id="sing_in" type="button" class="btn btn-primary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Войти</button>
    					<div class="dropdown-menu p-3">
      						<form>

        						<div class="form-group">
          							<label for="exampleDropdownFormEmail1">Email address</label>
         							<input type="email" class="form-control" id="exampleDropdownFormEmail1" placeholder="email@example.com">
        						</div>

        						<div class="form-group">
          							<label for="exampleDropdownFormPassword1">Password</label>
          							<input type="password" class="form-control" id="exampleDropdownFormPassword1" placeholder="Password">
        						</div>
        						<div class="form-check">
          							<input type="checkbox" class="form-check-input" id="dropdownCheck">
          							<label class="form-check-label" for="dropdownCheck">
          								Remember me
          							</label>
       							</div>
       							<div class="pt-2 text-right">
        							<button type="submit" class="btn btn-primary">Sign in</button>
        						</div>
      						</form>
      						<div class="dropdown-divider"></div>
      							<a class="dropdown-item" href=""toDo"">Forgot password?</a>
    					</div>
    				</div>
    				<button type="button" class="btn btn-primary">Регистрация</button>
    			</div>
    		</div>
    	</div>

    	<div class="row">
    		<div id="logo" class="col-xl-2">
    			<a href="${pageContext.request.contextPath}" title="На главную страницу"><img src="<c:url value="/resources/images/logo.jpg"/>" alt="Logo" style="height: 53px; width:147px;"></a>
    		</div>
    		<div class="col-xl-7 navbar navbar-expand-sm bg-primary justify-content-end">
    			<form class="form-inline">
        			<input class="form-control mr-sm-2" type="search" placeholder="Search">
        			<button class="btn btn-success" type="submit">Поиск</button>
      			</form>
    		</div>
    		<div class="col">
    			<button type="button" class="btn btn-secondary float-right"><span class="badge badge-pill badge-light mr-2"><img src="<c:url value="/resources/images/basket.jpg"/>" style="height: 20px; width:20px;"></span>Корзина</button>
    		</div>
    	</div>
    </div>

    <!-- Navigation -->
    <div class="container-fluid">
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

<div class="container-fluid">
    <div id="content">
        <%@ include file="subcatalogs.jsp"%>
    </div>
</div>
</body>
</html>