package ss7_abstract_class_and_interface.thuc_hanh.class_animal_interface_edible.animal;

import ss7_abstract_class_and_interface.thuc_hanh.class_animal_interface_edible.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}