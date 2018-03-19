<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add company</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<div>
		<f:form method="post" action="" modelAttribute="company" class="w3-container">
			<div>
				<f:input class="w3-input" path="name" placeholder="Company name" /><f:errors path="name" />
			</div>
			<div>
				<f:input class="w3-input" path="description" type="textarea" /><f:errors path="description" />
			</div>
			<div>
				<f:input class="w3-input" path="location" placeholder="Company location" />
			</div>
			<div>
				<input class="w3-input" type="submit" value="Add company to DB">
			</div>
		</f:form>
	</div>
</body>
</html>