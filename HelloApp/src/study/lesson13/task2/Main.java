package study.lesson13.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog("Black");
        animal[1] = new Cat("White");
        animal[2] = new Cow("Green");
        Dog.Woof();
        Cat.Meow();
        Cow.Moo();
        Voice(animal);

    }
    public static void Voice(Animal[] animal) {
        for (Animal anima : animal) {
            switch (anima.tag) {
                case "Dog":
                    Dog.Woof();
                    break;
                case "Cat":
                    Cat.Meow();
                    break;
                case "Cow":
                    Cow.Moo();
                    break;
            }
        }
    }
}


class Animal {
    public String tag;

    protected Animal(String tag) {
        this.tag = tag;
        System.out.println("I'm an animal");
    }

    protected static void Sound(String sound) {
        System.out.println(sound);
    }
}

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

class Cat extends Animal {
    String color;

    private Cat() {
        super("Cat");
        System.out.println("I'm a cat!");
    }

    public Cat(String color) {
        super("Cat");
    //    new Cat();
        this.color = color;
        System.out.println("I'm a " + color + " cat!");
    }

    public static void Meow() {
  //      System.out.println("Meow");
        Animal.Sound("Meow");
    }
}

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


