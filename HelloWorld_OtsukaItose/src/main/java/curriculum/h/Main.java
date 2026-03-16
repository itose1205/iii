package curriculum.h;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FullTimeEmployee full = new FullTimeEmployee("E001", "山田");
		PartTimeEmployee part = new PartTimeEmployee("E002", "田中");

		int fullwage = full.calculateDailyWage(9);
		int partwage = part.calculateDailyWage(9);

		System.out.println("正社員の給与:" + fullwage + "円");
		System.out.println("パート社員の給与:" + partwage + "円");
	}

}
