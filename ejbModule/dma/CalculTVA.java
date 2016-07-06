package dma;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import domaine.Prix;

/**
 * Session Bean implementation class CalculTVA
 */
@Stateful
public class CalculTVA implements CalculTVARemote {

    /**
     * Default constructor. 
     */
    public CalculTVA() {
        // TODO Auto-generated constructor stub
    }

    private double taux_tva = 0.20;
	
	public double calculerTVA(Prix prix){
		return prix.getPrix_ht() * this.taux_tva;
				//prix.getPrix_ht() * this.taux_tva;
		 
	}
    
   	
    }

