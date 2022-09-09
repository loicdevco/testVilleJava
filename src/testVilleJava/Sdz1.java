package testVilleJava;

public class Sdz1 {

	public static void main(String[] args) {
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 123456, "France");
		Ville v2 = new Ville("Rio", 987654, "Brésil");

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
	}

}
