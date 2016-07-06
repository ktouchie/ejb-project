package dma;

import javax.ejb.Stateful;

import domaine.Prix;

/**
 * Session Bean implementation class CalculTTC
 */
@Stateful
public class CalculTTC implements CalculTTCRemote {

    /**
     * Default constructor. 
     */
    public CalculTTC() {
        // TODO Auto-generated constructor stub
    }
    
    public double calculerTTC(Prix prix) {

		return (prix.getPrixHT() * 0.20) + prix.getPrixHT();

	}

}
