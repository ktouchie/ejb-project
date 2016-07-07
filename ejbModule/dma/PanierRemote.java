package dma;

import java.util.ArrayList;

import javax.ejb.Remote;

import domaine.Article;

@Remote
public interface PanierRemote {

    public void ajouter(Article article, int quantite, double remise);

    public ArrayList<Article> consulter();

    public void vider();

}
