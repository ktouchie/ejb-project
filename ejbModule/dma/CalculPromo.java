package dma;

import java.time.LocalDate;
import java.time.Month;

import javax.ejb.Stateful;

import domaine.Prix;

@Stateful
public class CalculPromo {

	/**
	 * calcul un prix discount
	 * 
	 * @param prix
	 *            le prix de l'article
	 * @param taux
	 * @return l
	 */
<<<<<<< HEAD

	public double taux_discount(Prix prix, double taux, LocalDate date, int year) {

		LocalDate dateMinJanvier = LocalDate.of(year, 12, 31);
		LocalDate dateMaxJanvier = LocalDate.of(year, 2, 1);

		// date pour juin

		LocalDate dateMinJuin = LocalDate.of(year, 4, 31);
		LocalDate dateMaxJuin = LocalDate.of(year, 7, 1);
=======
	
	public double taux_discount(Prix prix, double taux, LocalDate date, int year) {		
		
		double prixHT = prix.getPrixHT();

		LocalDate dateMinJanvier = LocalDate.of(year, Month.DECEMBER, 31);
		LocalDate dateMaxJanvier = LocalDate.of((year + 1), Month.FEBRUARY, 1);
		
		//date pour juin
		
		LocalDate dateMinJuin = LocalDate.of(year, Month.APRIL, 31);
		LocalDate dateMaxJuin = LocalDate.of(year, Month.JUNE, 1);
		
		//date pour juin fin
		if (
				(dateMinJanvier.isBefore(date) && date.isBefore(dateMaxJanvier))	||
				(dateMinJuin.isBefore(date)&& date.isBefore(dateMaxJuin))
			) {	
			return (prixHT *taux);
		} else {
			return prixHT;
		}
>>>>>>> 7b2f1882fea86a715685f661f36d667a491b4ccd

		// date pour juin fin
		if ((date.isAfter(dateMinJanvier) && date.isBefore(dateMaxJanvier))

				|

		(date.isAfter(dateMinJuin) && date.isBefore(dateMaxJuin)

		)) {
			return (prix.getPrixHT() * taux);
		} else {
			return prix.getPrixHT();
		}

	}

}
