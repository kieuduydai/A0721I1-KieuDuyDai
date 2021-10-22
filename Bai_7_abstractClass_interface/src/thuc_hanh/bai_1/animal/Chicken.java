package thuc_hanh.bai_1.animal;

import thuc_hanh.bai_1.edible.*;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
