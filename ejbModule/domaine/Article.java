package domaine;

public class Article {
	
	public String id;
	public String nom;
	public double prixHT;
	public double remise;
	public int quantite;
	
	public Article(String id, String nom, double prixHT, double remise,
			int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixHT = prixHT;
		this.remise = remise;
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

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
