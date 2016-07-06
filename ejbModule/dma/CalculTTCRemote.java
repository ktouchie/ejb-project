package dma;

import javax.ejb.Remote;

import domaine.Prix;

@Remote
public interface CalculTTCRemote {
	
	public double calculerTTC(Prix prix);

}
