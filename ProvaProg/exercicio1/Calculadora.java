package exercicio1;

import java.util.Scanner;

public class Calculadora {

    public static double somar(double num1, double num2){
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    public static double divisao(double num1, double num2){
        double resultado = 0.0;
        if (num2 == 0){
            System.out.println("Não é possível realizar divisão por zero.");
        }else{
            resultado = num1 / num2;
        }
        return resultado;
        
    }
    public static double mod(double num1, double num2){
        return num1 % num2;
    }
}