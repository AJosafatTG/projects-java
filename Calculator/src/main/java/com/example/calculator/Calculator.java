package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        char operador;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Elige un operador: +, -, * o /");
        operador = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Ingresa el primer numero");
        number1 = input.nextDouble();

        System.out.println("Ingresa el segundo numero");
        number2 = input.nextDouble();

        switch (operador){

            case '+':
                result = number1 + number2;
                System.out.println("Numero 1: " + number1 + " + " + "Numero 2: " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Numero 1: " + number1 + " - " + "Numero 2: " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Numero 1: " + number1 + " * " + "Numero 2: " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("Numero 1: " + number1 + " / " + "Numero 2: " + number2 + " = " + result);
                break;

            default:
                System.out.println("Operador Invalido");
                break;
        }

    input.close();
    }
}
