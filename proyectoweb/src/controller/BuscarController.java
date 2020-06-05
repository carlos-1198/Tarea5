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
 * Servlet implementation class BuscarController
 */
@WebServlet("/BuscarController")
public class BuscarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarController() {
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
		String codigo = request.getParameter("cod");
		CarreraDao ca = new CarreraDao();
		Carrera c = ca.find(codigo);

		

		request.setAttribute("codigo", c.getCodigo());
		request.setAttribute("nombre", c.getNombre());
		request.setAttribute("credito", c.getCredito());
		request.setAttribute("semestre", c.getSemestre());

		request.getRequestDispatcher("/consultar.jsp").forward(request, response);
	}

}
