package exercicio1;
import java.util.Scanner;

public class Principal extends Calculadora{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextInt();

        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextInt();

        System.out.print("Informe a operação (+, -, * , / ou %): ");
        char operacao = entrada.next().charAt(0);
        double resultado;

        switch (operacao) {
            case '+':
                resultado = Calculadora.somar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = Calculadora.subtrair(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = Calculadora.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = Calculadora.divisao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
             case '%':
                resultado = Calculadora.mod(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Erro.");
        }
        entrada.close();
}
}