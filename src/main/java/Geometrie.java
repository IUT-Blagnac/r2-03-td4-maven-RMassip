
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Geometrie
{
    /**
     * @param diametre
     *      Le diametre du disque (nombre positif).
     * @return la surface du disque
     */
    public static double surfaceDisque(double diametre) {
        double pi, rayon, surface;
        // Endroit pour transcrire l'algorithme en Java
        pi=3.14;
        surface=pi*(diametre/2)*(diametre/2);
        return surface;
    }

    /**
     * @param longueur
     *      La longueur du rectangle (nombre positif).
     * @param largeur
     *      La largeur du rectangle (nombre positif, inférieur ou égal à la longueur).
     * @return la surface du rectangle
     */
    public static double surfaceRectangle(double longueur, double largeur) {
        double surface;
        // Endroit pour transcrire l'algorithme en Java
        surface=longueur*largeur;
        return surface;
        //jeu d'essais
        //  entrée          sortie
        //longueur largeur
        //  10        5      50
        //   2        1      2
        //   0        0      0

    }

    /**
     * @param cote
     *      La longueur d'un cote du carré (nombre positif).
     * @return la surface du carré
     */
    public static double surfaceCarre(double cote) {
        double surface;
        surface = surfaceRectangle(cote, cote);
        return surface;
    }

    /**
     * Surface du gazon, en m2. Toutes les données sont en m.
     * Terrain, maison, appenti et piscine s'organisent comme vu en TD.
     */
    public static double surfaceGazon(double longueurTerrain, double largeurTerrain,
    double diametrePiscine, double longueurMaison, double largeurMaison, double longueurAppenti) {
        double surfaceGazon;

        /* déclaration des variables de travail */
        // à vous !
        double maison;
        double appenti;
        double piscine;
        double terrain;

        /* calcul de la surface à tondre */
        // à vous !
        maison=largeurMaison*longueurMaison;
        appenti=(largeurMaison*longueurAppenti)/2;
        piscine=3.14*(diametrePiscine/2)*(diametrePiscine/2);
        terrain=largeurTerrain*longueurTerrain;
        surfaceGazon=terrain-(maison+appenti+piscine);

        return surfaceGazon;
        //jeu de test  20 ,10 , 2, 7, 5, 3 ---> 154.36
    }

    /**
     * Affiche les informations sur la tonte du gazon. Toutes les données sont en m.
     */
    public static void informationTonte(double longueurTerrain, double largeurTerrain,
    double diametrePiscine, double longueurMaison, double largeurMaison, double longueurAppenti) {
        /* déclaration des variables de travail */
        // à vous !
        double surfaceGazon,maison,appenti,piscine,terrain,vitesse,duree;

        /* Calcul */
        // à vous !
        maison=largeurMaison*longueurMaison;
        appenti=(largeurMaison*longueurAppenti)/2;
        piscine=3.14*(diametrePiscine/2)*(diametrePiscine/2);
        terrain=largeurTerrain*longueurTerrain;
        surfaceGazon=terrain-(maison+appenti+piscine);

        vitesse=100;
        duree=(surfaceGazon*1)/vitesse;

        /* Affichage */
        // à vous !
        System.out.println("La surface a tondre est de "+surfaceGazon+"m²");
        System.out.println("Cela va prendre "+duree+"h");
        //jeu de test1  20 ,10 , 2, 7, 5, 3 ---> 154.36 1.5436
        //jeu de test2  10 ,5 , 1, 3.5, 2.5, 1.5 ---> 154.36 1.5436
    }

    /**
     * @param petit et grand rayons
     *      petit rayon doit etre positif et plus grand que le grand rayon
     * @return la surface de l'ovale grace a la formule pi*petitRayon*grandRayon
     */
    public static double surfaceOvale(double petitRayon, double grandRayon) {
        double pi,surface;
        pi=3.14;
        surface=pi*petitRayon*grandRayon;
        return surface;
    }
    public static void main(String[] args){
        System.out.println("ça marche");
    }
}   

