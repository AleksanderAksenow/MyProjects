package study.lesson13.task2;

class Dog extends Animal {
    String color;

    private Dog() {
        super("Dog");
        System.out.println("I'm a dog!");
    }

    public Dog(String color) {
        //super("Dog");
        this();
        this.color = color;
        System.out.println("I'm a " + color + " dog!");
    }

    public void woof() {
        //   System.out.println("Woof");
        this.sound("Woof");
    }
}
