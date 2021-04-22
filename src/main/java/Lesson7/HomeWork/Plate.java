package Lesson7.HomeWork;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n <= food) {
            food -= n;
            return true;
        } else {
            System.out.println("В тарелке недостаточно еды!");
            return false;
        }
    }

    public void addFood(int n) {
        if (n > 0) {
            System.out.println("Насыпали в тарелку " + n + " еды!");
            food += n;
        }
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды.");
    }
}
