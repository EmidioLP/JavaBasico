import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        String[] questoes = {"Qual a principal função de um roteador?",
                             "Qual parte do computador pode ser considerada o cérebro?",
                             "Qual ano o Facebook foi lançado?",
                             "Quem é conhecido como o pai da computação?",
                             "Qual foi a primeira linguagem de programação?"};

        String[][] opcoes = {{"1. Armazenar arquivos", "2. Criptografar dados", "3. Direcionar o tráfego da internet", "4. Gerenciar senhas"},
                             {"1. CPU", "2. HD", "3. RAM", "4. GPU"},
                             {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                             {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Carles Babbage"},
                             {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] repostas = {3, 1, 2, 4, 3};
        int pontuacao = 0;
        int escolha;

        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************************************");
        System.out.println("Bem-vindo ao Quiz!");
        System.out.println("***********************************************");

        for(int i = 0; i < questoes.length; i++){
            System.out.println(questoes[i]);

            for(String opcao : opcoes[i]){
                System.out.println(opcao);

            }

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if(escolha == repostas[i]){
                System.out.println("********");
                System.out.println("CORRETO!");
                System.out.println("********");
                pontuacao++;
            }
            else{
                System.out.println("********");
                System.out.println("ERRADO!");
                System.out.println("********");
            }
        }

        System.out.println("Sua pontuação final é: " + pontuacao + " de " + questoes.length);

        scanner.close();


    }
}