<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />
	</head>
	<body>
		<h3>Gratulacje dodałeś nowego użytkownika</h3>
                Email: ${persistedUser.email} <br>
                Telefon: ${persistedUser.telephone} <br>
                Address: ${persistedUser.address} <br>
                 <a href="/products">Powrót na listę produktów</a>

    </body>
</html>