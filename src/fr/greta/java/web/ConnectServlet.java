package fr.greta.java.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.greta.java.exception.UserNotFoundException;
import fr.greta.java.user.User;


@WebServlet(urlPatterns = "/connect")
public class ConnectServlet extends HttpServlet {
	
	private static final String NAME = "name";
	private static final String PASSWORD = "password";


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = null;
		RequestDispatcher dispatcher = null;
		
		String login = req.getParameter(NAME);
		String password = req.getParameter(PASSWORD);
		
		SQLRepository repo= new SQLRepository();
		
		try {
			user = repo.findUser(login, password);
		}catch(UserNotFoundException e) {
			req.setAttribute("error", e.getMessage());
			dispatcher = req.getRequestDispatcher("/connexion.jsp");
			dispatcher.forward(req, resp);
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		
		resp.sendRedirect(req.getContextPath()+"/accueil.jsp");
	}



	
}
