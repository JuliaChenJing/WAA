package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Person;

@WebServlet("/RemoveName")
public class RemoveNameServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key = request.getParameter("key");
		String output = "";
		HttpSession sess = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Person> personList = (ArrayList<Person>) sess.getAttribute("personList");
		Iterator<Person> iterator = personList.iterator();
		if (personList.size() == 0) {
			output = "No Name in List";
			request.setAttribute("output", output);
		}
		while (iterator.hasNext()) {
			if (iterator.next().getKey().equals(key)) {
				iterator.remove();
				output = "Deleted";
				request.setAttribute("output", output);
			} else {
				output = "ID not found ";
				request.setAttribute("output", output);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("Name");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
