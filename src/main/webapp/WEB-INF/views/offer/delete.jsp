<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jobOffer details</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="<c:url value="/resources/css/my.css"/>">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
<body>
	<%@ include file="../fragments/bar.jspf"%>
	<div class="w3-container w3-center" style="padding-bottom: 20px">
		<h1>
			<strong style="color: #ff3333;">Are you sure you want to
				delete the offer?</strong>
		</h1>
	</div>
	<div class="w3-container w3-center" style="padding-bottom: 20px">
		<a href="/FinalApp/offers/delete/yes/${jobOffer.id}"
			class="w3-button w3-red" style="width: 50%">Yes</a>
	</div>
	<div class="w3-container w3-center" style="padding-bottom: 20px">
		<a href="/FinalApp/offers/yourOffers" class="w3-button w3-green"
			style="width: 50%">No</a>
	</div>
	<div class="w3-card-4 "
		style="width: 80%; margin: 20px auto; float: center;">
		<div class="w3-container w3-center">
			<p>${jobOffer.company.name}: ${jobOffer.title}</p>
		</div>
		<textarea style="width: 100%; height: 100%;">${jobOffer.description}</textarea>
		<div class="w3-container w3-center">
			<p style="border-style: dotted; border-color: green">Contact
				person: ${jobOffer.contactData}</p>
			<p style="border-style: dotted;">Feedback: ${jobOffer.feedback}</p>
			<p style="border-style: solid; border-color: orange">Declared
				salary between : ${jobOffer.minSalary} and ${jobOffer.maxSalary}.
				Your expectations: ${jobOffer.expectedSalary}. Contract type:
				${jobOffer.contractType}</p>
			<p
				style="border-style: solid; border-color: red; border-radius: 50px">jobOffer
				still valid: ${jobOffer.valid}</p>
			<p>
				<i class="material-icons" style="padding-top: 5px">location_city</i><br>${jobOffer.location}</p>
		</div>
		<p>Ref no: ${jobOffer.refNumber}</p>
	</div>
	<%@ include file="../fragments/script.jspf"%>

</body>
</html>