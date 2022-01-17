package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Caminhao;
import entidades.Pacote;

public class application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Caminhao caminhao = new Caminhao(1, 1000.0);

		System.out.println("quantos pacotes adicionar?");
		int total = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < total; i++) {

			int numPacote = i + 1;
			System.out.println();

			System.out.println("Informe o peso do pacote: ");
			double pesoPacote = sc.nextDouble();
			sc.nextLine();	

			Pacote pac = new Pacote(numPacote, pesoPacote);

			caminhao.adicionarPacote(pac);
			double totalPeso = caminhao.getTotalPeso();
			double totalDisponivel = caminhao.getTotalDisponivel();
			System.out.println("Peso total do caminhão: " + totalPeso);
			System.out.println("Peso total disponivel: " + totalDisponivel);

		}

		sc.close();
	}

}
