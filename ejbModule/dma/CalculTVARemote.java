package dma;

import javax.ejb.Remote;

import domaine.Prix;

@Remote
public interface CalculTVARemote {
	
	public double calculerTVA(Prix prix);

}
