package basic;

public class Book {

	private String title;
	private String name;
	private String price;



	public Book(String title, String price, String name) {
		this.title =title;
		this.price = price;
		this.name = name;
	}




	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getPrice() {
		return price;
	}

	public void setPrices(String price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
	    return "書名：" + getTitle() + "/価格："  + getPrice() + " 円/著者名：" + getName();
	 
	}
}
