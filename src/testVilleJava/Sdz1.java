package testVilleJava;

public class Sdz1 {

	public static void main(String[] args) {

		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 1236, "France");
		Ville v2 = new Ville("Rio", 321654, "Brésil");

		// Affiche le résultat du nombre d'instance de la classe Ville
		System.out.println("Le nombre d'instances de la classe ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe ville est : " + Ville.getNombreInstancesBis());

		System.out.println("\n v = " + v.getNom() + " ville de " + v.getNbreHabitants() + " habitants se situant en "
				+ v.getNomPays());
		System.out.println(" v1 = " + v1.getNom() + " ville de " + v1.getNbreHabitants() + " habitants se situant en "
				+ v1.getNomPays());
		System.out.println(" v2 = " + v2.getNom() + " ville de " + v2.getNbreHabitants() + " habitants se situant au "
				+ v2.getNomPays() + "\n\n");

		/*
		 * Interchangeons les villes v1 et v2 avec un objet ville temporaire
		 */

		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;

		System.out.println(" v1 =" + v1.getNom() + " ville de " + v1.getNbreHabitants() + " habitants se situant au "
				+ v1.getNomPays());
		System.out.println(" v2 =" + v2.getNom() + " ville de " + v2.getNbreHabitants() + " habitants se situant en "
				+ v2.getNomPays() + "\n\n");

		/*
		 * Interchangeons les nom par l'intermédiaire des mutateurs
		 */

		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");

		System.out.println(" v1 = " + v1.getNom() + " ville de " + v1.getNbreHabitants() + " habitants se situant au "
				+ v1.getNomPays());
		System.out.println(" v1 = " + v2.getNom() + " ville de " + v2.getNbreHabitants() + " habitants se situant en "
				+ v2.getNomPays() + "\n\n");

		/*
		 * Test de la fonctionnalite this avec la categorie des villes
		 */

		System.out.println("\n\n" + v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi() + "\n\n");
		System.out.println(v1.comparer(v2));

		class Capitale extends Ville {
			private String monument;

			// constructeur par défaut
			public Capitale() {
				super();
				monument = "aucun";
			}

			// Constructeur d'initialisation
			public Capitale(String nom, int hab, String pays, String monument) {
				super(nom, hab, pays);
				this.monument = monument;
			}

			public String decrisToi() {
				String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument.";
				System.out.println("Invocation de super.decrisToi()");
				return str;
			}

			public String toString() {
				String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
				return str;
			}

			// retourne le nom du monument
			public String getMonument() {
				return monument;
			}

			// definir le nom du monument
			public void setMonument(String monument) {
				this.monument = monument;
			}
		}
		Capitale cap = new Capitale("Paris", 165002, "France", "Tour eiffel");
		System.out.println("\n" + cap.decrisToi());

		// Définition d'un tableau de ville
		Ville[] tableau = new Ville[6];

		// Définition d'un tableau de nom de villes et un autre du nbre d'habitants
		String[] tab = { "Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes" };
		int[] tab2 = { 123456, 3214566, 124564, 987654, 258963, 12547896 };

		// Les trois premiers doivent être des villes et le reste des capitales
		for (int i = 0; i < 6; i++) {
			if (i < 3) {
				Ville V = new Ville(tab[i], tab2[i], "France");
				tableau[i] = V;
			}

			else {
				Capitale C = new Capitale(tab[i], tab2[i], "France", "La tour Eiffel");
				tableau[i] = C;
			}
		}
		// Affichage de notre tableau
		for (Ville V : tableau) {
			System.out.println(V.decrisToi() + "\n");
		}

		for (Object obj : tableau) {
			System.out.println(obj.toString() + "\n");
		}

	}

}
