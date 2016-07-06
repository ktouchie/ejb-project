package dma;

import javax.ejb.Remote;

import domaine.Article;

@Remote
public interface PanierRemote {
	
	
	public void ajouter(Article article, int quantite, double remise);		
		

	public void consulter();

	
	public void vider();

		
	}


