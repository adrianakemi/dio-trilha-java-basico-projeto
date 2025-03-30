import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

      public static void main(String[] args) {
      
        // Criando o objeto Scanner 
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia ");
        agencia = scanner.next();

        System.out.println("Digite seu nome ");
        nomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo atual ");
        saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agência é " + agencia +  " conta " + numero + " e seu saldo " +saldo +" já está disponível para saque " );
}
}
