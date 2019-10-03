package Ejercicio10;

public class Employee {

	private String name;
	private double payRate;
	private static int nextID;
	private int EMPLOYEE_ID;
	public static double STARTING_PAY_RATE;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, double payRate) {
		super();
		this.name = name;
		this.payRate = payRate;
	}

	public String getName() {
		return name;
	}

	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public static int getNextID() {
		return nextID;
	}

}
