// va voir personnage.java avant

package classes;
import classes.personnage;

public class rapport{
    private personnage exchange = new personnage("Aya"); // attribut fixe
    public rapport(){} // constructeur vide;
    
    public String get(personnage a,personnage b){ // on crée une methode get en public et qui retourne une String comme tu peux le voir
    // on donne en parametre des objets. comme je te l'ai dit tout est objet en java. donc sa ne derange pas.
        if (b.name.equals("Aya")){ // pour pas avoir a faire des if pour rien. Et comme Aya et la dans tout les cas de figures dans
        // notre exemple alors on va faire en sorte que Aya soit tout le temps dans l'objet A. si elle est dans le B on echange
            b = a;
            a = exchange;
        }
        if (a.name.equals("Aya") && b.name.equals("Reda")){ // test est return
            return "amis";
        } else if (a.name.equals("Aya") && b.name.equals("Saad")){
            return null;
        } else if ((a.name.equals("Reda") && b.name.equals("Saad")) || (a.name.equals("Saad") && b.name.equals("Reda"))) {
            return "amis";
        } else {
            return "undifined";
        }
    }
}