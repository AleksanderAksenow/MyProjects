package study.lesson13.task2;

class Animal {
    public String tag;

    protected Animal(String tag) {
        this.tag = tag;
        System.out.println("I'm an animal");
    }

    protected void sound(String sound) {

        System.out.println(sound);
    }
}
