
public class TestSuperType {
    public static void newline() { System.out.println(); }
    public static void main(String[] args) {
        newline();

        AnimalCat cat_1 = new AnimalCat();
        cat_1.setMakeSoundBehavior(new MakeSoundCat());

        AnimalCat cat_2 = new AnimalCat();
        cat_2.setMakeSoundBehavior(new MakeSoundCat());

        AnimalDog dog_1 = new AnimalDog();
        dog_1.setMakeSoundBehavior(new MakeSoundDog());

        AnimalDog dog_2 = new AnimalDog();
        dog_2.setMakeSoundBehavior(new MakeSoundDog());

        Animal [] animals = new Animal[] {
            cat_1, cat_2, dog_1, dog_2
        };

        for (Animal animal : animals) {
            animal.display();
            animal.performMakeSound();
        }
        
    }
}
