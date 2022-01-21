import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		String EM_VERSION = "v1.25.643";

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int option = 0;
		EmployeeManager em = new EmployeeManager();

		System.out.println(" -~- Employee Manager (" + EM_VERSION + ") -~- ");
		System.out.println(" ");
		System.out.println(" [1.] Linear Search");
		System.out.println(" [2.] Binary Search");
		System.out.println(" [3.] Selection Sort");
		System.out.println(" [4.] Insertion Sort");
		System.out.println(" [5.] Hire Employee");
		System.out.println(" [6.] Fire Employee");
		System.out.println(" [7.] List All Employees");
		System.out.println(" [8.] Modify Employee");
		System.out.println(" [9.] Exit");
		System.out.println(" ");

		while(option != 9) {

			option = 0;

			while(option < 1 || option > 9) {
				System.out.println(" Please select menu option 1-9:");
				System.out.print(" --> ");
				option = s1.nextInt();
				if (option < 1 || option > 9) {
					System.out.println(" ");
					System.out.println(" [!] Invalid option, please try again.");
				}
			}

			System.out.println(" ");

			if(option == 1) { //linear search
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Linear Search -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				System.out.print(" Last Name: ");
				String lastName = s.nextLine();

				em.linearSearch(lastName);

			} else if(option == 2) { //binary search
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Binary Search -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				System.out.print(" Last Name: ");
				String lastName = s.nextLine();

				em.binarySearch(lastName);

			} else if(option == 3) { //selection sort
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Selection Sort -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				em.selectionSort();
				System.out.println(" ");
				System.out.println(em.toString());

			} else if(option == 4) { //insertion sort
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Insertion Sort -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				em.insertionSort();
				System.out.println(" ");
				System.out.println(em.toString());

			} else if(option == 5) { //hire employee
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Hire Employee -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				System.out.print(" Last Name: ");
				String lastName = s.nextLine();

				System.out.print(" First Name: ");
				String firstName = s.nextLine();

				System.out.print(" Job: ");
				String job = s.nextLine();

				System.out.print(" Salary: ");
				Double salary = s1.nextDouble();
				System.out.println(" ");

				em.hire(lastName, firstName, job, salary);
				System.out.println(" ");

			} else if(option == 6) { //fire Employee
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Fire Employee -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				System.out.print(" Last Name: ");
				String lastName = s.nextLine();
				System.out.println(" ");

				em.fire(lastName);
				System.out.println(" ");

			} else if(option == 7) { //list Employees
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Employee List -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				System.out.println(em.toString());

			} else if(option == 8) { //modify Employee
				
				System.out.println(" -~- -~- -~- -~- -~- -~- -~- Modify Employee -~- -~- -~- -~- -~- -~- -~- ");
				System.out.println(" ");

				System.out.println(em.toString());

				System.out.print(" Employee ID: ");
				int employeeID = s2.nextInt();
				System.out.println(" ");

				em.modify(employeeID);				

			} 

		}

		s.close();
		s1.close();
		s2.close();

		System.out.println(" [!] Thank you for using Employee Manager (" + EM_VERSION + "). Goodbye.");

	}

}