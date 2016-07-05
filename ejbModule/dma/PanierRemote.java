package dma;

import javax.ejb.Remote;

@Remote
public interface PanierRemote {
	public void ajouter(Article article);
	public void consulter();
	public void vider();
}
