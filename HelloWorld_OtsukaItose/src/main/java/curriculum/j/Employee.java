package curriculum.j;

abstract class Employee implements Billable {
	String id;
	String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract int costForDay(int hoursWorked);

}
