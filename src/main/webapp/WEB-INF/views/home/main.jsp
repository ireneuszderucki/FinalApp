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
	<%@ include file="../fragments/profile.jspf"%>
	<%@ include file="../fragments/btns.jspf"%>
	<%@ include file="../fragments/companyList.jspf"%>
	

	<%@ include file="../fragments/offerList.jspf"%>


	<%@ include file="../fragments/footer.jspf"%>

	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/resources/js/eventsForSidebar.js"/>"></script>
</body>
</html>