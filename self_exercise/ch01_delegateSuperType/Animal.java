package ch01_delegateSuperType;
public abstract class Animal {
    // delegate
    MakeSoundBehavior makeSoundBehavior;

    public void setMakeSoundBehavior(MakeSoundBehavior mb) { 
        makeSoundBehavior = mb;
    }
    public void performMakeSound() {
        makeSoundBehavior.makeSound();
    }
    public abstract void display();
}
