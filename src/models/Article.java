package models;

public class Article {
	int idArticle;
	String nomArticle;
	float PrixUnitaire;
	float PrixGros;
	public Article() {
		super();
	}
	public Article(int idArticle,String nomArticle,float PrixUnitaire,float PrixGros) {
	this.idArticle=idArticle;
	this.nomArticle=nomArticle;
	this.PrixGros=PrixGros;
	this.PrixUnitaire=PrixUnitaire;
	
	}
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public float getPrixUnitaire() {
		return PrixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		PrixUnitaire = prixUnitaire;
	}
	public float getPrixGros() {
		return PrixGros;
	}
	public void setPrixGros(float prixGros) {
		PrixGros = prixGros;
	}
	
}
