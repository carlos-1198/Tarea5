package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Carrera;
import model.dao.CarreraDao;

/**
 * Servlet implementation class ActualizarCarreraController
 */
@WebServlet("/ActualizarCarreraController")
public class ActualizarCarreraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCarreraController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (esValido(request.getParameter("codigo")) && esValido(request.getParameter("nombre"))
				&& esValido(request.getParameter("credito")) && esValido(request.getParameter("semestre"))) {

			Carrera c = new Carrera();
			CarreraDao ca = new CarreraDao();
			
			String codigo = request.getParameter("codigo");
			String nombre = request.getParameter("nombre");
			int credito = Integer.parseInt(request.getParameter("credito"));
			int semestre = Integer.parseInt(request.getParameter("semestre"));

			
			c.setCodigo(codigo);
			c.setNombre(nombre);
			c.setCredito(credito);
			c.setSemestre(semestre);
			
			ca.update(c);
			
			request.getRequestDispatcher("update.jsp").forward(request,response);

		}
	}

	public <T> boolean esValido(T valor) {
		if (valor == null) {
			return false;
		}
		return valor != "";
	}

}
