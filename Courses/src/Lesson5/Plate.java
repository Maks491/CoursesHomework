package Lesson5;

public class Plate {
    int food;


    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood() {
        food += 50;
    }

    public int getFoodInfo() {
        return food;
    }

}