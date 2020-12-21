package basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BookShelf books = new BookShelf();
		books.nowlist();
		books.yesno();
		books.add();

		Scanner scy = new Scanner(System.in);
		String s = scy.nextLine();

		if (s.equals("yes")) {
			System.out.println("新しい本を追加します。");
			books.add();
		} else {
			System.out.println("おわり");
		}
		// Scanner scc = new Scanner(System.in);
		// String s = scc.nextLine();
		//
		// if (s.equals("yes")) {
		// books.add();
		// } else {
		// System.out.println("おわり");
		// }

	}

}
