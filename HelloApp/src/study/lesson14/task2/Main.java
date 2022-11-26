package study.lesson14.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog("Black");
        animal[1] = new Cat("White");
        animal[2] = new Cow("Green");
        animal[0].sound();
        animal[1].sound();
        animal[2].sound();
        voice(animal);

    }
    public static void voice(Animal[] animal) {
        for (Animal anima : animal) {
                    anima.sound();
        }
    }
}


