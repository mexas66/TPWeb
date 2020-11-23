<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import ="fr.greta.java.user.User" %>
<%@ page import ="fr.greta.java.user.Admin" %>

<% Object o = session.getAttribute("user"); %>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Acceuil</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>
    </head>
    
    <body>
        <header>
        	<div class="container-fluid">
        		<div class="row">
        			<div class="col" id="title">
        				<h1><a href="accueil.jsp">TPWeb</a></h1>
        			</div>
        			
        			<div class="col" id="menu">
        			<% if (o==null){%>
        			
            			<a href="connexion.jsp"><button type="button" class="btn btn-outline-primary">Se connecter</button></a>
          				<a href="inscription.html"><button type="button" class="btn btn-outline-primary">S'enregistrer</button></a>
          			<% }else{ %>
            				<% if (o instanceof Admin) { %>
            			<a href="administration"><button type="button" class="btn btn-outline-primary">Administration</button></a>
            		<% } %>
            			<a href="disconnect"><button type="button" class="btn btn-outline-primary">Se deconnecter</button></a>
        			<% } %>
        			</div>
        		</div>
        	</div>
        </header>

        
        
        
        <% if (o!=null){%>
            <h2>Bonjour <%= ((User)o).getLogin()%></h2>
        <%} %>
    </body>
</html>