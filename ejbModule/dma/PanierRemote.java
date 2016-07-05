package dma;

import javax.ejb.Remote;

import domaine.Article;

@Remote
public interface PanierRemote {
	
	
	public void ajouter(Article article);
		
		

	public void consulter();

	
	public void vider();
		
	}


