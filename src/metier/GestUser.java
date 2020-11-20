package metier;
import java.util.Vector;
import DAO.GestUsersDao;
public class GestUser {
	GestUsersDao dao;
 
 public GestUser()
	{
	dao =new GestUsersDao();
	}
 
	public utilisateur chercher(String login, String pass){
	return dao.loadUser(login, pass);
	}
	
	public void ajouter(utilisateur u){
	dao.addUser(u.getIdUser(), u.getLogin(), u.getPass(),u.getEmail(),u.getVille());
	}
	public Vector lister(){
	return dao.selectAll();
	}
	
	public void supprimer(int id) {
		dao.deleteUser(id);
	}
	public void update(int id, String email, String login , String pass, String ville) {
		dao.update(id,email,login,pass,ville);
	}

	public utilisateur getUser(int id) {
		return dao.loadUser2(id);
		
	}
	}



