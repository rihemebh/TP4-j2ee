package metier;

public class utilisateur {
		static int nb=2;
		private Integer idUser; 
		private String login; private String pass; private String email; private String ville;
		private String name;
		public utilisateur() {
			nb++;
			this.idUser=nb;
		
		}
		public utilisateur(String name, String login, String pass, String email, String ville) {
			super();
			nb++;
			this.idUser=nb;
			this.login = login;
			this.pass = pass;
			this.email = email;
			this.ville = ville;
			this.name = name;
		}
		public String getEmail() { return email;
		}
		public void setEmail(String email) { this.email = email;
		}
		public Integer getIdUser() { return idUser;
		}
		public void setIdUser(Integer idUser) { this.idUser = idUser;
		}
		public String getLogin() { return login;
		}
		public void setLogin(String login) { this.login = login;
		}
		public String getPass() { return pass;
		}
		public void setPass(String pass) { this.pass = pass;
		}
		public String getVille() { return ville;
		}
		public void setVille(String ville) { this.ville = ville;
		}}