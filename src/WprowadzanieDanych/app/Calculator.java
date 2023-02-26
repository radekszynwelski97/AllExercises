package WprowadzanieDanych.app;

public class Calculator {

    public double calc (double a , double b , String operator){
        double result = 0;
        switch(operator){
            case "+":
            result = a + b ;
            break;
            case "-":
                result = a-b ;
                break;
            case "/":
                result = a /b;
                break;
            case "*":
                result = a*b;
                break;
            default:
                System.out.println("Podany operator nie istnieje");

        }
        return result;
    }
}
