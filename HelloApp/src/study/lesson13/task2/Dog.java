package study.lesson13.task2;

class Dog extends Animal {
    String color;

    private Dog() {
        super("Dog");
        System.out.println("I'm a dog!");
    }

    public Dog(String color) {
        super("Dog");
        //   new Dog();
        this.color = color;
        System.out.println("I'm a " + color + " dog!");
    }

    public static void Woof() {
        //   System.out.println("Woof");
        Animal.Sound("Woof");
    }
}
