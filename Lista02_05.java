package Ativ.Condicionais;
import java.util.Scanner;

public class Lista02_05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        // Calcula o valor total da compra
        double valorTotal = quantidade * getPrecoUnitario(codigo);

        // Obtém o nome do produto
        String nomeProduto = getNomeProduto(codigo);

        // Exibe o valor total da compra e o nome do produto
        System.out.println("O valor total da compra é R$" + valorTotal + ".");
        System.out.println("O produto comprado foi " + nomeProduto + ".");
    }

    private static double getPrecoUnitario(int codigo) {
        double precoUnitario = 0.0;

        switch (codigo) {
            case 1:
                precoUnitario = 10.0;
                break;
            case 2:
                precoUnitario = 15.0;
                break;
            case 3:
                precoUnitario = 18.0;
                break;
            case 4:
                precoUnitario = 12.0;
                break;
            case 5:
                precoUnitario = 8.0;
                break;
            case 6:
                precoUnitario = 13.0;
                break;
            default:
                System.out.println("Código de produto inválido.");
                break;
        }

        return precoUnitario;
    }

    private static String getNomeProduto(int codigo) {
        String nomeProduto = "";

        switch (codigo) {
            case 1:
                nomeProduto = "Cachorro Quente";
                break;
            case 2:
                nomeProduto = "X-Salada";
                break;
            case 3:
                nomeProduto = "X-Bacon";
                break;
            case 4:
                nomeProduto = "Bauru";
                break;
            case 5:
                nomeProduto = "Refrigerante";
                break;
            case 6:
                nomeProduto = "Suco de laranja";
                break;
            default:
                System.out.println("Código de produto inválido.");
                break;
        }

        return nomeProduto;
    }
}


