package models;

public class Client {
	
	private int id_client;
	private String nom_client;
	private int cont_client;
	private String mail_client;
	private String adres_client;
	
	public Client(int id_client, String nom_client, int cont_client, String mail_client, String adres_client) {
		
		this.id_client = id_client;
		this.nom_client = nom_client;
		this.cont_client = cont_client;
		this.mail_client = mail_client;
		this.adres_client = adres_client;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public int getCont_client() {
		return cont_client;
	}

	public void setCont_client(int cont_client) {
		this.cont_client = cont_client;
	}

	public String getMail_client() {
		return mail_client;
	}

	public void setMail_client(String mail_client) {
		this.mail_client = mail_client;
	}

	public String getAdres_client() {
		return adres_client;
	}

	public void setAdres_client(String adres_client) {
		this.adres_client = adres_client;
	}

}
