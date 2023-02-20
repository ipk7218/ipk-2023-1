package by.vsu.domain;

public class Product {
	private String name;
	private Currency price;
	private Category category;

	public Product(String name, Currency price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, Currency price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Currency getPrice() {
		return price;
	}

	public void setPrice(Currency price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				", category=" + category +
				'}';
	}
}
