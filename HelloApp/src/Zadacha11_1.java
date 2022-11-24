public class Zadacha11_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("Black");
        Cat cat = new Cat("White");
    }
}
class Animal {
    protected Animal() {
        System.out.println("I'm an animal");
    }
}
class Dog extends Animal {
    String color;
    private Dog() {
        System.out.println("I'm a dog!");
    }

    public Dog(String color) {
        new Dog();
        this.color = color;
        System.out.println("I'm a " + color + " dog!");
    }
}
class Cat extends Animal {
    String color;
    private Cat() {
        System.out.println("I'm a cat!");
    }
    public Cat(String color) {
        new Cat();
        this.color = color;
        System.out.println("I'm a " + color + " cat!");
    }

}


