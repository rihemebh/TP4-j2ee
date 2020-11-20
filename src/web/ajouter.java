package web;
import metier.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ajouter
 */
@WebServlet("/ajouter")
public class ajouter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession maSession=request.getSession(false);
		String login = request.getParameter("login");
		String pass = request.getParameter("password");
		String nom = request.getParameter("name");
		String ville = request.getParameter("ville");
		String email = request.getParameter("email");
		if(maSession == null) {
			request.setAttribute("echec", "echec ! you have to be connected ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			GestUser g = new GestUser();
		
			utilisateur user =new  utilisateur(nom,login,pass,email,ville);
			g.ajouter(user);
			request.getRequestDispatcher("liste").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
