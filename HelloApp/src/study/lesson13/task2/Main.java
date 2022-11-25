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


