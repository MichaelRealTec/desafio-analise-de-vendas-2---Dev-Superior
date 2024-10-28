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
			//System.out.println(sum);

			// Pegando a soma total das vendas do vendedor Barry Allen
			sum = 0.0;
			name = "Barry Allen";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[1], sum);
			//System.out.println(sum);

			// Pegando a soma total das vendas do vendedor Kal-El
			sum = 0.0;
			name = "Kal-El";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[2], sum);
			//System.out.println(sum);

			// Pegando a soma total das vendas do vendedor Logan
			sum = 0.0;
			name = "Logan";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[3], sum);
			//System.out.println(sum);

			// Pegando a soma total das vendas do vendedor Padme Amidala
			sum = 0.0;
			name = "Padme Amidala";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[4], sum);
			//System.out.println(sum);

			// Pegando a soma total das vendas do vendedor Rachel Roth
			sum = 0.0;
			name = "Rachel Roth";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[5], sum);
			//System.out.println(sum);

			// Pegando a soma total das vendas do vendedor Victor Von Doom
			sum = 0.0;
			name = "Victor Von Doom";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[6], sum);
			//System.out.println(sum);

			// Pegando a soma total das vendas da vendedora Wanda Maximoff
			sum = 0.0;
			name = "Wanda Maximoff";

			total = new ArrayList<Double>();

			for (Sale x : sale) {
				sum = x.somatorio(sale, name);
			}
			total.add(sum);
			System.out.printf("%s - R$ %.2f\n", nomes[7], sum);
			//System.out.println(sum);

			/*
			 * List<Sale> filterName = new ArrayList<>(sale) .stream().filter(p ->
			 * p.getSeller().equals("Logan")) .collect(Collectors.toList()); for(Sale x :
			 * filterName) { System.out.println(x); }
			 */

			// List<Double> somaTotal = new ArrayList<>();

			// for (Sale y : filterName) {
			// sum += y.getTotal();
			// somaTotal.add(sum);
			// }

			//System.out.println("SOMA TOTAL DO LOGAN ------------> ");
			//System.out.println(sum);

			// sum = totalVendas(p -> p.getSeller() == "Logan", filterName, vendas);
			/*
			 * for(Sale w : sale) { sum = w.totalVendas(p -> p.getSeller() == "Logan",
			 * filterName, vendas); }
			 * 
			 * 
			 * // (p -> p.getSeller() == "Logan",filterName,somaTotal);
			 * 
			 * /* for(Sale z : filterName) { System.out.println(z); }
			 */
			/*
			 * for(Sale a : filterName) {
			 * System.out.printf("%s - R$ %.2f",a.getSeller(),sum); }
			 */

			/*
			 * // Pegando apenas uma vez os nomes do vendedores for(String y : vendas) {
			 * 
			 * System.out.println(y); //System.out.println(vendas.get(1)); }
			 */
			// List<Double> totalVendas = new ArrayList<>(); // Lista para armazenar o total
			// de vendas de cada vendedor
			/*
			 * List<Sale>total = sale.stream() .filter(p -> p.getSeller().equals("Logan"))
			 * //.reduce(0.0, (x,y) -> x + y) .collect(Collectors.toList()); //.reduce(0,
			 * Integer::sum);
			 */

			// consulta.forEach(System.out::println);

			// ("Logan", consulta);

			// sale.totalVendas("Logan", sale);

			// sc.nextLine();
			// sc.nextLine();
			// totalVendas("Logan", sale);

			/*
			 * Double sum = 0.0; String name = "name"; List<Sale>totalVendas = sale.stream()
			 * .filter(p -> p.getSeller().equals("Logan")) //.reduce(0.0, (x,y) -> x + y)
			 * .collect(Collectors.toList()); //.reduce(0, Integer::sum);
			 * 
			 * for(Sale x : totalVendas) { name = x.getSeller(); sum += x.getTotal(); }
			 * 
			 * System.out.printf("%s - R$ %.2f", name, sum);
			 * 
			 * 
			 * List<Sale> filterName = sale.stream()
			 * .filter(p->p.getSeller().equals("Logan")) .collect(Collectors.toList());
			 * filterName.forEach(System.out::println);
			 * 
			 */
			// totalVendas.forEach(elem -> System.out.print(elem + "\n")); // forma de
			// mostrar

			/*
			 * for(Sale x : totalVendas) { System.out.printf("%s - R$ %.2f", x.getSeller(),
			 * sum); }
			 */

			// Double x = ParseDouble((fields[4]));

			// List<Sale> sum = sale.stream()
			// .filter(x -> x.getSeller(). && x.getTotal() > 0);
			// .map(p -> p.getTotal())
			// .mapToDouble
			// .reduce(0.0, (x,y) -> x + y);

			// totalVendas.forEach(elem -> System.out.print(elem + "\n")); // forma de
			// mostrar

			// for (int i = 1; i <= sale.size(); i++) {
			// System.out.println(sum);
			// }

			/*
			 * for (int i = 1; i <= sale.size(); i++) { for (int y = 1; y <= sale.size();
			 * y++) {
			 * 
			 * } }
			 * 
			 * for(Sale z : sale) { totalVendas.addAll(z -> z.getTotal()); }
			 * totalVendas.forEach(elem -> System.out.print(elem+"\n")); // forma de mostrar
			 * Stream<Sale> stream = set.stream(); //.filter(x -> (x.getTotal() > 0))
			 * //.filter(y -> (y.getSeller() != null));
			 */
			// .collect(Collectors.toList());
			// stream.forEach(elem -> System.out.print(elem+"\n")); // forma de mostrar
			// informação na tela

			// stream.forEach(elem -> System.out.print(elem + "\n"));
			/*
			 * for (Sale x : set) { System.out.println(x); // Imprimir o resultado }
			 */
			// Integer sum = 0;
			/////////////// Integer somaTotal = set.stream().reduce(0, Integer::sum);

			/*
			 * for(Sale y : sale) { if(y.getSeller().) { somaTotal += y.getTotal();
			 * System.out.println(somaTotal); }
			 * 
			 * }
			 */
			/*
			 * //Percorrendo o HashSet<Cliente> e imprimindo os valores Iterator<Sale> it =
			 * set.iterator(); while(it.hasNext()){ Sale NomeCliente = it.next();
			 * System.out.println(NomeCliente); }
			 */
			// System.out.println(set.toArray());
			// set.forEach(System.out::println); // Mostrar na tela
			// System.out.println(set.toString());

			/*
			 * 
			 * List<Sale> consulta = new ArrayList<>(sale); // .filter(p ->
			 * p.getSeller().equals("Logan")) // .collect(Collectors.toList()); List<Sale>
			 * nameList = new ArrayList<>(set); name = "Logan"; for (Sale x : nameList) {
			 * 
			 * // x.totalVendas(sale, name); // System.out.printf(Sale.totalVendas(sale,
			 * name)); // System.out.println(nameVendedor);
			 * System.out.println(x.totalVendas(sale, name)); }
			 * 
			 * String[] nomes = new String[vendas.size()];
			 */

		} catch (IOException e) {// Capturando o erro e exibindo uma mensagem
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}
	/*
	 * public static Double totalVendas(Predicate<Sale> predicate, List<Sale>
	 * filterName, List<String> vendas) { Double sum = 0.0; for (int i = 0; i <
	 * filterName.size(); i++) { //System.out.println("Teste1 "); String
	 * nameVendedor[] = new String[vendas.size()]; //nameVendedor[i] = nomes[i];
	 * //String nameV = new String[nameVendedor[i];
	 * 
	 * //List<Sale> filterName2 = new ArrayList<>(filterName).stream() List<Sale>
	 * somaTot = new ArrayList<>(filterName).stream() .filter(p ->
	 * (predicate.test(p))) .collect(Collectors.toList());
	 * 
	 * for (Sale y : somaTot) { sum += y.getTotal(); //somaTotal.add(sum);
	 * System.out.println("teste "+y.getTotal()); System.out.println("teste "+sum);
	 * } System.out.println("---------"); //System.out.println("teste "+somaTot();
	 * System.out.println("teste "+sum); System.out.println("---------"); // return
	 * (Double) sum; } return sum; } /* List<Sale> filterName = new
	 * ArrayList<>(sale).stream() .filter(p -> p.getSeller().equals("Logan"))
	 * .collect(Collectors.toList());
	 * 
	 * List<Double> somaTotal = new ArrayList();
	 * 
	 * for(Sale y : filterName) { sum += y.getTotal(); somaTotal.add(sum); }
	 * 
	 * 
	 * public static void totalVendas(String[] nomes, List<Sale> sale) { Double sum
	 * = 0.0; for(int i = 0; i < sale.size(); i++) { String nameVendedor = nomes[i];
	 * List<Sale> total = sale.stream() .filter(p -> p.getSeller() ==
	 * (nameVendedor)) .collect(Collectors.toList()); for(Sale x : total) { name =
	 * x.getSeller(); sum += x.getTotal(); System.out.println(x); }
	 * System.out.printf("%s - R$ %.2f\n", name, sum);
	 * 
	 * } //String nameVendedor = ; //System.out.printf("%s - R$ %.2f", name, sum);
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
}
