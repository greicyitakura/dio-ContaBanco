import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" _________________________________________________ " + "\n");
        System.out.println("======  Bem-Vindo(a) a sua Conta Digital  ======" + "\n");
        System.out.println("Para criar sua conta, " + "\n");

        System.out.println("Digite seu nome:");
        String name = scanner.next();

        System.out.println("Digite o número da agência:");
        String agency = scanner.next();

        System.out.println("Digite o número da conta:");
        int account = scanner.nextInt();

        System.out.println("Digite o Saldo inicial:");
        float balance = scanner.nextFloat();

        System.out.println("\n" + "Olá " + name + ",\n"
                + "Obrigado(a) por criar uma conta em nosso banco!" + "\n"
                + "Sua agência: " + agency + ",\n"
                + "Sua conta: " + account + ",\n"
                + "Seu saldo é R$ " + balance + " que já está disponível para saque.");

        System.out.println("\n" + "Obrigado(a) e até mais.");

        System.out.println(" _________________________________________________ ");

        scanner.close();

    }
}
