package study.lesson13.task2;

class Cow extends Animal {
    String color;

    private Cow() {
        super("Cow");
        System.out.println("I'm a cow!");
    }

    public Cow(String color) {
        //super("Cow");
        this();
        this.color = color;
        System.out.println("I'm a " + color + " cow!");
    }

    public void moo() {
        //   System.out.println("Moo");
        this.sound("Moo");
    }
}
