<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Connexion</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>
    </head>
    
    
    
    
    <body>
    	<header>
    		<div class="container-fluid">
    			<h1 id="title"><a href="accueil.jsp">TPWeb</a></h1>
    		</div>
    	</header>
    
    	<div id="form">
    		<% if(request.getAttribute("error") != null){%>
    			<div class="alert alert-danger" role="alert">
    				<%=request.getAttribute("error")%>
    			</div>
    		<%}%>
	        <form action="connect" method="POST">
	            <label>Nom</label>
	            <input type="text" class="form-control" name="name" />
	            <label>Mot de Passe</label>
	            <input type="password" class="form-control" name="password">
	            <button class="btn btn-primary" type="submit" name="submit">Connexion</button>
	        </form>
	    </div>
    </body>
</html>