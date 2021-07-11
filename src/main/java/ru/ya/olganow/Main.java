package ru.ya.olganow;

public class Main {
    public static void main(String[] args) {
        Office headoffice = new Office();
        headoffice.address = "Russia, Moscow, Red square";
        headoffice.floor = 5;
        headoffice.square = 102;
        headoffice.setCategory('A');


        System.out.println(headoffice.getInfo());
    }
}
