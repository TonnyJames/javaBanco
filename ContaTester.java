package l1_testBanco;

import java.util.Scanner;

public class ContaTester {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opt = -1;

		Conta cliente = new Conta();

		System.out.println("***Bem-vindo ao Tonnybank 48hs***");

		do {
			System.out.println("\nSelecione uma ação \n**********************");

			System.out.println(
					"Abrir uma conta digite 1 \nConsultar Saldo digite 2 \nDepositar digite 3 \nSaque digite 4 \nPARA SAIR 0");
			opt = scan.nextInt();

			if (opt == 1) {
				cliente.abrir();
			} else if (opt == 2) {
				cliente.check();
			} else if (opt == 3) {
				cliente.creditar();
			} else if (opt == 4) {
				cliente.debitar();
			} else if (opt == 0) {
				break;
			}
		} while (opt != 0);

		System.out.println("Obrigado!!! volte sempre ou não, vc que sabe");

		scan.close();
	}

}
