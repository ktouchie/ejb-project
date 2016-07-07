package dma;

import java.time.LocalDate;
import java.time.Month;
import javax.ejb.Stateful;
import domaine.Prix;

@Stateful
public class CalculPromo {

	public double taux_discount(Prix prix, double taux, LocalDate date, int year) {

		double prixHT = prix.getPrixHT();
		LocalDate dateMinJanvier = LocalDate.of(year, Month.DECEMBER, 31);
		LocalDate dateMaxJanvier = LocalDate.of((year + 1), Month.FEBRUARY, 1);

		// date pour juin

		LocalDate dateMinJuin = LocalDate.of(year, Month.APRIL, 31);
		LocalDate dateMaxJuin = LocalDate.of(year, Month.JUNE, 1);

		// date pour juin fin
		if ((dateMinJanvier.isBefore(date) && date.isBefore(dateMaxJanvier))
				|| (dateMinJuin.isBefore(date) && date.isBefore(dateMaxJuin))) {
			return (prixHT * taux);
		} else {
			return prixHT;
		}
	}

}