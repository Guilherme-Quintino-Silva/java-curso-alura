import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Guilherme Luiz Quintino da Silva";
        String tipoConta = "Conta corrente";
        double saldoInicial = 2500.00;
        int numeroDeVezes = 0;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente:");

        System.out.println("Nome:              " + nome);
        System.out.println("Tipo conta:        " + tipoConta);
        System.out.println("Saldo atual:     R$ " + saldoInicial);

        System.out.println("********************************");
        System.out.print("Operações\n\n");

        String menu = """
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """;

        while(opcao != 4) {
            System.out.println("Digite a opção desejada:");
            int value = scanner.nextInt();
            opcao = value;

            switch (value) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    double recebido = scanner.nextDouble();
                    saldoInicial += recebido;

                    System.out.println("Valor recebido, o novo saldo é R$ " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    double transferido = scanner.nextDouble();
                    if(transferido <= saldoInicial) {
                        saldoInicial -= transferido;
                        System.out.println("Valor transferido, o novo saldo é R$ " + saldoInicial);
                    } else {
                        System.out.println("A transferencia nao pode ser realizada pois não há saldo suficiente.");
                    }

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
