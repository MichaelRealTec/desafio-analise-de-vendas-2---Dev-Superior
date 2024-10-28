package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sale implements Comparable<Sale> {
	// Atriuto
	private Integer month;
	private Integer year;
	private String seller;
	private Integer items;
	private Double total;
	private static String nameVendedor;
	private static String nameVendedor2;

	// Método Getter e Setter
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Integer getItems() {
		return items;
	}

	public void setItems(Integer items) {
		this.items = items;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	// Método Construtor
	public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
		this.month = month;
		this.year = year;
		this.seller = seller;
		this.items = items;
		this.total = total;
	}

	public Sale(String seller, Double total) {
		this.seller = seller;
		this.total = total;
	}

	// Método
	public Double averagePrice() {
		return total / items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return seller + " - R$ " + String.format("%.2f", total);
	}

	public double somatorio(List<Sale> sale, String name) {
		double sum = 0.0;

		List<Sale> filterName2 = new ArrayList<>(sale).stream().filter(p -> p.getSeller().equals(name))
				.collect(Collectors.toList());
		for (Sale x : filterName2) {
			sum += x.getTotal();
			// System.out.println(x);
		}
		return sum;
	}

	@Override
	public int compareTo(Sale other) {
		return seller.toUpperCase().compareTo(other.getSeller().toUpperCase());
	}
}
