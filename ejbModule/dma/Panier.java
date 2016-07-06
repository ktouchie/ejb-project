package dma;

import java.util.ArrayList;

import javax.ejb.Stateful;

import domaine.Article;

@Stateful
public class Panier implements PanierRemote{
	
	ArrayList<Article> panier = new ArrayList<Article>();

	@Override
	public void ajouter(Article article) {
		panier.add(article);
	}

	@Override
	public void consulter() {
		
		for (Article a : panier) {
			int quantite = a.getQuantite();
			String nom = a.getNom();
			double prixItem = a.getPrixHT() * quantite;
			System.out.println(quantite + " " + nom + " " + prixItem);
		}
	}

	@Override
	public void vider() {
		panier.clear();
	}

}
