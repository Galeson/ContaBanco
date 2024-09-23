import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    /**
     *
     * Esta classe é parte principal do desafio "Conta Bancária" do DIO, onde o usuário deve se cadastrar num banco.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Olá usuário, informe o número da sua conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Informe seu Nome:");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("Agora digite sua agência:");
        String agencia = scanner.next();
        System.out.println("Digite seu saldo inicial (Ex: 247.82):");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", de número " + numeroConta + ". Seu saldo de R$" + String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}
