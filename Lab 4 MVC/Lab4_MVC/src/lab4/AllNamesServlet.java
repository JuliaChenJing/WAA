package lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Name")
public class AllNamesServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Person> personList = (ArrayList<Person>) sess.getAttribute("personList");
		if (personList == null) {
			personList = new ArrayList<Person>();
			sess.setAttribute("personList", personList);
		}

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		RequestDispatcher dispatcher = request.getRequestDispatcher("showNames.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
