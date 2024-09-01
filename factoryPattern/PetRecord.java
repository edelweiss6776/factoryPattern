package factoryPattern;

public class PetRecord {
    private String animalID;
    private String animalName;
    private Animal animal;

    public AnimalProfile(String animalID, String animalName, Animal animal) {
        this.animalID = animalID;
        this.animalName = animalName;
        this.animal = animal;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void displayDetails() {
        System.out.println("Animal ID: " + animalID);
        System.out.println("Animal Name: " + animalName);
        animal.makeNoise();
        animal.performActivity();
        if (animal instanceof Canine) {
            System.out.println("Breed: " + ((Canine) animal).getType());
        } else if (animal instanceof Feline) {
            System.out.println("Lives Left: " + ((Feline) animal).getLivesLeft());
        }
    }
}
