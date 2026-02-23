import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] escolhas = {"pedra", "papel", "tesoura"};
        String escolhaJogador;
        String escolhaComputador;
        String jogarNovamente = "sim";


        do{
            System.out.print("Escolha sua jogada (pedra, papel, tesoura): ");
            escolhaJogador = scanner.nextLine().toLowerCase();

            if(!escolhaJogador.equals("pedra") &&
                    !escolhaJogador.equals("papel") &&
                    !escolhaJogador.equals("tesoura")){
                System.out.println("Escolha inválida!");
                continue;

            }

            escolhaComputador = escolhas[random.nextInt(3)];
            System.out.println("Escolha do computador: " + escolhaComputador);

            if(escolhaJogador.equals(escolhaComputador)){
                System.out.println("Empate!");
            }
            else if((escolhaJogador.equals("pedra") && escolhaComputador.equals("tesoura"))
                    || (escolhaJogador.equals("papel") && escolhaComputador.equals("pedra"))
                    || (escolhaJogador.equals("tesoura") && escolhaComputador.equals("papel"))){
                System.out.println("Vitória!");
            }
            else{
                System.out.println("Derrota!");
            }

            System.out.print("Jogar novamente (sim/nao): ");
            jogarNovamente = scanner.nextLine().toLowerCase();

        } while(jogarNovamente.equals("sim"));

        System.out.println("Obrigado por jogar!");
        scanner.close();


    }
}