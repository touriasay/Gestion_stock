package models;

public class Utilisateur {
	
	private int id_user;
	private String nom_user;
	private String login;
	private String motDePasse;
	
	public Utilisateur(int id_user, String nom_user, String login, String motDePasse) {
		
		this.id_user = id_user;
		this.nom_user = nom_user;
		this.login = login;
		this.motDePasse = motDePasse;
	}
	
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
