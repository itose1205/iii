package curriculum.b;

public class Question5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		helloWorld();
		
		int num = dobleValue(10);
		System.out.println(10 + "を2倍すると" + num + "です。");
		
		int num1= 7;
		if (isEven(num1)) {
			System.out.println(num1+ "は偶数です。");
		} else {
			System.out.println(num1+ "は奇数です。");
		}
        int num2 = 10;
        if (isEven(num2)) {
			System.out.println(num2+ "は偶数です。");
		} else {
			System.out.println(num2+ "は奇数です。");
		}
        
        
        
        
		
			

	}

	public static void helloWorld() {
		System.out.println("Hello,World!");
	}

	public static int dobleValue(int num) {
		return num * 2;

	}

	public static boolean isEven(int num) {
		return num % 2 == 0;

	}
	
	

}
