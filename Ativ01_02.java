package Ativ.Condicionais;
import java.util.Scanner;
public class Ativ01_02 {

	public static void main(String[] args) {
		float num1;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número: ");
		num1 = leia.nextFloat();
		if(num1 % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
		if (num1 < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é positivo");
		}
		
	}

}
