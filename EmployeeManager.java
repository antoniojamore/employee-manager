import java.util.Scanner;

public class EmployeeManager {

	Employee[] employeeList;
	EmployeeSearch eSearch;
	EmployeeSort eSort;
	Scanner s, s1;

	public EmployeeManager() {
		eSearch = new EmployeeSearch();
		eSort = new EmployeeSort();
		s = new Scanner(System.in);
		s1 = new Scanner(System.in);
		employeeList = new Employee[10];
		employeeList[0] = new Employee("Mendez", "Trevor", "Software Engineer", 92046);
		employeeList[1] = new Employee("Jensen", "Theodore", "Senior Software Engineer", 132381);
		employeeList[2] = new Employee("Waters", "Leslie", "Software Engineer", 96100);
		employeeList[3] = new Employee("Wood", "Vera", "Product Manager", 108992);
		employeeList[4] = new Employee("Mason", "Derrick", "Client Relationship Manager", 103183);
		employeeList[5] = new Employee("Fox", "Forrest", "Managing Director", 165455);
		employeeList[6] = new Employee("Horton", "Irvin", "Quality Assurance Engineer", 70417);
		employeeList[7] = new Employee("Pearson", "Edgar", "Junior Software Engineer", 89114);
		employeeList[8] = new Employee("Pierce", "Inez", "President & CEO", 198168);
		employeeList[9] = new Employee("Pierce", "Inez", "Office Manager", 54913);
	}

	public void selectionSort() {
		employeeList = eSort.selectionSort(employeeList);
		System.out.println(" [!] Employee list has been selection sorted.");
	}

	public void insertionSort() {
		employeeList = eSort.insertionSort(employeeList);
		System.out.println(" [!] Employee list has been insertion sorted.");
	}

	public void linearSearch(String lastName) {
		Employee[] searchResult = eSearch.linearSearch(employeeList, lastName);
		String result = "";
		for (int id = 0; id < searchResult.length; id++) {
			result += " [" + (id + 1) + ".] " + searchResult[id].toString() + "\n";
		}
		System.out.println(result);
		if (searchResult.length == 0) {
			System.out.println(" [!] No results found.");
		}
	}

	public void binarySearch(String lastName) {
		Employee[] searchResult = eSearch.binarySearch(employeeList, lastName);
		String result = "";
		for (int id = 0; id < searchResult.length; id++) {
			result += " [" + (id + 1) + ".] " + searchResult[id].toString() + "\n";
		}
		System.out.println(result);
		if (searchResult.length == 0) {
			System.out.println(" [!] No results found.");
		}
	}

	public void hire(String lastName, String firstName, String job, double salary) {
		Employee[] employeeListTemp = new Employee[employeeList.length + 1];
		for (int employees = 0; employees < employeeList.length; employees++)
			employeeListTemp[employees] = employeeList[employees];
		employeeList = employeeListTemp;

		employeeList[employeeList.length - 1] = new Employee(lastName, firstName, job, salary);
		System.out.println(" [+] Employee hired successfully: \"" + lastName + ", " + firstName + "\"");
	}

	public void fire(String lastName) {

		Employee[] resultList = new Employee[0];
		int fireCount = 0;
		for (int x = 0; x < employeeList.length; x++) {
			if (lastName.equalsIgnoreCase(employeeList[x].getLastName())) {
				System.out.println(" [-] Firing \"" + employeeList[x].getLastName() + ", " + employeeList[x].getFirstName() + "\"");
				fireCount++;
			} else {
				Employee[] resultListTemp = new Employee[resultList.length + 1];
				for (int results = 0; results < resultList.length; results++)
					resultListTemp[results] = resultList[results];
				resultList = resultListTemp;

				resultList[resultList.length - 1] = employeeList[x];
			}
		}

		employeeList = resultList;

		if (fireCount == 0) {
			System.out.println(" [!] Found no employees to fire with that last name.");
		} else {
			System.out.println(" [!] Fired " + fireCount + " employee(s) successfully.");
		}

	}

	public void modify(int employeeID) {
		employeeID--;

		System.out.print(" Last Name (" + employeeList[employeeID].getLastName() + "): ");
		employeeList[employeeID].changeLastName(s.nextLine());
		System.out.println(" ");

		System.out.print(" First Name (" + employeeList[employeeID].getFirstName() + "): ");
		employeeList[employeeID].changeFirstName(s.nextLine());
		System.out.println(" ");

		System.out.print(" Job (" + employeeList[employeeID].getJob() + "): ");
		employeeList[employeeID].changeJob(s.nextLine());
		System.out.println(" ");

		System.out.print(" Salary % Increase (" + employeeList[employeeID].getSalary() + "): ");
		employeeList[employeeID].raiseByPercent(s1.nextDouble());
		System.out.println(" ");

		System.out.print(" Salary # Increase (" + employeeList[employeeID].getSalary() + "): ");
		employeeList[employeeID].raiseByNumber(s1.nextDouble());
		System.out.println(" ");

	}

	public String toString() {
		String result = "";
		for (int id = 0; id < employeeList.length; id++) {
			result += " [" + (id + 1) + ".] " + employeeList[id].toString() + "\n";
		}
		return result;
	}

	public Employee[] getList() {
		return employeeList;
	}

}