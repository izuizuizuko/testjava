package basic;

import java.util.ArrayList;
import java.util.Scanner;
public class BookShelf {

	private ArrayList<Book> addbook;
	private Book book;

	private Book title;
	private Book name;
	private Book price;


	public BookShelf() {

		System.out.println("現在所持している本一覧========");
		System.out.println("所有している本はありません。\n");

		addbook = new ArrayList<Book>();

	}

	public void nowlist() {
		System.out.println("===========================");
		System.out.println("新しい書籍を追加しますか？[はい: yes いいえ: no]");

	}


	public void add() {

		System.out.println("書籍名を入力してください。");
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		System.out.println(">" + title);
		System.out.println("価格を入力してください。");
		String price = sc.next();
		System.out.println(">" + price);
		System.out.println("著者名を入力してください。");
		String name = sc.next();
		System.out.println(">" + name);
		System.out.println("書名：" + title + "/価格：" + price + "円/著者名：" + name + "を追加します。");
		System.out.println("登録に成功しました");
		//取得したタイトル等をブックのインスタンスに入れて、それをaddする。
		Book book = new Book(title, price, name);
		addbook.add(book);
		System.out.println("繰り返し、書籍を追加しますか？[はい: yes いいえ: no]");


	}



	public Book getPrice() {
		return price;
	}

	public void setPrice(Book price) {
		this. price =  price;
	}


	public Book getName() {
		return name;
	}

	public void setName(Book name) {
		this.name = name;
	}


	public Book getTitle() {
		return title;
	}

	public void setTitle(Book title) {
		this.title = title;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void bookshelfdetail() {
		System.out.println("現在所持している本一覧=========");
		for (Book b : addbook) {
			System.out.println(b);
		}
		System.out.println("============================");

	}

}