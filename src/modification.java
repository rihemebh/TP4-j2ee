	
	
	import java.io.IOException;
	import java.io.PrintWriter;
	
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	import metier.GestUser;
	import metier.utilisateur;
	
	/**
	 * Servlet implementation class modification
	 */
	@WebServlet("/modification")
	public class modification extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public modification() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int id = Integer.parseInt(request.getParameter("id"));
	     
			GestUser g = new GestUser();
			utilisateur user= g.getUser(id);
			
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>");
			         	out.println("<FORM METHOD=\"GET\" action=\"update\">");
			         	out.println(  "<P> login: <INPUT NAME=\"id\" TYPE=\" TEXT\" SIZE=\" 12\" MAXLENGTH=\" 20\" value=\""+id+"\" readonly>");
			         	out.println(  "<P> login: <INPUT NAME=\"login\" TYPE=\" TEXT\" SIZE=\" 12\" MAXLENGTH=\" 20\" value=\" "+user.getLogin()+"\">");
			         	out.println( "<P> password: <INPUT NAME=\"pass\" TYPE=\" TEXT\" SIZE=\" 12\" MAXLENGTH=\" 20\" value=\" " +user.getPass() +"\">");;
			         	out.println( "<P> email: <INPUT NAME=\"email\" TYPE=\" TEXT\" SIZE=\" 12\" MAXLENGTH=\" 20\" value=\""+user.getEmail()+"\">");
			         	out.println( "<P> ville: <INPUT NAME=\"ville\" TYPE=\" TEXT\" SIZE=\" 12\" MAXLENGTH=\" 20\" value=\""+user.getVille()+"\">");
			         	out.println("<P>  <INPUT TYPE=\"SUBMIT\"></P> </FORM>");
			         	out.println("</body></html>");		
			         	
			       
		}
	
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}
	
	}
