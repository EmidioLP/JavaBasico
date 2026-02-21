import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        int numDeDados;
        int total = 0;

        System.out.print("Qual o número de dados que serão rolados: ");
        numDeDados = scanner.nextInt();

        if(numDeDados > 0){

            for(int i =0; i < numDeDados; i++){
                int roll = random.nextInt(1, 7);
                printDado(roll);
                System.out.println("Você girou: " + roll);
                total += roll;
            }
            System.out.println("Total: "+ total);

        }
        else{
            System.out.println("O número de dados tem que ser maior do que zero!");
        }
        scanner.close();
    }
    static void printDado(int roll){

        String dado1 = """
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------
                """;
        String dado2 = """
                     --------
                    |●       |
                    |        |
                    |       ●|
                     --------
                """;
        String dado3 = """
                     --------
                    |●       |
                    |   ●    |
                    |       ●|
                     --------
                """;
        String dado4 = """
                     --------
                    |●      ●|
                    |        |
                    |●      ●|
                     --------
                """;
        String dado5 = """
                     -------
                    |●     ●|
                    |   ●   |
                    |●     ●|
                     -------
                """;
        String dado6 = """
                     -------
                    |●     ●|
                    |●     ●|
                    |●     ●|
                     -------
                """;

        switch(roll){
            case 1 -> System.out.print(dado1);
            case 2 -> System.out.print(dado2);
            case 3 -> System.out.print(dado3);
            case 4 -> System.out.print(dado4);
            case 5 -> System.out.print(dado5);
            case 6 -> System.out.print(dado6);
        }

    }
}