
package ch01_delegateSuperType;
public class MakeSoundDog implements MakeSoundBehavior {

    @Override
    public void makeSound() {
        System.out.println("dog say: bark");
    }
    
}
