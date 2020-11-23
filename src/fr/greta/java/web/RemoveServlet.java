package fr.greta.java.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.greta.java.user.Admin;
import fr.greta.java.user.User;
import fr.greta.java.user.UserList;

/**
 * Servlet implementation class RemoveServlet
 */
@WebServlet(urlPatterns = "/remove")
public class RemoveServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("userToRemove");
	
		SQLRepository.removeUser(login);
		
		RequestDispatcher dispatch = req.getRequestDispatcher("/administration");
		dispatch.forward(req, resp);
	
	}
	
}
