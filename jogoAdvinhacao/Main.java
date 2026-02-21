import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

 class Main{
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int advinhacao;
        int tentativas = 0;
        int min = 1;
        int max = 100;
        int numeroAleatorio = random.nextInt(min, max + 1);

        System.out.println("Jogo de Advinhação de Números!");
        System.out.printf("Adivinhe um número entre %d-%d\n", min, max);

        do{
            System.out.print("Insira um número: ");
            advinhacao = scanner.nextInt();
            tentativas++;

            if(advinhacao < numeroAleatorio){
                System.out.println("Muito baixo! Tente novamente");
            }
            else if(advinhacao > numeroAleatorio){
                System.out.println("Muito alto! Tente novamente");
            }
            else{
                System.out.println("Correto! O número era " + numeroAleatorio);
                System.out.println("número de tentativas: " + tentativas);
            }

        }while(advinhacao != numeroAleatorio);

        scanner.close();
    }
}