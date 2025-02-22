import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        // Criando uma instância do Scanner para ler do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicitando e lendo o número da Agencia
        System.out.print("Por favor, digite o número da Agência! ");
        int numero = scanner.nextInt();

        // Leitura do saldo
        double saldo = 237.48;

        // Exibindo os dados inseridos pelo usuário

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agencia é 067-8, e conta " + numero + ".");
        System.out.println("Seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o Scanner para evitar vazamentos de recursos
        scanner.close();

        
    }
}

