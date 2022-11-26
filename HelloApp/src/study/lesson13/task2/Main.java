package study.lesson13.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog("Black");
        animal[1] = new Cat("White");
        animal[2] = new Cow("Green");
        Dog animal0 = (Dog) animal[0];
        Cat animal1 = (Cat) animal[1];
        Cow animal2 = (Cow) animal[2];
        animal0.woof();
        animal1.meow();
        animal2.moo();
        voice(animal);

    }
    public static void voice(Animal[] animal) {
        for (Animal anima : animal) {
            switch (anima.tag) {
                case "Dog":
                    Dog dog = (Dog) anima;
                    dog.woof();
                    break;
                case "Cat":
                    Cat cat = (Cat) anima;
                    cat.meow();
                    break;
                case "Cow":
                    Cow cow = (Cow) anima;
                    cow.moo();
                    break;
            }
        }
    }
}


