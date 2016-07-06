package domaine;

public class Article {
	
	public String id;
	public String nom;
	public double prixHT;
	public int quantite;
	public double remise;
	
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
		this.remise = remise;
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
}
