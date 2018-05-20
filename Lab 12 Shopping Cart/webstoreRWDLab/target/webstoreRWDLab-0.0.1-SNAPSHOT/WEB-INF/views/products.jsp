<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
   <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="//maxCDN.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>

 	<section class="container-fluid">
		<div class="row">
			<c:forEach items="${products}" var="product">
			<!-- col-xs-12  = Extra Small device 1 coulmn (12) , col-sm-6 = small device 2 column (12/2) , col-md-4=  mediaum device 3 coulmn (12/3) -->
				<div class="col-xs-12 col-sm-6  col-md-4 col-lg-3"  style="padding-bottom: 15px">
					<div class="thumbnail">
					<img class="img-responsive" src="<c:url value="/resources/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/>
						<div class="caption">
							<h3>${product.name}</h3>
							<p>${product.description}</p>
							<p>${product.unitPrice}USD</p>
							<p>Available ${product.unitsInStock} units in stock</p>
							<p>
								<a
									href=" <spring:url value="/products/product?id=${product.productId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>

</body>
</html>
