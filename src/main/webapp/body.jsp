<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String isSearch = (String) request.getAttribute("isSearch");
String keyword="";
if (isSearch == null) isSearch = "notOk";
else keyword =(String) request.getAttribute("keyword");
%>
<!-- this will export to home page -->
<div class="row">
	<div class="col-12 mt-5">
		<div class="jumbotron">
			<h1 class="text-center" style="color: var(--primaryGreen);">Just Look At Our New Brand Product Here</h1>
		</div>
	</div>
	
	<!-- list of product -->
	<div class="col-12">
		<div class="row">
			<c:import url="listProduct.jsp" />
		</div>
	</div>

	<!-- pagination section -->
	<ul class="pagination" style="margin-top: 30px;" > 
		<li class="page-item"><a class="page-link" href="#">Previous</a></li>
		<li class="page-item"><a class="page-link"
			href="<%= isSearch.equals("ok") ? "/SearchController?search="+keyword+"&&" : "/home?" %>page=1">1</a></li>
		<li class="page-item"><a class="page-link"
			href="<%= isSearch.equals("ok") ? "/SearchController?search="+keyword+"&&" : "/home?" %>page=2">2</a></li>
		<li class="page-item"><a class="page-link"
			href="<%= isSearch.equals("ok") ? "/SearchController?search="+keyword+"&&" : "/home?" %>page=3">3</a></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>
	
	<!-- popular cart -->
	<div class="col-12" style="margin-top: 10px;">
		<div class="mycard text-center">
			<h3>Popular products</h3>
		</div>
		
		<c:import url="popularProduct.jsp" />
	</div>
</div>
