import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        System.out.println("olá, qual é o seu nome? ");
        String nome = scan.nextLine();
        System.out.println("Prazer em conhecê-lo(a) " + nome + "!");
        System.out.println(nome + " Você quer jogar comigo?");
        System.out.println("\nInforme o número da sua opção.\n1->sim \n2->não");
        opcao = scan.nextInt();

        if(opcao == 2){

            System.out.println("Que pena, mas tudo bem, fica para próxima");
        }else if(opcao == 1){
            System.out.println("Ok, o jogo é assim...");
            System.out.println("Eu vou escolher um número de 0 a 10 ");
            System.out.println("mas não vou falar pra você qual foi o número.");
            System.out.println("Se adivinhar qual foi a minha escolha...");
            System.out.println("você será o VENCEDOR!");

            escolha_computador = gerador.nextInt(11);

            System.out.println("Ok, " +nome+ ". Eu já escolhi!!");
            System.out.println("Agora tente adivinhar!");

            do{
                escolha_usuario = scan.nextInt();
                if (escolha_usuario != escolha_computador){
                    System.out.println("Resposta Errada!");
                }else{
                    System.out.println("Parabéns, você acertou!!");
                }

            }while (escolha_computador != escolha_usuario);

        }

    }
}
