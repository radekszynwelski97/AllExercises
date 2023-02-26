package WprowadzanieDanych.app.app;


import WprowadzanieDanych.app.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj pierwszą liczbe");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj separator działania ( + , - , / , * )");
        String operator = scanner.nextLine();
        System.out.println("Podaj drugą liczbe");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator();
        double result = calculator.calc(a , b , operator);
        System.out.println(a + operator + b + "=" + result);
        scanner.close();
    }
}
