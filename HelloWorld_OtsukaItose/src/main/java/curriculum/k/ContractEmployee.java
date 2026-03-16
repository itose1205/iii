package curriculum.k;

public class ContractEmployee extends Employee {
	public ContractEmployee(String name) {
		super(name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000;
		return hourlyRate * hoursWorked;

	}

}
