package Lesson5;

public class Cat extends Animal {
    static int countCat;
    int appetite;
    boolean satiety;
    int maxDistance = 200;

    public Cat(String name, int appetite, boolean satiety) {
        super(name);
        this.satiety = satiety;
        this.appetite = appetite;
        countCat++;
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
        System.out.println(name + " " + "cannot swim");

    }

    public void getCountCat() {
        System.out.println("number of cats" + " " + " " + countCat);
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);

    }


}