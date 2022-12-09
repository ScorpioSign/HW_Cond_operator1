public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 25;
        if(age >=18){
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 7;
        if(temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else{
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 30;
        if(speed > 60){
            System.out.println("ваша скорость " + speed + " км/ч, придется заплатить штраф");
        }else {
            System.out.println("ваша скорость " + speed + " км/ч, можно ехать спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 6;
        if(age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }else if (age >= 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }else if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }else {
            System.out.println("Если возраст человека равен " + age + ", то ему не надо никуда ходить");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int childAge = 5;
        if(childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + " ,ему нельзя кататься на аттракционе");
        }else if (childAge >= 5 && childAge < 14){
            System.out.println("Если возраст ребенка равен " + childAge + " ,ему можно кататься на аттракционе в сопровождении взрослого");
        }else if (childAge >= 14){
            System.out.println("Если возраст ребенка равен " + childAge + " ,ему можно кататься на аттракционе");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int numberPassengers = 93;
        if(numberPassengers < 60){
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (numberPassengers >=60 && numberPassengers < 102){
            System.out.println("В вагоне есть только стоячие места");
        }else if (numberPassengers == 102){
            System.out.println("В вагоне нет свободных мест");
        }else {
            System.out.println("Вместимость вагона только 102 человека!");
        }
    }
    public static void task7 () {

        System.out.println("Задача 7");
        int one = 2;
        int two = 5;
        int three = 8;
        if (one > two && one > three){
            System.out.println("Большее число - первое");
        }else if (two > one && two > three){
            System.out.println("Большее число - второе");
        }else if (three > one && two < three){
            System.out.println("Большее число - третье");
        }else if (one == two && one == three){
            System.out.println("Все числа одинаковы");
        }else if (one == two && one > three){
            System.out.println("Большие числа - первое и второе");
        }else if (two == three && two > one){
            System.out.println("Большие числа - второе и третье");

        }else if (one == three && one > two){
            System.out.println("Большие числа - первое и третье");
        }
    }
}