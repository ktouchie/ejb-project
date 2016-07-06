package domaine;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Article {
	
	NumberFormat formatter = new DecimalFormat("#0.00");
	
	public String id;
	public String nom;
	public double prixHT;
	public int quantite;
	
	public Article(String id, String nom, double prixHT) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixHT = prixHT;
	}
	
	public Article(String id, String nom, double prixHT, int quantite, double remise) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixHT = prixHT;
		this.quantite = quantite;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		if (quantite == 0) {
			return "Article " + id + ":  " + nom + "   " + formatter.format(prixHT)
					+ " €  (par unité)";
		} else {
			return "Article " + id + ":  " + nom + "   " + formatter.format(prixHT)
					+ " €   x" + quantite + " ==> " + (quantite*prixHT);
		}
	}
	
}
