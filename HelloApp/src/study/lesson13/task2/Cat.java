package study.lesson13.task2;

class Cat extends Animal {
    String color;

    private Cat() {
        super("Cat");
        System.out.println("I'm a cat!");
    }

    public Cat(String color) {
        //super("Cat");
        this();
        this.color = color;
        System.out.println("I'm a " + color + " cat!");
    }

    public  void meow() {
        //      System.out.println("Meow");
        this.sound("Meow");
    }
}
