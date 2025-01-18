package Lesson5;

public class Dog extends Animal {
    static int countDog;
    int maxDistance = 500;
    int maxSwim = 10;

    public Dog(String name) {
        super(name);
        countDog++;


    }

    @Override
    public void run(int distance) {
        if (distance <= maxDistance) {
            System.out.println(name + " " + "have run" + " " + distance + "m");
        } else {
            System.out.println(name + " " + " cannot run" + " " + distance + "m");
        }


    }

    @Override
    public void swim(int distance) {
        if (distance >= maxSwim) {
            System.out.println(name + " " + " cannot swim" + " " + distance + "m");
        } else {
            System.out.println(name + " " + "have swim" + " " + distance + "m");
        }
    }

    public void getCountDog() {
        System.out.println("number of dogs" + " " + " " + countDog);
    }

}