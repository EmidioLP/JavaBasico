import java.util.Scanner;
import java.util.Locale;

public class Main{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // PROGRAMA DE BANCO EM JAVA PARA INICIANTES
        double balanco = 0;
        boolean estaAtivo = true;
        int escolha;

        // DISPLAY MENU
        while(estaAtivo){
            System.out.println("*****************");
            System.out.println("PROGRAMA BANCÁRIO");
            System.out.println("*****************");
            System.out.println("1. Mostrar Balanço");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Sair");
            System.out.println("*****************");

            // ARMAZENAR E PROCESSAR ESCOLHAS DO USUÁRIO

            System.out.print("Escolha uma opção (1-4): ");
            escolha = scanner.nextInt();

            switch(escolha){
                case 1 -> mostrarBalanco(balanco);
                case 2 -> balanco = balanco + depositar();
                case 3 -> balanco -= retirar(balanco);
                case 4 -> estaAtivo = false;
                default -> System.out.println("Escolha inválida!");
            }
        }

        // MENSAGEM DE SAIDA
        System.out.println("********************************");
        System.out.println("Obrigado! Tenha um bom dia!");
        System.out.println("********************************");

        scanner.close();
    }

    static void mostrarBalanco(double balanco){
        System.out.println("*****************");
        System.out.printf("$%.2f\n", balanco);
    }
    static double depositar(){
        double quantidade;

        System.out.print("Quanto será depositado: ");
        quantidade = scanner.nextDouble();
        scanner.useLocale(Locale.US);

        if(quantidade < 0 ){
            System.out.println("*****************");
            System.out.println("A quantidade não pode ser negativa!");
            return 0;
        }
        else{
           return quantidade;
        }
    }
    static double retirar(double balanco){

        double quantidade;
        System.out.println("*****************");
        System.out.print("Quantidade para ser retirada: ");
        quantidade = scanner.nextDouble();
        scanner.useLocale(Locale.US);

        if(quantidade > balanco){
            System.out.println("*****************");
            System.out.println("FUNDOS INSUFICIENTES");
            return 0;
        }
        else if(quantidade <0){
            System.out.println("*****************");
            System.out.println("Quantidade não pode ser negativa");
            return 0;
        }
        else {
            return quantidade;
        }

    }
}