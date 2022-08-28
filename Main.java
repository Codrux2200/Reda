// En java, Tout est objet. un objet et symboliser par une class caracterisé par ses attribut.
// En java, chaque class doit avoir son propre fichier et les class custom doivent etre mis dans des dossier 
// qui leurs servirons de package.

//pour importer la classe, on utilise le format import package.class
import classes.personnage; // on import la classe personnage
import classes.rapport;// on import la classe rapport

public class Main // la class Main et la classe principal du programme celle que le compilo va chercher en premier
{
	public static void main(String[] args) { // on declare le constructeur (il est special pour le main car il a un type), l'arguments donné ici correspond au parametre a l'execution tkt on verra sa plus tard si tu veux
       // on crée les objet. va voir le fichier personnage.java et rapport.java pour comprendre pourquoi je donne cette arguments.
		personnage Aya = new personnage("Aya"); 
		personnage Saad = new personnage("Saad");
		personnage Reda = new personnage("Reda");
		rapport equal  = new rapport();
		System.out.println(equal.get(Reda, Aya)); // on print le resultat
	}
}

