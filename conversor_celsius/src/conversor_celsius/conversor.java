package conversor_celsius;

import java.util.Locale;
import java.util.Scanner;

public class conversor {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * a Fahrenheit. fórmula F = 9c/5 +32
		 */

		/*
		 * char resp = 's';
		 * 
		 * while (resp != 'n') {
		 * 
		 * System.out.print("Digite a temperatura em Celsius:  "); double C =
		 * sc.nextDouble(); double F = 9.0*C/5.0+32.0;
		 * 
		 * System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
		 * System.out.print("Deseja repetir (s/n) ? "); resp = sc.next().charAt(0);
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp; // declarei a variavel fora das chaves para compreensão do compilador

		do {
			// bloco de comando executa pelo mennos uma vez, pois a condição é verificada no
			// final

			System.out.print("Digite a temperatura em Celsius:  ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;

			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			System.out.print("Deseja repetir (s/n) ? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();

	}

}
