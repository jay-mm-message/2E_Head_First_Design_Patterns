
package ch01_delegateSuperType;
public class MakeSoundCat implements MakeSoundBehavior {

    @Override
    public void makeSound() {
        System.out.println("cat say: wow");
    }
    
}
