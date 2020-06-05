package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import model.Estudiante;
import model.dao.EstudianteDao;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession;
		misession = request.getSession();
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");

		if (esValido(request.getParameter("codigo")) && esValido(request.getParameter("nombre"))) {
		
			EstudianteDao eDao = new EstudianteDao();
			
			Estudiante es = eDao.find(codigo);
			
			if (es != null) {
				try {

					if (!es.getNombre().equals(nombre)) {// if user pass don't match correctly (local pass with
						// database pass)
						System.out.println("Usuario o Clave Incorrecta");
					}

					misession.setAttribute("codigo", es);
					// misession.setAttribute("rol_user", 3);
					response.sendRedirect(request.getContextPath() + "/reg.jsp");
				} catch (Exception e) {
					misession.setAttribute("fail_login", e.getMessage());
					response.sendRedirect(request.getContextPath() + "/login.jsp");
				}
			} else {
				misession.setAttribute("error_msg", "Error");
//				response.sendRedirect(request.getContextPath() + "/ErrorPage.jsp");
				response.sendRedirect(request.getContextPath() + "/login.jsp");
				System.out.println("Error");

			}

		} 
		
	}
	
	public <T> boolean esValido(T valor) {
		if (valor == null) {
			return false;
		}
		return valor != "";
	}

}
