package dma;

import javax.ejb.Stateful;

import domaine.Prix;

@Stateful
public class CalculTTC  {

	public double calculTTC(Prix prix) {

		return (prix.getPrix_ht() * 0.20) + prix.getPrix_ht();

	}

}
