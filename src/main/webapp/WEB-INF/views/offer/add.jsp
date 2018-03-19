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
	<div style="margin: 20px" class="w3-container w3-blue">
		<h3 class="w3-center">Add a new job offer</h3>
	</div>
	<br>

	<div>
		<f:form method="post" action="" modelAttribute="jobOffer"
			class="w3-container">

			<div class="w3-row-padding">
				<div class="w3-third">
					<label>Title</label>
					<f:input class="w3-input" path="title" required="required" />
					<f:errors path="title" />
				</div>
				<div class="w3-third">
					<label>Contact person</label>
					<f:input class="w3-input" path="contactData" />
					<f:errors path="contactData" />
				</div>
				<div class="w3-third">
					<label>Select referenced company</label>
					<f:select class="w3-select" path="company.id"
						items="${companies}" itemValue="id" itemLabel="name" />
				</div>
			</div>
			<br>

			<div>
				<label>Description</label>
				<f:textarea class="w3-input w3-border textarea" maxlength="4000" path="description" />
				<f:errors path="description" />
			</div>
			<br>

			<div>
				<label>Select company location</label>
				<f:select class="w3-select" path="location" items="${locations}" />
				<f:errors path="location" />
			</div>
			<br>

			<div class="w3-row-padding">
				<div class="w3-quarter">
					Minimal salary
					<f:input class="w3-input w3-border w3-hover-red" type="number"
						value="1000" path="minSalary" />
					<f:errors path="minSalary" />
				</div>
				<div class="w3-quarter">
					Maximal salary
					<f:input class="w3-input w3-border w3-hover-blue" type="number"
						value="100000" path="maxSalary" />
					<f:errors path="maxSalary" />
				</div>
				<div class="w3-quarter">
					Expected salary
					<f:input class="w3-input w3-border w3-hover-green" type="number"
						value="5000" path="expectedSalary" />
					<f:errors path="expectedSalary" />
				</div>
				<div class="w3-quarter">
					Type of employment
					<f:select class="w3-select" path="contractType"
						items="${contractTypes}" />
					<f:errors path="contractType" />
				</div>
			</div>
			<br>

			<div>
				Is valid?
				<f:checkbox class="w3-check" path="valid" />
			</div>
			<br>

			<div class="w3-row-padding">
				<div class="w3-quarter">
					Ref no
					<f:input class="w3-input w3-border" path="refNumber" />
					<f:errors path="refNumber" />
				</div>
			</div>
			<br>

			<div>
				<input class="w3-input" type="submit" value="Add offer to DB">
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