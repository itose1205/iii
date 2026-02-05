package curriculum.b;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		String[] str = { "*", "**", "***", "****", "*****" };
		for (String str2 : str) {
			System.out.println(str2);
		}

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		count = 2;
		while (count <= 20) {
			System.out.println(count);
			count = count + 2;
		}

		count = 10;
		while (count >= 1) {
			System.out.println(count);
			count--;
		}

		sum = 0;
		count = 1;
		while (count <= 100) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);

		Scanner scanner = new Scanner(System.in);
		int input = 1;
		while (input != 0) {
			System.out.println("入力してください");
			input = scanner.nextInt();
		}
		System.out.println("終了しました");

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				String form = String.format("%02d*%02d=%02d", a, b, a * b);
				System.out.print(form);
				if (b <= 8) {
					System.out.print("||");
				}
			}

			System.out.println();
		}

		String str3 = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		String[] items = str3.split("、");
		int stock = (int) (Math.random() * 12);
		for (String itemname : items) {
			switch (itemname) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stock + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stock + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + stock + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + stock + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + stock + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				int output = itemname.equals("テレビ") ? stock : 11 - stock;
				System.out.println(itemname + "の残り台数は" + output + "台です");
				break;
			default:
				System.out.println("『" + itemname + "』は指定の商品ではありません");
			}
		}

	}
}
