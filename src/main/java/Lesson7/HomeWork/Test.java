package Lesson7.HomeWork;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 25);
        cats[2] = new Cat("Василиса", 20);
        cats[3] = new Cat("Персик", 50);
        cats[4] = new Cat("Черник", 1);


        for (Cat cat : cats) {
            if (!cat.eat(plate)) {
                plate.addFood(cat.getAppetite());
                cat.eat(plate);
            }
            cat.info();
            plate.info();
        }
    }
}
