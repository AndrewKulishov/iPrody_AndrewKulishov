package com.lesson3;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp app = new HomeWorkApp();
        app.printThreeWords();
        app.printSeparator();

        app.checkSumSign();
        app.printSeparator();

        app.printColor();
        app.printSeparator();

        app.compareNumbers();
        app.printSeparator();

        System.out.println(app.checkSumFrom10To20(5, 15));
        app.printSeparator();

        app.checkRationalNumber(-3);
        app.printSeparator();

        System.out.println(app.isNegativeNumber(55));
        app.printSeparator();

        app.printStringRepeatedly("Какой чудесный день!", 3);
        app.printSeparator();

        System.out.println(app.isBissextus(2000));
    }

    /*Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
    Orange, Banana, Apple.*/
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /*Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или
    равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;*/
    public void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/
    public void printColor() {
        int value = -15;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    /*Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;*/
    public void compareNumbers() {
        int a = 5;
        int b = 10;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.*/
    public boolean checkSumFrom10To20(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum >= 10 && sum <= 20;
    }

    /*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public void checkRationalNumber(int number) {
        if (number >= 0) {
            System.out.println(number + " - это положительное число");
        } else {
            System.out.println(number + " - это отрицательное число");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.*/
    public boolean isNegativeNumber(int number) {
        return number < 0;
    }

    /*  Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз;*/
    public void printStringRepeatedly(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    /*Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
    400-й – високосный.*/
    public boolean isBissextus(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public void printSeparator() {
        System.out.println("-".repeat(20));
    }
}
