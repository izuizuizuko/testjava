package basic;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scy = new Scanner(System.in);
		String s = scy.next();
		switch (s) {
		case "yes":
			System.out.println("新しい本を追加します。");

			break;
		case "no":
			System.out.println("おわり");
			break;

		}

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
sc.close();

		System.out.println("繰り返し、書籍を追加しますか？[はい: yes いいえ: no]");
	}
}

