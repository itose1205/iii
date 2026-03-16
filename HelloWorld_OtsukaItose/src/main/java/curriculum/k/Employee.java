package curriculum.k;

abstract class Employee implements Payable {
	String name;

	public Employee(String name) {
		this.name = name;
	}
	public abstract int costForDay(int hoursWorked);
}
