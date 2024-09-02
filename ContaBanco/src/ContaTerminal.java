import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //Criando Scanner para capturar entrada
        Scanner scanner = new Scanner(System.in);
        
        //Variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Pedindo ao usuário para digitar os dados da conta
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        agencia = scanner.next();

        System.out.println("Digite o Nome do Cliente:");
        nomeCliente = scanner.next();

        System.out.println("Digite o Saldo inicial:");
        saldo = scanner.nextDouble();
        
        //Criando a Conta
        System.out.println("\nOlá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + 
        " e seu saldo " + saldo + " ja está disponível para saque.");
    }

}
