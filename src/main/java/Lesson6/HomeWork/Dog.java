package Lesson6.HomeWork;

public class Dog extends Animal {
    static int countOfDog;


    public Dog(String name) {
        super(name);
        this.countOfDog++;

    }
    public static int getCount(){
        return countOfDog;
    }

    @Override
    void run(int distance) {
        if (distance>0 && distance <= 500) {
            System.out.println("Собака " + name + " пробежал " + distance + "м.");

        } else {
            System.out.println("Собака " + name + " не могу столько бежать");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10 && distance >0){
            System.out.println("Собака " + name + " проплыл " + distance + "м.");
        }
        else{
            System.out.println("Собака " + name + " не могу столько проплыть");
        }
    }

}
