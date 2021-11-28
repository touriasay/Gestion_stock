package models;

import java.util.Date;
public class Commande {
	
	private int id_comd;
	//private List(Article) = new ArrayList;
	private Date date_comnd;
	
	public Commande(int id_comd, Date date_comnd) {
		
		this.id_comd = id_comd;
		this.date_comnd = date_comnd;
	}

	public int getId_comd() {
		return id_comd;
	}

	public void setId_comd(int id_comd) {
		this.id_comd = id_comd;
	}

	public Date getDate_comnd() {
		return date_comnd;
	}

	public void setDate_comnd(Date date_comnd) {
		this.date_comnd = date_comnd;
	}	

}
