package dma;

import java.util.ArrayList;

import domaine.Article;

public class Catalog {

	public static void main(String[] args) {

		Article beer1 = new Article("001", "Super Bock", 2.50);
		Article beer2 = new Article("002", "La Chouffe", 2.50);
		Article beer3 = new Article("003", "Delerium Tremens", 3.00);
		
		Article wine1 = new Article("004", "Chardonnay", 10.00);
		Article wine2 = new Article("005", "St. Emilion", 15.00);
		Article wine3 = new Article("006", "Tattinger", 30.00);
		
		Article hard1 = new Article("007", "Vodka", 16.00);
		Article hard2 = new Article("008", "Rhum", 18.00);
		Article hard3 = new Article("009", "Tequila", 20.00);
		
		ArrayList<Article> catalog = new ArrayList<Article>();
		
		catalog.add(beer1);
		catalog.add(beer2);
		catalog.add(beer3);
		
		catalog.add(wine1);
		catalog.add(wine2);
		catalog.add(wine3);
		
		catalog.add(hard1);
		catalog.add(hard2);
		catalog.add(hard3);
	}

}
