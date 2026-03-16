package curriculum.j;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<Billable> employee = new ArrayList<Billable>();
		employee.add(new FullTimeEmployee("E001", "山田"));
		employee.add(new ContractEmployee("E002", "田中"));
		for (Billable b : employee) {
			int wage = b.costForDay(10);
			System.out.println("給与:" + wage + "円");
		}

	}

}
