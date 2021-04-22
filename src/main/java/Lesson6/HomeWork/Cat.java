package Lesson6.HomeWork;

public class Cat extends Animal {
    static int countOfCat;

    public Cat(String name) {
        super(name);
        this.countOfCat++;
    }


    public static int getCount() {
        return countOfCat;
    }

    @Override
    void run(int distance) {

        if (distance <= 200) {
            System.out.println("Кот " + name + " пробежал " + distance + "м.");

        } else {
            System.out.println("Кот " + name + " не могу столько бежать");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("кошка " + name + ": я не умею плавать\n");
    }


}
