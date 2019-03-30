<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("itemsList");
	Item item = new Item()%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="width: 100%">
		<tr>
			<th>Item ID</th>
			<th>Item Name</th>
			<th>Quantities Available</th>
		</tr>
		<%for(item i:items) {
		%>
		<tr>
			<td>Employee ID: <c:out value="${item.getId()}" /></td>
			<td>Employee Pass: <c:out value="${item.getItemName()}" /></td>
			<td>Employee Pass: <c:out value="${item.getQuantity()}" /></td>
		</tr>
		<%}%>

	</table>
</body>
</html>