package es.ubu.lsi.SistemasDistribuidosSesion08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Función doGet para comprobar el estado del Servlet
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("Servlet activo!!");
	}

	/**
	 * Función doPost para comprobar la recepción del formulario
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			String nombre = request.getParameter("nombre");
			String email = request.getParameter("email");

			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Respuesta del Servlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Información recibida</h1>");
			out.println("<p>Nombre: " + nombre + "</p>");
			out.println("<p>Email: " + email + "</p>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

}
