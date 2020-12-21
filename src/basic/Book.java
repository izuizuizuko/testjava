package basic;

public class Book {

	private String title;
	private String name;
	private String prices;



	public Book(String title, String  prices, String name) {
		this.title =title;
		this.prices = prices;
		this.name = name;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getPrices() {
		return prices;
	}

	public void setPrices(String prices) {
		this.prices = prices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
