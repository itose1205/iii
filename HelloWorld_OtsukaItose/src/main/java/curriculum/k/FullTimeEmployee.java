package curriculum.k;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name) {
		super(name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1200;
		return hourlyRate * hoursWorked;

	}

}
