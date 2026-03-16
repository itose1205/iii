package curriculum.j;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1250;
		if (hoursWorked <= 8) {
			return hoursWorked * hourlyRate;
		} else {
			int usually = 8 * hourlyRate;
			int over = (hoursWorked - 8) * (int) (hourlyRate * 1.25);
			return usually + over;
		}

	}

}
