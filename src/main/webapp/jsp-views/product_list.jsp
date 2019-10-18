<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
		<style type="text/css">
        #container {width:600px;}
        #left {width: 50%; display: inline-block; background}
        #right {width: 25%; display: inline-block; background}
        </style>
	</head>
	<body>
		<h3>Lista produktów</h3>
        <c:forEach items="${productList}" var="product">
        <div id="container">
            <div id="left">
                <a href="/product/${product.id}"> ${product.title} | ${product.price} / ${product.unit} </a> <br>
            </div>
            <div id="right">
                <img src="${product.mainPhoto}" alt= "${product.title}"  width="100px" height="70px">
            </div>
        </div>
        </c:forEach>

    </body>
</html>