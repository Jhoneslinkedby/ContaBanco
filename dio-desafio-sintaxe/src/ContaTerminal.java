import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";
        String nome = "";
        double saldo = 0.0;

        Scanner scanner = new Scanner(System.in);

        //Solicita a agencia
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite a agencia: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        nome = scanner.next();


        System.out.println("Olá " + nome + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", " +
                "conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}