package Lesson6.HomeWork;

public abstract class Animal {
    String name;
    private int distance;
    static int countOfAnimals = 0;

    public Animal(String name) {
        this.name = name;
        this.countOfAnimals++;
    }

    public static int getCount() {

        return countOfAnimals;
    }


    abstract void run(int distance);

    abstract void swim(int distance);
}