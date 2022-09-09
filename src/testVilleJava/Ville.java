package testVilleJava;

public class Ville {

	private String nomVille; // stock le nom de la ville
	private String nomPays; // stock le nom du pays
	private int nbreHabitants; // stock le nombre d'habitants
	private char categorie; // stocke la categorie (apprentissage du this)

	// Différentes variables de class

	// variables public qui comptent le nombre d'instance
	public static int nbreInstances = 0;
	// variables public qui comptent le nombre d'instance
	private static int nbreInstancesbis = 0;

	// ici je place notre constructeur par defaut //
	public Ville() {
		System.out.println("Création d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();

		// on incremente nos variables à chaque appel du constructeur
		nbreInstances++;
		nbreInstancesbis++;

	}

	// ici constructeur avec paramètre //
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();

		// on incremente nos variables à chaque appel du constructeur
		nbreInstances++;
		nbreInstancesbis++;
	}

	// Sans toucher aux constructeurs on créé les accesseurs et les mutateurs

	// ************** Accesseurs ***********************//
	// L'accesseur permet d'atteindre nos variables protéger par la méthode private
	// //

	// retourne le nom de la ville

	public String getNom() {
		return nomVille;
	}

	// retourne le nom du pays

	public String getNomPays() {
		return nomPays;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	// ********************* Mutateurs **********************//

	// Définit le nom de la ville

	public void setNom(String pNom) {
		nomVille = pNom;
	}

	// Définit le nom du pays

	public void setNomPays(String pPays) {
		nomPays = pPays;
	}

	public void setNombreHabitants(int nbre) {
		nbreHabitants = nbre;
		this.setCategorie();
	}

	// Définir la categorie de la ville en fonction du nombre d'habitants
	private void setCategorie() {

		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;
		this.categorie = categories[i];
	}

	// retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nbreHabitants + ", elle comporte : "
				+ this.nbreHabitants + " habitant(s) => elle est donc de catégorie : " + this.categorie;
	}

	// Retourne une chaîne de caractère suivant le résultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNom() + " est une ville plus peuplée que " + this.nomVille;
		else
			str = this.nomVille + " est une ville plus peuplée que " + v1.getNom();

		return str;
	}

	public static int getNombreInstancesBis() {
		return nbreInstancesbis;
	}

}
