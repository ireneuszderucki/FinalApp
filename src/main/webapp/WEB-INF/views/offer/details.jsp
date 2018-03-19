<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Offer details</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="<c:url value="/resources/css/my.css"/>">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
<%@ include file="../fragments/bar.jspf"%>
	<div class="w3-card-4 w3-light-green" style="width: 65%; margin: auto; margin-top:20px;">
		<div class="w3-container w3-center">
			<p>${offer.company.name}:${offer.title}</p>
		</div>
		<textarea rows="12" style="width: 100%; height: 100%;">${offer.description}</textarea>
		<div class="w3-container w3-center">
			<p style="border-style: dotted; border-color: green">Contact
				person: ${offer.contactData}</p>
			<p style="border-style: dotted;">Feedback: ${offer.feedback}</p>
			<p style="border-style: solid; border-color: orange">Declared
				salary between : ${offer.minSalary} and ${offer.maxSalary}. Your
				expectations: ${offer.expectedSalary}. Contract type:
				${offer.contractType}</p>
			<p
				style="border-style: solid; border-color: red; border-radius: 50px">Offer
				still valid: ${offer.valid}</p>
			<p>
				<i class="material-icons" style="padding-top: 5px">location_city</i><br>${offer.location}</p>
		</div>
		<p>Ref no: ${offer.refNumber}</p>
	</div>

	<div class="w3-card-4" style="width: 65%; margin: auto; margin-top:20px;">
		<div class="w3-half" style="padding: 15px">
			<a href="/FinalApp/offers/edit/${offer.id}"
				class="w3-button w3-orange" style="width: 100%">Edit</a>
		</div>
		<div class="w3-half" style="padding: 15px">
			<a href="/FinalApp/offers/delete/${offer.id}"
				class="w3-button w3-red" style="width: 100%">Delete</a>
		</div>
	</div>
	<%@ include file="../fragments/script.jspf"%>
</body>
</html>