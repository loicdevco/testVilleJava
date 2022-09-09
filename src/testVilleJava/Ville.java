package testVilleJava;

public class Ville {

	String nomVille; // stock le nom de la ville
	String nomPays; // stock le nom du pays
	int nbreHabitants; // stock le nombre d'habitants

	// ici je place notre constructeur par defaut //
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;

	}

}
