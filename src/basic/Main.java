package basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BookShelf books = new BookShelf();
		books.nowlist();

		for (int i = 0; i < 5; i++) {
			Scanner scy = new Scanner(System.in);
			String s = scy.nextLine();

			if (s.equals("yes")) {

				System.out.println("新しい本を追加します。");
				books.add();

			} else {
				System.out.println("おわり");
			}

		}
		System.out.println("\n\n本棚に空きスペースがありません。\n");
		books.bookshelfdetail();

	}
}