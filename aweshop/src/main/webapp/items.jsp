<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%=ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("itemsList")%>

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
		<%for(Item i:items) {%>
		<tr>
			<td><%=i.getId()%></td>
			<td><%=i.getItemName()%></td>
			<td><%=i.getQuantity()%></td>
			<td><button>Edit</button></td>
			<td><button>Delete</button></td>
		</tr>
		<%}%>
	</table>
</body>
</html>