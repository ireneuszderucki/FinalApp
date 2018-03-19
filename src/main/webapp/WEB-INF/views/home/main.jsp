<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mgmt panel</title>
</head>
<body>
	<%@ include file="../fragments/bar.jspf"%>

		<div style="width: 15%; height: 70%; padding: 30px;float:left">
			<%@ include file="../fragments/profile.jspf"%>
		</div>
		
		<div style="width: 20%;float:left;margin-top:30px;margin-left:120px;padding:20px;">
			<a href="/FinalApp/offers/add" class="w3-button w3-xlarge w3-circle w3-red">+</a>
			<p style="float:right;margin-right:40px;">Add new job offer</p>
			<div style="border:solid transparent;">
			<a href="/FinalApp/offers/add" class="w3-button w3-xlarge w3-circle w3-red" style="margin-top:80px;">+</a>
			<p style="float:right;margin-right:55px;margin-top:100px;">Add new event</p>
		</div>
		</div>
		
		
		<div class="divList" style="clear:left;">
			<%@ include file="../fragments/companyList.jspf"%>
		</div>

		<div class="divList" style="margin-bottom: 100px">
			<%@ include file="../fragments/offerList.jspf"%>
		</div>

		<%@ include file="../fragments/footer.jspf"%>
	
		<%@ include file="../fragments/script.jspf"%>
</body>
</html>