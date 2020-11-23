package fr.greta.java.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.greta.java.user.UserList;

/**
 * Servlet implementation class DisconnectServlet
 */
@WebServlet(urlPatterns ="/disconnect")
public class DisconnectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		session.setAttribute("user", null);
		
		RequestDispatcher dispatch = req.getRequestDispatcher("/accueil.jsp");
		dispatch.forward(req, resp);
	}
}


