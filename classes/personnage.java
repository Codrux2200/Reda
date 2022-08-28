package classes; // on l'insere dans le package classes 

public class personnage { // une classe independante et forcement public.
    public String name = ""; // sa c'est un attribut c'est un peux si tu veux l'identité de la classe se qui la differencier des autres ou pas.
    // bien sur tu peux mettre autant d'attribut que tu veux. l'attribut peut etre public ou private. si il est private il ne sera pas accesible
    // a l'exterieur de la class. ici comme on s'en fout de la securité il est en public.
    // un attribut en gros c'est une variables ou des objets nécessaires au fonctionnement de l'objet.
    public personnage(String name){ // chaque class a un constructeur il s'ecrit sous la forme public nom_de_la_classe et c'est une methode qui
    // s'execute automatiquement a la creaction de l'objet. ici le constrcuteur prend name comme arguments;
        this.name = name; // si un argument et un attribut on le meme nom. on utilise le prefixe this pour les differencier. this.name ici
        // etant l'attribut
    }
}