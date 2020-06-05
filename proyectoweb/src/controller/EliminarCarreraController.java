package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Carrera;
import model.dao.CarreraDao;

@WebServlet("/EliminarCarreraController")
public class EliminarCarreraController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EliminarCarreraController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (esValido(request.getParameter("codigo"))) {

			String codigo = request.getParameter("codigo");
			CarreraDao ca = new CarreraDao();
			Carrera c = ca.find(codigo);
			
			ca.delete(c);
			
			request.getRequestDispatcher("EliminarCarrera.jsp").forward(request,response);

		}
	}

	public <T> boolean esValido(T valor) {
		if (valor == null) {
			return false;
		}
		return valor != "";
	}

}
