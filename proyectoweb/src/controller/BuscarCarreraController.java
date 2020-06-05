package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Carrera;
import model.dao.CarreraDao;

/**
 * Servlet implementation class BuscarCarreraController
 */
@WebServlet("/BuscarCarreraController")
public class BuscarCarreraController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscarCarreraController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		if (esValido(request.getParameter("codigo")) && esValido(request.getParameter("nombre"))
//				&& esValido(request.getParameter("credito")) && esValido(request.getParameter("semestre"))) {
//
//			
//			
////			RequestDispatcher rd = getServletContext().getRequestDispatcher("/consultar.jsp");
////			rd.forward(request, response);
//
//		}

		String codigo = request.getParameter("codigo");
		CarreraDao ca = new CarreraDao();
		Carrera c = ca.find(codigo);

		ca.find(c);

		request.setAttribute("codigo", c.getCodigo());
		request.setAttribute("nombre", c.getNombre());
		request.setAttribute("credito", c.getCredito());
		request.setAttribute("semestre", c.getSemestre());

		request.getRequestDispatcher("/consultar.jsp").forward(request, response);
	}

//	public <T> boolean esValido(T valor) {
//		if (valor == null) {
//			return false;
//		}
//		return valor != "";
//	}

}
