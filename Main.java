// En java, Tout est objet. un objet et symboliser par une class caracterisé par ses attribut.
// En java, chaque class doit avoir son propre fichier et les class custom doivent etre mis dans des dossier 
// qui leurs servirons de package.

//pour importer la classe, on utilise le format import package.class
import classes.personnage; // on import la classe personnage
import classes.rapport;// on import la classe rapport
import java.util.HashMap;

public class Main // la class Main et la classe principal du programme celle que le compilo va chercher en premier
{
	public static void main(String[] args) { // on declare le constructeur (il est special pour le main car il a un type), l'arguments donné ici correspond au parametre a l'execution tkt on verra sa plus tard si tu veux
       
	   if (args.length < 2){
			System.out.println("ERROR: PLEASE GIVE 2 NAME AS PARAMETERS");	  
			System.exit(84); 
		}
		HashMap<String, personnage> args_to_perso = new HashMap<String, personnage>(); // sa c'est une hash map c'est super pratique
		// mais c'est pas le sujet la en se moment :)


		// on crée les objet. va voir le fichier personnage.java et rapport.java pour comprendre pourquoi je donne cette arguments.
		// un objet a comme type le nom de l'objet. new ici permet (si c'est comme en c++) d'allouer la memoire. (mais je suis pas sur
		// qu'en java sa marche pareil
		personnage Aya = new personnage("Aya"); 
		args_to_perso.put(Aya.name, Aya);
		personnage Saad = new personnage("Saad");
		args_to_perso.put(Saad.name, Saad);
		personnage Reda = new personnage("Reda");
		args_to_perso.put(Reda.name, Reda);
		for (int i = 0; i < 2; i ++){
			if (args_to_perso.get(args[i]) == null){
				System.out.println("UNOWN NAME");
				System.exit(84);
			}
		}
		rapport equal  = new rapport();
		System.out.println("la relation entre " + args[0] + " et " + args[1] + " est: " + equal.get(args_to_perso.get(args[0]), args_to_perso.get(args[1]))); // on print le resultat
		for (int i = 0; i < 2; i ++){
			if (args_to_perso.get(args[i]).is_beau_gosse() == true) {
				System.out.println(args[i] + " est beau/belle.");
			} else {
				System.out.println(args[i] + " est éclaté au sol.");
			}
		}
	}
}

