package ru.javacore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Александр Витушко!");


        Tester tester = new Tester("Aleksandr", "Vitushka", 1, "B2", 1100);
        tester.getFullName();
        tester.print();
    }
}