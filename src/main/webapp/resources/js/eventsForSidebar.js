$(function() {
	
	var mainContent = $("#main");
	var mySidebar = $("#mySidebar");
	var openNav = $("#openNav");
	var closeBtn = $("#closeNav");
	
	function openBar() {
		mainContent.css("margin-left", "10%");
		mySidebar.css({"width": "10%","display": "block"});
		openNav.css("display", "none");
	};
	
	function closeBar() {
		mainContent.css("margin-left", "0%");
		mySidebar.css("display", "none");
		openNav.css("display", "inline-block");
	};
	
	openNav.on("click", openBar);
	closeBtn.on("click", closeBar);
});