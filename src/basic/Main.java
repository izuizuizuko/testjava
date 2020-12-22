package basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BookShelf books = new BookShelf();
		books.bookshelfdetail();
		books.nowlist();

		while (books.getremaing() > 0) {

			Scanner scy = new Scanner(System.in);
			String s = scy.nextLine();

			if (s.equals("yes")) {

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

				//取得したタイトル等をブックのインスタンスに入れて、それをaddする。
				Book book = new Book(title, price, name);

				books.add(book);

			} else {
				System.out.println("おわり");
				break;
			}
			System.out.println("繰り返し書籍を追加しますか？");
		}
		if (books.getremaing() == 0) {
			System.out.println("\n\n本棚に空きスペースがありません。\n");
		}

	}
}
