package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		byte byteNum = 5;
		short shortNum = 10;
		int intNum = 100;
		long longNum = 1000;
		float floatNum = 1.2f;
		double doubleNum = 1.23;
		char letter = 'b';
		String letters = " こんにちは ";
		boolean isBoolean = false;

		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = " ハロー ";
		isBoolean = true;

		int number = 11110;
		System.out.println(number);

		number = 20;
		System.out.println(number);

		System.out.println(letter);
		System.out.println(letters);
		System.out.println(isBoolean);

		number = 11110;
		number = number + 20;
		System.out.println(number);

		longNum = longNum * longNum * shortNum;
		System.out.println(longNum);

		doubleNum = doubleNum / 100;
		System.out.println(doubleNum);

		number = 10;
		number = number - 100;
		System.out.println(number);

		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");

		int age = 25;
		System.out.println("年齢:" + age + "歳");

		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);

		int score = 80;
		score = score + 20;
		System.out.println("最終スコア:" + score);

		String numStr = "123";
		int num3 = Integer.parseInt(numStr);
		num3 = num3 + 10;
		System.out.println("変換後の値:" + num3);

		int num = 50;
		String str = String.valueOf(num);
		System.out.println("得点:" + str + "点");

		int a = 10;
		int b = 20;
		boolean result = (a < b);
		System.out.println(result);

		int x = 15;
		String max = (x >= 10) ? "OK" : "NG";
		System.out.println(max);

		String text = "私はJavaが好きです。Javaは楽しい！";
		text = text.replace("Java", "Python");
		System.out.println(text);

	}

}
