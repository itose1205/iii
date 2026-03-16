package curriculum.k;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new FullTimeEmployee("山田"));
		employee.add(new ContractEmployee("田中"));
		for (Employee e : employee) {
			int wage = e.costForDay(10);
			System.out.println(e.name + "の給与:" + wage + "円");
		}

	}

}
