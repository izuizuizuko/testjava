package basic;

import java.util.ArrayList;

public class BookShelf {

	private ArrayList<Book> addbook;
	private Book book;

	private Book title;
	private Book name;
	private Book price;
	public static final int MAXSIZE = 5;

	public BookShelf() {

		addbook = new ArrayList<Book>();

	}

	public void nowlist() {
		System.out.println("===========================");
		System.out.println("新しい書籍を追加しますか？[はい: yes いいえ: no]");

	}

	public void add(Book book) {

		if (checkexists(book)) {
			System.out.println("同じ書籍があるので追加されませんでした");
		} else {
			addbook.add(book);
			System.out.println("登録に成功しました");
		}





	}
	public void bookshelfdetail() {
		System.out.println("現在所持している本一覧=========");
		for (Book b : addbook) {
			System.out.println(b);
		}
		if(addbook.size() == 0) {
			System.out.println("所有している本はありません。\n");
		}
		System.out.println("============================");
	}


	public boolean checkexists(Book book) {
		for(Book b : addbook) {
			if(book.equals(b)) {
				return true;
			}
		}
		return false;
	}

	public int getremaing(){
		return MAXSIZE - addbook.size();
	}

//	public void booksall() {
//
//		if (getTitle().equals(book.getTitle())) {
//			System.out.println("同じ書籍があるので、追加されませんでした。");
//
//		} else {
//			System.out.println("おわり");
//		}
//
//
//
//	}

	public Book getPrice() {
		return price;
	}

	public void setPrice(Book price) {
		this.price = price;
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



}