package models;

public class Stock {
	
	private int stock_min;
	private int stock_max;
	private int nbr_article;
	private String article;
	
	public Stock(int stock_min, int stock_max, int nbr_article, String article) {
		
		this.stock_min = stock_min;
		this.stock_max = stock_max;
		this.nbr_article = nbr_article;
		this.article = article;
	}

	public int getStock_min() {
		return stock_min;
	}

	public void setStock_min(int stock_min) {
		this.stock_min = stock_min;
	}

	public int getStock_max() {
		return stock_max;
	}

	public void setStock_max(int stock_max) {
		this.stock_max = stock_max;
	}

	public int getNbr_article() {
		return nbr_article;
	}

	public void setNbr_article(int nbr_article) {
		this.nbr_article = nbr_article;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}
	
	

}
