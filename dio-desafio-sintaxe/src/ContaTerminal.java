import java.util.Scanner;

public class ContaTerminal {
    private int numero = 0;
    private String agencia = "";
    private String nome = "";
    private double saldo = 0.0;

    public ContaTerminal(){

    }

    public ContaTerminal(int numero, String agencia, String nome){
        numero = this.numero;
        agencia = this.agencia;
        nome = this.nome;
        saldo = 0;
    }
    public int getNumero() {
        return numero;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
         this.agencia = agencia;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor) {
         setSaldo(getSaldo() + valor);
    }

    public String mensagemContaCriada() {
        String mensagemConta = "Olá " + getNome() + ", " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + getAgencia() + ", " +
                "conta "+getNumero()+" e seu saldo "+getSaldo()+" já está disponível para saque";
        return mensagemConta;
    }



    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta1 = new ContaTerminal();

        System.out.println("Por favor, digite o número da conta: ");
        conta1.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite a agencia: ");
        conta1.setAgencia(scanner.next());

        System.out.println("Por favor, digite o seu nome: ");
        conta1.setNome(scanner.next());

        System.out.println("Por favor, digite o valor que deseja depositar: ");
        conta1.depositar(scanner.nextDouble());



        System.out.println(conta1.mensagemContaCriada());






    }
}