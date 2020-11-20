package DAO;
import metier.utilisateur;
import java.sql.*;
import java.util.Vector;
public class GestUsersDao {

	@SuppressWarnings("deprecation")
	public utilisateur loadUser(String login, String pass){
		Connection conn = utilitaire.getConnection();
		utilisateur u= null;
	try {
	PreparedStatement ps=conn.prepareStatement("select * from utilisateur where login=? and pass=?");
	ps.setString(1,login); ps.setString(2,pass);
	ResultSet rsUser=ps.executeQuery();
	if(rsUser.next()){
	u=new utilisateur();
	u.setIdUser(new Integer(rsUser.getInt("id"))); u.setLogin(rsUser.getString("login")); u.setPass(rsUser.getString("pass")); 
	u.setEmail(rsUser.getString("email")); u.setVille(rsUser.getString("ville"));
	}
	} catch (SQLException e) { e.printStackTrace();
	}
	return u;
	}
	
	public utilisateur loadUser2(int id){
		Connection conn = utilitaire.getConnection();
		utilisateur u= null;
	try {
	PreparedStatement ps=conn.prepareStatement("select * from utilisateur where id=?");
	ps.setInt(1,id);
	ResultSet rsUser=ps.executeQuery();
	if(rsUser.next()){
	u=new utilisateur();
	u.setIdUser(new Integer(rsUser.getInt("id"))); u.setLogin(rsUser.getString("login")); u.setPass(rsUser.getString("pass")); 
	u.setEmail(rsUser.getString("email")); u.setVille(rsUser.getString("ville"));
	}
	} catch (SQLException e) { e.printStackTrace();
	}
	return u;
	}
	public void addUser(int id, String l,String p, String e,String v)
	{ Connection conn=utilitaire.getConnection();
	utilisateur u=null;
	try {
	PreparedStatement ps=conn.prepareStatement("insert into utilisateur (LOGIN,PASS,EMAIL,VILLE,id) values(?,?,?,?,?)");
	
	ps.setString(1,l); ps.setString(2,p); ps.setString(3,e); ps.setString(4,v); ps.setInt(5, id); ps.executeUpdate();
	} catch (SQLException e2) 
	{ e2.printStackTrace();}
	}
	public Vector selectAll(){
	Connection conn=utilitaire.getConnection(); 
	Vector users=new Vector();
	utilisateur u=null; 
	try {
	PreparedStatement ps=conn.prepareStatement("select * from utilisateur");
	ResultSet rsUser=ps.executeQuery();
	while(rsUser.next()){
	u=new utilisateur();
	u.setIdUser(new Integer(rsUser.getInt("id"))); u.setLogin(rsUser.getString("LOGIN"));
	u.setPass(rsUser.getString("PASS")); u.setEmail(rsUser.getString("EMAIL")); u.setVille(rsUser.getString("VILLE")); 
	users.add(u);
	}
	} catch (SQLException e) { e.printStackTrace();
	}
	return users;
	}


	public void deleteUser(Integer idUser) {
		Connection conn=utilitaire.getConnection();
	
		try {
			PreparedStatement ps=conn.prepareStatement("delete from utilisateur where id=? ");
			ps.setInt(1,idUser);
			ps.executeUpdate();
		} catch (SQLException e2) 
		{ e2.printStackTrace();}
		}


	public void update(int id,String email, String login , String pass, String ville)  {
		// TODO Auto-generated method stub
		Connection conn=utilitaire.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("UPDATE utilisateur SET  email=? , login =? , pass=? , ville=? WHERE id=? ");
			ps.setString(1,email);
			ps.setString(2,login);
			ps.setString(3,pass);
			ps.setString(4,ville);
			ps.setInt(5,id);
			ps.executeUpdate();
		} catch (SQLException e2) 
		{ e2.printStackTrace();}
		
	}
		
	}
