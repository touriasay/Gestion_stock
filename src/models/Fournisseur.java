package models;

public class Fournisseur {
	
	private int id_four;
	private String nom_four;
	private int cont_four;
	private String mail_four;
	private int cp_four;
	private String ville;
	private String adre_four;
	
	public Fournisseur(int id_four, String nom_four, int cont_four, String mail_four, int cp_four, String ville,
			String adre_four) {
		
		this.id_four = id_four;
		this.nom_four = nom_four;
		this.cont_four = cont_four;
		this.mail_four = mail_four;
		this.cp_four = cp_four;
		this.ville = ville;
		this.adre_four = adre_four;
	}
	
	public int getId_four() {
		return id_four;
	}
	public void setId_four(int id_four) {
		this.id_four = id_four;
	}
	public String getNom_four() {
		return nom_four;
	}
	public void setNom_four(String nom_four) {
		this.nom_four = nom_four;
	}
	public int getCont_four() {
		return cont_four;
	}
	public void setCont_four(int cont_four) {
		this.cont_four = cont_four;
	}
	public String getMail_four() {
		return mail_four;
	}
	public void setMail_four(String mail_four) {
		this.mail_four = mail_four;
	}
	public int getCp_four() {
		return cp_four;
	}
	public void setCp_four(int cp_four) {
		this.cp_four = cp_four;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdre_four() {
		return adre_four;
	}
	public void setAdre_four(String adre_four) {
		this.adre_four = adre_four;
	}
	
	

}
