package dma;

import java.time.LocalDate;
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

	public double taux_discount(Prix prix, double taux, LocalDate date, int year) {

		LocalDate dateMinJanvier = LocalDate.of(year, 12, 31);
		LocalDate dateMaxJanvier = LocalDate.of(year, 2, 1);

		// date pour juin

		LocalDate dateMinJuin = LocalDate.of(year, 4, 31);
		LocalDate dateMaxJuin = LocalDate.of(year, 7, 1);

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
