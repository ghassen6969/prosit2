public class Main {
    public static void main(String[] args) {
        // Création d'un animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d'un zoo
        Zoo myZoo = new Zoo("Safari Park", "Paris", 10, 25);

        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des informations du zoo
        myZoo.displayZoo();

        // Affichage du zoo directement
        System.out.println(myZoo);

        // Affichage des informations de l'animal
        System.out.println(lion);
    }
}
