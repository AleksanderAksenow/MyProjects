package study.lesson14.task2;

class Cat extends Animal {
    String color;

    private Cat() {
        super();
        System.out.println("I'm a cat!");
    }

    public Cat(String color) {
        this();
        this.color = color;
        System.out.println("I'm a " + color + " cat!");
    }
@Override
    public  void sound() {
              System.out.println("Meow");
    }
}
