package fr.greta.java.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.greta.java.user.UserList;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/administration")
public class AdminServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserList allUsers = SQLRepository.getAllUsers();
		
		HttpSession session = req.getSession();
		session.setAttribute("userList", allUsers);
		
		RequestDispatcher dispatch = req.getRequestDispatcher("/administration.jsp");
		dispatch.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserList allUsers = SQLRepository.getAllUsers();
		
		HttpSession session = req.getSession();
		session.setAttribute("userList", allUsers);
		
		RequestDispatcher dispatch = req.getRequestDispatcher("/administration.jsp");
		dispatch.forward(req, resp);
	}

}
