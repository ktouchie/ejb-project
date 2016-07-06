package domaine;

import java.io.Serializable;

// implements Serializable because Prix objects are not primitifs. 
public class Prix implements Serializable {

	// non utilisé dans CalculTVA
	private int id_article;
	private double prixHT;

	//Constructs objects Prix without args 
	public Prix() {

	}

	public Prix(int id_article, double prixHT) {
		super();
		this.id_article = id_article;
		this.prixHT = prixHT;
	}

	public int getId_article() {
		return id_article;
	}

	public void setId_article(int id_article) {
		this.id_article = id_article;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

}
