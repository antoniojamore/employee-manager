public class Employee implements Comparable {

	private String firstName;
	private String lastName;
	private String job;
	private double salary;

	public Employee(String lastName, String firstName, String job, double salary) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.job = job;
		this.salary = salary;
		// System.out.println(" [+] Employee added to database: \"" + this.lastName + ", " + this.firstName + "\""); // spammy
	}

	public void changeLastName(String lastName) {
		this.lastName = lastName;
		System.out.println(" [!] Last name has been changed to \"" + lastName + "\".");
	}

	public void changeFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println(" [!] First name has been changed to \"" + firstName + "\".");
	}

	public void changeJob(String job) {
		this.job = job;
		System.out.println(" [!] Job has been changed to \"" + job + "\".");
	}

	public void raiseByPercent(double raisePercentage) {
		raisePercentage = raisePercentage / 100;
		salary = salary + (salary * raisePercentage);
		System.out.println(" [!] Salary has been changed to \"" + salary + "\".");
	}

	public void raiseByNumber(double raiseNumber) {
		salary = salary + raiseNumber;
		System.out.println(" [!] Salary has been changed to \"" + salary + "\".");
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getJob() {
		return job;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return lastName + ", " + firstName + " - " + job + " ($" + salary + ")";
	}

	public int compareTo(Object obj)  {
		if (((Employee)obj).getLastName().compareToIgnoreCase(getLastName()) > 0) {
			return -1; 
		} else if (((Employee)obj).getLastName().compareToIgnoreCase(getLastName()) < 0) {
			return 1; 
		} else {
			if (((Employee)obj).getFirstName().compareToIgnoreCase(getFirstName()) > 0) {
				return -1; 
			} else if (((Employee)obj).getFirstName().compareToIgnoreCase(getFirstName()) < 0) {
				return 1; 
			} else {
				if (((Employee)obj).getJob().compareToIgnoreCase(getJob()) > 0) {
					return -1; 
				} else if (((Employee)obj).getJob().compareToIgnoreCase(getJob()) < 0) {
					return 1; 
				} else {
					if (((Employee)obj).getSalary() < getSalary()) {
						return -1; 
					} else if (((Employee)obj).getSalary() > getSalary()) {
						return 1; 
					} else {
						return 0;
					}
				}
			}
		}
	}

}