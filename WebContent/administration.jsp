<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.List" %>
    <%@ page import ="fr.greta.java.user.UserList" %>
    <%@ page import ="fr.greta.java.user.User" %>
    <%@ page import ="fr.greta.java.user.Admin" %>
    
    <%UserList users = (UserList)session.getAttribute("userList");
    Object current = session.getAttribute("user");
    
    if(!(current instanceof Admin)){
    	response.sendRedirect(request.getContextPath()+"/accueil.jsp");
    }
    %>
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Administration</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>
	</head>
	
	
	<body>
		<header>
	    		<div class="container-fluid">
	    			<h1 id="title"><a href="accueil.jsp">TPWeb</a></h1>
	    		</div>
	    </header>
	    
	    <div class="container.fluid" id="form">
			<form action="remove" method="post">
			<% for(User user : users.getUsers()){%>
				
					<div class="row adminlabel">
						<div class="col">
							<label><%= user.getLogin()%></label>
						</div>
						<div class="col-5">
							<label><%=user.getEmail()  %></label>
						</div>
						<div class="col">
							<%if (!(user instanceof Admin)){%>
								<button name="userToRemove" class="btn btn-primary" type="submit" value="<%=user.getLogin()%>">Supprimer</button>
							<%} %>
						</div>
					</div>
			<%} %>
			</form>
		</div>
		
	</body>
</html>