package ru.skypro;

public class Main {

    public static void main(String[] args) {
task3();
    }
    public static void task1() {
        String firstName = "Иванов ";
        String middleName = "Иван ";
        String lastName = "Иванович";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
    }
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
