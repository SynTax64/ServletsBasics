package trainings.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	private static final long serialVersionUID = 5961923282900722182L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		if (request.getParameter("number1") != null && request.getParameter("number2") != null) {

			Long number1 = Long.parseLong(request.getParameter("number1"));
			Long number2 = Long.parseLong(request.getParameter("number2"));

			PrintWriter writer = response.getWriter();
			writer.println("The result is: " + (number1 + number2));
		}
	}
}
