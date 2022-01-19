package oop.oop_part2.polymorphism;

public class PolymorphicArray {
    public static void main(String[] args) {
        Collie collie1 = new Collie();
        Dog dog1 =  new Collie();
        Animal animal1 = new Animal();

        Dog dog2 =  new Collie();
        Animal Animal2 =  new Dog();
        Animal animal3 =  new Collie();

       Animal[] animals =  {collie1, dog1, dog2, animal1, animal3};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
