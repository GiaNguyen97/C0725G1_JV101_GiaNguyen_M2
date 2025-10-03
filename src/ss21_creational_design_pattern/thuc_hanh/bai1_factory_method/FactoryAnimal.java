package ss21_creational_design_pattern.thuc_hanh.bai1_factory_method;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
