import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double novaTemp;
        String unidade;

        System.out.print("Adicione a temperatura: ");
        temp = scanner.nextDouble();

        System.out.print("Converter para Celsius ou Fahrenheit? (C ou F): " );
        unidade = scanner.next().toUpperCase();

        novaTemp =     (unidade.equals("C")) ? (temp -32) * 5 / 9 : (temp * 9/5) + 32;

        System.out.printf("%.1f° %s", novaTemp, unidade);

        scanner.close();

    }
}
