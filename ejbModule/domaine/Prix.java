package domaine;

import java.io.Serializable;

// implements Serializable because Prix objects are not primitifs. 
public class Prix implements Serializable {

	// non utilisé dans CalculTVA
	private int id_article;
	private double prix_ht;

	//Constructs objects Prix without args 
	public Prix() {

	}

	public Prix(int id_article, double prix_ht) {
		super();
		this.id_article = id_article;
		this.prix_ht = prix_ht;
	}

	public int getId_article() {
		return id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public double getPrix_ht() {
		return prix_ht;
	}

	public void setPrix_ht(double prix_ht) {
		this.prix_ht = prix_ht;
	}

}
