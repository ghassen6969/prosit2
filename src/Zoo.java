public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals];
    }

    // Méthode pour ajouter un animal
    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        }
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo [name=").append(name).append(", city=").append(city).append(", nbrCages=").append(nbrCages).append("]");
        return sb.toString();
    }
}
