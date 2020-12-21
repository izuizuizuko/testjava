package basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BookShelf books = new BookShelf();
		books.nowlist();
		books.yesno();
		books.add();
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		switch (s) {
		case "yes":
			books.add();
			break;
		case "no":
			System.out.println("おわり");
			break;
		}
	}

	}

