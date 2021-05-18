package trainings.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlets extends GenericServlet {

	private static final long serialVersionUID = 7160042080425652139L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>Hello Servlets World</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}

}
