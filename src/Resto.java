import java.util.Scanner;

public class Resto {

	public static void main(String[] args) {
		
		// Creating the menus
		String [] starter = { "Salade", "Soupe", "Quiche", "Aucune" };
		String [] mainDish = { "Poulet", "Boeuf", "Poisson", "Végétarien", "Vegan", "Aucun" };
		String [] sideDish = { "Riz", "Pâtes", "Frites", "Légumes", "Aucun" };
		String [] dessert = { "Tarte maison", "Mousse au chocolat", "Tiramisu", "Aucun" };
		String [] drinks = { "Eau plate", "Eau gazeuse", "Soda", "Vin", "Aucune" };
		
		// Creating the scanner
		Scanner scan = new Scanner(System.in);
		
		// Number of menus
        System.out.print("Bonjour, combien de menus souhaitez-vous ? (saisissez un numéro) ");
		int numMenus = scan.nextInt();
		System.out.println();
		
		// Taking the order loop
		for (int i = 0; i < numMenus; i++) {
			
			// Taking the order
			System.out.println("Prise de la commande numéro " + numMenus);
			System.out.println();
			
			// Starter
			System.out.println("Choix de l'entrée (saisissez un numéro)");
			for (int j = 0; j < starter.length; j++) {
	            String value = starter[j];
	            System.out.print((j + 1) + " - " + value + " ");
			}
			int numStarter = scan.nextInt();
			String nameStarter = starter[numStarter - 1];
			System.out.println();
			
			// Main dish
			System.out.println("Choix du plat (saisissez un numéro)");
			for (int j = 0; j < mainDish.length; j++) {
	            String value = mainDish[j];
	            System.out.print((j + 1) + " - " + value + " ");
			}
			int numMainDish = scan.nextInt();
			String nameMainDish = mainDish[numMainDish - 1];
			System.out.println();
			
			// Side dish
			System.out.println("Choix de l'accompagnement (saisissez un numéro)");
			for (int j = 0; j < sideDish.length; j++) {
	            String value = sideDish[j];
	            System.out.print((j + 1) + " - " + value + " ");
			}
			int numSideDish = scan.nextInt();
			String nameSideDish = sideDish[numSideDish - 1];
			System.out.println();
			
			// Dessert
			System.out.println("Choix du dessert (saisissez un numéro)");
			for (int j = 0; j < dessert.length; j++) {
	            String value = dessert[j];
	            System.out.print((j + 1) + " - " + value + " ");
			}
			int numDessert = scan.nextInt();
			String nameDessert = dessert[numDessert - 1];
			System.out.println();
			
			// Drinks
			System.out.println("Choix des boissons (saisissez un numéro)");
			for (int j = 0; j < drinks.length; j++) {
	            String value = drinks[j];
	            System.out.print((j + 1) + " - " + value + " ");
			}
			int numDrinks = scan.nextInt();
			String nameDrinks = drinks[numDrinks - 1];
			System.out.println();
			
			// Menu display
			System.out.println("Contenu de la commande " + (numMenus - 1) + " :");
			System.out.println(nameStarter + ", " + nameMainDish + ", " + nameSideDish + ", " + nameDessert + ", " + nameDrinks);
			System.out.println();
		}
		
		// Closing the scanner
		scan.close();
	}
}