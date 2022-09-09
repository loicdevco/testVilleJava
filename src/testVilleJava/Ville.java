package testVilleJava;

public class Ville {

	private String nomVille; // stock le nom de la ville
	private String nomPays; // stock le nom du pays
	private int nbreHabitants; // stock le nombre d'habitants

	// ici je place notre constructeur par defaut //
	public Ville() {
		System.out.println("Cr�ation d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;

	}

	// ici constructeur avec param�tre //
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Cr�ation d'une ville avec des param�tres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
	}

	// Sans toucher aux constructeurs on cr�� les accesseurs et les mutateurs

	// ************** Accesseurs ***********************//
	// L'accesseur permet d'atteindre nos variables prot�ger par la m�thode private
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

	// D�finit le nom de la ville

	public void setNom(String pNom) {
		nomVille = pNom;
	}

	// D�finit le nom du pays

	public void setNomPays(String pPays) {
		nomPays = pPays;
	}

	public void setNombreHabitants(int nbre) {
		nbreHabitants = nbre;
	}
}
