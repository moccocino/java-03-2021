package Lesson6.HomeWork;

public class Test {
    public static void main(String[] args) {


        System.out.println();
        Cat cat1 = new Cat("Персик");

        Dog dog1 = new Dog("Дакота");

        System.out.println("всего животных " + Animal.getCount());
        System.out.println("всего собак "+Dog.getCount());
        System.out.println("всего кошек "+ Cat.getCount());

        cat1.run(100);
        cat1.swim(500);
        dog1.run(100);
        dog1.swim(200);
    }
}