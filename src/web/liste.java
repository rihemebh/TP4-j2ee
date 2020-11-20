package web;
import java.util.Vector;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.GestUser;
import metier.utilisateur;

/**
 * Servlet implementation class liste
 */
@WebServlet("/liste")
public class liste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public liste() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession maSession=request.getSession(false);
		if(maSession == null) {
			request.setAttribute("echec", "echec ! you have to be connected ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			GestUser g = new GestUser();
			Vector<utilisateur> v= g.lister();
			PrintWriter out = response.getWriter();
			out.println("<html><head><style>");
			out.println( "table,th,td{ border:2px solid black;border-collapse:collapse;}");
			out.println("</style></head><body><table><tr><td>email</td><td>login</td><td>ville</td><td>delete</td><td>edit</td></tr>");
			for(int i=0; i<v.size(); i++) {
			         	out.println("<tr>");
						out.println("<td>"+v.get(i).getEmail()+"</td>");
						out.println("<td>"+v.get(i).getLogin()+"</td>");
						out.println("<td>"+v.get(i).getVille()+"</td>");
						out.println("<td> <a href='supprimer?id="+v.get(i).getIdUser()+"' > delete </a></td>");
						out.println("<td> <a href='modification?id="+v.get(i).getIdUser()+"'  > Edit </a></td>");
						out.println("</tr>");
				}
				
			out.println("</table></body></html>");
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
