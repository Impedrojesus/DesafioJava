import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        String nome = "Pedro";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("**********************");
        System.out.println("\nNome no cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Fazer pix
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(" O Saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor deseja tranferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a tranferência");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opçao invalida");
            }
        }
    }
}