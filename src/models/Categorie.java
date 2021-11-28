package models;

public class Categorie {
	
	private Integer id_categorie;
	private String categorie;
	
	public Categorie(Integer id_categorie, String categorie) {
		
		this.id_categorie = id_categorie;
		this.categorie = categorie;
	}

	public Integer getId_categorie() {
		return id_categorie;
	}

	public void setId_categorie(Integer id_categorie) {
		this.id_categorie = id_categorie;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
