<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add offer</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="<c:url value="/resources/css/my.css"/>">
</head>
<body>
	<%@ include file="../fragments/bar.jspf"%>

	<div style="margin-bottom:80px">
		<f:form method="post" action="/FinalApp/offers/addNow" modelAttribute="jobOffer"
			class="w3-container" >
			
			<div class="w3-card-4 w3-light-green" style="width: 65%; margin: auto; margin-top:20px;">
			<p class="w3-center">Would you like to assign an existing company for the job offer?</p>
			<f:select class="w3-select" path="company.id"
						items="${companies}" itemValue="id" itemLabel="name" />
			<input style="background-color:orange;"class="w3-input" type="submit" value="Assign">
			</div>
		</f:form>
	</div>
	
	<div style="margin-bottom:80px">
		<f:form method="post" action="/FinalApp/company/add" modelAttribute="company"
			class="w3-container" >
			
			<div class="w3-card-4 w3-light-green" style="width: 65%; margin: auto; margin-top:20px;">
			<p class="w3-center">Or you can create new company in DB</p>
			<div class="w3-third" style="padding:5px">
					<label>Name</label>
					<f:input class="w3-input" path="name" />
					<f:errors path="name" />
			</div>
			<div class="w3-third" style="padding:5px">
					<label>Description</label>
					<f:input class="w3-input" path="description" />
					<f:errors path="description" />
			</div>
			<div class="w3-third" style="padding:5px">
					<label>Location</label>
					<f:select class="w3-select" path="location" items="${locations}" />
					<f:errors path="location" />
			</div>
			<input style="background-color:orange;"class="w3-input" type="submit" value="Create">
			</div>
		</f:form>
	</div>
	<%@ include file="../fragments/footer.jspf"%>
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/textarea.js"/>"></script>
		<%@ include file="../fragments/script.jspf"%>
</body>
</html>