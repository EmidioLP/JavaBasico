import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double num1;
        double num2;
        char operador;
        double resultado = 0;
        boolean operacaoValida = true;

        System.out.print("Insira o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Insira o operador (+, -, *, /, ^): ");
        operador = scanner.next().charAt(0);

        System.out.print("Insira o segundo número: ");
        num2 = scanner.nextDouble();

        switch(operador){
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Não pode ser dividido por zero!");
                    operacaoValida = false;
            }
                else{
                    resultado = num1 / num2;
                }
            }
            case '^' -> resultado = Math.pow(num1, num2);
            default -> {
                System.out.println("Operador inválido!");
                operacaoValida = false;
            }
        }

        if(operacaoValida){
            System.out.println(resultado);
        }
        scanner.close();
    }
}
