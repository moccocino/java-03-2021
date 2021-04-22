package Lesson5.HomeWork;

public class test {
    public static void main(String[] args) {

        //4. Создать массив из 5 сотрудников
        employer[] emp = new employer[5];
        emp[0] = new employer("Иванов Иван", "Инженер", "ivanov@mail.ru",
                "943-456-21-44", 50000, 27);
        emp[1] = new employer("Сидоров Алексей", "Системный администратор", "sidorov@list.ru",
                "943-873-21-44", 45000, 37);
        emp[2] = new employer("Никитина Ольга", "Бухгалтер", "nikitina@gmail.com",
                "954-873-21-44", 35000, 43);
        emp[3] = new employer("Андреев Владимир", "Преподаватель", "andreev@gmail.com",
                "987-232-24-54", 47000, 45);
        emp[4] = new employer("Ивков Александр", "Старший Инженер", "ivkov@box.ru",
                "987-242-26-654", 55000, 40);


        for (employer employer : emp) {
            if (employer.getAge() > 40)
                System.out.println(employer.toString());
        }

    }
}
