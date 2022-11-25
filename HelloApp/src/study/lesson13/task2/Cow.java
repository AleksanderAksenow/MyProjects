package study.lesson13.task2;

class Cow extends Animal {
    String color;

    private Cow() {
        super("Cow");
        System.out.println("I'm a cow!");
    }

    public Cow(String color) {
        super("Cow");
        //    new Cow();
        this.color = color;
        System.out.println("I'm a " + color + " cow!");
    }

    public static void Moo() {
        //   System.out.println("Moo");
        Animal.Sound("Moo");
    }
}
