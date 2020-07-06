package entities;

public class Emplyooe {

	private int Id;
	private String name;
	private double salary;

	public Emplyooe(int Id, String name, double salary) {
		this.Id = Id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary += salary;
	}

	public void increaseSalary(double percentage) {

		setSalary(this.salary * (percentage / 100));

	}

	@Override
	public String toString() {

		return Id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
