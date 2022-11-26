package study.lesson14.task2;

class Dog extends Animal {
    String color;

    private Dog() {
        super();
        System.out.println("I'm a dog!");
    }

    public Dog(String color) {
        this();
        this.color = color;
        System.out.println("I'm a " + color + " dog!");
    }
@Override
    public void sound() {
        System.out.println("Woof");
    }
}
