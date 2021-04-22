package Lesson7.HomeWork;

public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public boolean eat(Plate p) {
        System.out.println("Котик по имени " + name + " пытается покушать " + appetite + " еды.");
        if (p.decreaseFood(appetite)) {
            return this.satiety = true;

        } else {
            return this.satiety = false;
        }
    }

    public void info() {
        if (satiety) {
            System.out.println("Котик по имени " + name + " накушался!");
        } else {
            System.out.println("Котик " + name + "  не накушался!");
        }
    }

    public int getAppetite() {
        return appetite;
    }
}

