package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Sale;

public class Program {

	public static void main(String[] args) {
		// desafio analise de vendas 2 - Dev Superior

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name, path;
		Double sum;

		System.out.print("Entre o caminho do arquivo: ");
		path = sc.nextLine();
		System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> sale = new ArrayList<>();

			String line = br.readLine(); // Variável linha para percorrer as linhas do arquivo

			while (line != null) {
				String[] fields = line.split(",");
				sale.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2],
						Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
				line = br.readLine(); // Pula para a leitura da próxima linha
			}

			Set<Sale> set = new TreeSet<>(sale); // Criando LinkedHashSet para receber os arquivos do documento .csv

			System.out.println("Total de vendas por vendedor:");

			List<String> vendas = new ArrayList<>();

			// Pegando todos os nomes dos vendedores
			for (Sale x : set) {
				vendas.add(x.getSeller());
			}

			// Salvando todos os nomes separadamente em cada variável String Vetor
			String[] nomes = new String[vendas.size()];

			for (int i = 0; i < vendas.size(); i++) {
				nomes[i] = vendas.get(i);
			}
			
			/* Conferindo os nomes dos vendedores
			for (int i = 0; i < vendas.size(); i++) {
				System.out.println(nomes[i]);
			}
			*/
			
			/*  Obtendo manualmente os valores da lista vendas e armazenando em String
			 String name1 = vendas.get(0); String name2 = vendas.get(1); String name3 =
			 vendas.get(2); String name4 = vendas.get(3); String name5 = vendas.get(4);
			 String name6 = vendas.get(5); String name7 = vendas.get(6);
			  
			 for(int i = 0; i < 4; i++) { System.out.println(name1);
			 System.out.println(name2); System.out.println(name3);
			 System.out.println(name4); System.out.println(name5);
			 System.out.println(name6); System.out.println(name7);
			 System.out.println("--------"); }
			*/ 

			// Pegando a soma total das vendas do vendedor Anakin
			sum = 0.0;
			name = "Anakin";

			List<Double> total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[0], sum);

			// Pegando a soma total das vendas do vendedor Barry Allen
			sum = 0.0;
			name = "Barry Allen";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[1], sum);

			// Pegando a soma total das vendas do vendedor Kal-El
			sum = 0.0;
			name = "Kal-El";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[2], sum);

			// Pegando a soma total das vendas do vendedor Logan
			sum = 0.0;
			name = "Logan";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[3], sum);

			// Pegando a soma total das vendas do vendedor Padme Amidala
			sum = 0.0;
			name = "Padme Amidala";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[4], sum);

			// Pegando a soma total das vendas do vendedor Rachel Roth
			sum = 0.0;
			name = "Rachel Roth";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[5], sum);

			// Pegando a soma total das vendas do vendedor Victor Von Doom
			sum = 0.0;
			name = "Victor Von Doom";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[6], sum);

			// Pegando a soma total das vendas da vendedora Wanda Maximoff
			sum = 0.0;
			name = "Wanda Maximoff";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[7], sum);

		} catch (IOException e) {// Capturando o erro e exibindo uma mensagem
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}
	
}
