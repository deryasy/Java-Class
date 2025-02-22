public abstract class B_Employee {

	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public B_Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public abstract double calculateTotalIncome();

	public String toString() {
		return name + " " + surname + " - $" + calculateTotalIncome();
	}

}
