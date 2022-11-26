package study.lesson14.task2;

class Cow extends Animal {
    String color;

    private Cow() {
        super();
        System.out.println("I'm a cow!");
    }

    public Cow(String color) {
        this();
        this.color = color;
        System.out.println("I'm a " + color + " cow!");
    }
@Override
    public void sound() {
           System.out.println("Moo");
    }
}
