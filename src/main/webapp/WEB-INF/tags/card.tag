<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="product" required="true" type="java.lang.Object"
	description="The product object in this card" rtexprvalue="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <%@ attribute name="stem" required="true" type="java.lang.String" --%>
<%-- 	description="The file name of the image, excluding extension" --%>
<%-- 	rtexprvalue="true"%> --%>
<%-- <%@ attribute name="extension" required="true" type="java.lang.String" --%>
<%-- 	description="The file extension of the image" rtexprvalue="true"%> --%>

<!-- set String parameter to add to cart -->
<c:set scope="page" var="productParam"
	value="id=${product.getId()}
	&&name=${product.getName()}
	&&price=${product.getPrice()}
	&&quantity=${product.getNumber()}" />

<div class="mycard">
	<div class="img">
		<a href="<c:url value="/InformationProduct?id=${product.getId()}" />">
			<img src="${product.getSrc()}" alt="${product.getName()}" />
		</a>
	</div>
	<h2 class="text-center">${product.getType()}</h2>
	<h6 class="text-center">${product.getName()}</h6>
	<p class="text-center">
		<i class="fas fa-dollar-sign"></i>${product.getPrice()}</p>
	<div class="d-flex justify-content-center">
		<a href="<c:url value="/AddToCart?${productParam}" />"
			class="btn btn-success mx-auto">Add to Cart</a>
	</div>
</div>
