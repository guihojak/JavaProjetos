package projetos.ContaBancaria;
import java.util.Scanner;

class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
   
    public void exibirDados() {
        System.out.printf("Titular: %s%nConta: %s%nSaldo: R$ %.2f%n", titular, numeroConta, saldo);
    }
}

public class mainApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja criar uma conta bancaria (S/N): ");
        String x = scanner.nextLine();

        if (x.equalsIgnoreCase("S")) {
            System.out.print("Insira o nome do titular da conta: ");
            String titular = scanner.nextLine();

            System.out.print("Insira o número da conta: ");
            String numeroConta = scanner.nextLine();

            System.out.print("Insira o saldo inicial: ");
            double saldo = scanner.nextDouble();

            ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldo);
            System.out.println("\nConta criada com sucesso!\n");
            conta.exibirDados();
        } else {
            System.out.println("Operação cancelada.");
        }

        scanner.close();
    }
}
