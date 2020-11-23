package fr.greta.java.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.greta.java.user.User;
import fr.greta.java.user.UserList;

import java.util.List;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
	
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	private static final String EMAIL = "email";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter(LOGIN);
		String password = req.getParameter(PASSWORD);
		String email = req.getParameter(EMAIL);
		
		SQLRepository.registerUser(login, password, email);
		
		resp.sendRedirect(req.getContextPath()+"/connexion.html");
	}
	
}
