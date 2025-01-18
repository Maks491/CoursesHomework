package Lesson5;

public class Animal {
    String name;
    static int countAnimal;

    public Animal(String name ) {
        this.name=name;
        countAnimal++;
    }

    public void run(int distance) {
        System.out.println("animal have run" + distance + "m");

    }

    public void swim(int distance) {
        System.out.println("animal have swim" + distance + "m");
    }

    public void getCountAnimal() {
        System.out.println("number of animals" + " " + " " + countAnimal);

    }


}