package dma;

import java.util.ArrayList;

import javax.ejb.Stateful;

import domaine.Article;

@Stateful
public class Panier implements PanierRemote {

    ArrayList<Article> panier = new ArrayList<Article>();

    @Override
    public void ajouter(Article article, int quantite, double remise) {
	String id = article.getId();
	String nom = article.getNom();
	double prixHT = article.getPrixHT();
	article = new Article(id, nom, prixHT, quantite, remise);
	panier.add(article);
    }

    @Override
    public ArrayList<Article> consulter() {
	return panier;
    }

    @Override
    public void vider() {
	panier.clear();
    }
}
