<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- this will export to home page -->
<div class="row mt-5">
	<div class=".col-sm-9">
		<div class="jumbotron">
			<h1 class="text-center" style="color: var(--primaryGreen);">Just Look At Our New Brand Product Here</h1>
		</div>
		<c:import url="listProduct.jsp" />

		<!-- pagination section -->
		<ul class="pagination" style="margin-top: 30px;">
			<li class="page-item"><a class="page-link" href="#">Previous</a></li>
			<li class="page-item"><a class="page-link"
				href="/ListController?page=1">1</a></li>
			<li class="page-item"><a class="page-link"
				href="/ListController?page=2">2</a></li>
			<li class="page-item"><a class="page-link"
				href="/ListController?page=3">3</a></li>
			<li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>
	</div>

	<div class=".col-sm-3" style="margin-top: 30px;">
		<div class="mycard">
			<h2>Shopping card</h2>
			<div class="img" style="height: 100px;">Card</div>
		</div>
		<div class="mycard">
			<h3>Popular products or banners</h3>
		</div>
	</div>
</div>
