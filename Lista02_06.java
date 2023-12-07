package Ativ.Condicionais;

import java.util.Scanner;


public class Lista02_06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do colaborador:");
        String nome = scanner.nextLine();

        System.out.println("Digite o código do cargo do colaborador:");
        int codigoCargo = scanner.nextInt();

        System.out.println("Digite o salário do colaborador:");
        float salario = scanner.nextFloat();

        // Calcula o percentual do reajuste
        float percentualReajuste = getPercentualReajuste(codigoCargo);

        // Calcula o novo salário
        float novoSalario = salario + (percentualReajuste * salario);

        // Exibe o nome do colaborador, o cargo e o novo salário
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + getCargo(codigoCargo));
        System.out.println("Novo salário: R$" + novoSalario);
    }

    private static float getPercentualReajuste(int codigoCargo) {
        float percentualReajuste = 0.0f;

        switch (codigoCargo) {
            case 1:
                percentualReajuste = 0.10f;
                break;
            case 2:
                percentualReajuste = 0.07f;
                break;
            case 3:
                percentualReajuste = 0.09f;
                break;
            case 4:
                percentualReajuste = 0.06f;
                break;
            case 5:
                percentualReajuste = 0.05f;
                break;
            case 6:
                percentualReajuste = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido.");
                break;
        }

        return percentualReajuste;
    }

    private static String getCargo(int codigoCargo) {
        String cargo = "";

        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                break;
            case 2:
                cargo = "Vendedor";
                break;
            case 3:
                cargo = "Supervisor";
                break;
            case 4:
                cargo = "Motorista";
                break;
            case 5:
                cargo = "Estoquista";
                break;
            case 6:
                cargo = "Técnico de TI";
                break;
            default:
                System.out.println("Código de cargo inválido.");
                break;
        }

        return cargo;
    }
}


