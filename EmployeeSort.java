public class EmployeeSort {

	public Employee[] selectionSort(Employee[] employeeList) {
		
		int min;
		Employee temp;
		for (int x = 0; x < employeeList.length - 1; x++) {
			min = x;
			for (int y = x + 1; y < employeeList.length; y++) {
				if (employeeList[y].compareTo(employeeList[min]) < 0) {
					min = y;
				}
			}

			temp = employeeList[min];
			employeeList[min] = employeeList[x];
			employeeList[x] = temp;
		}

		return employeeList;

	}

	public Employee[] insertionSort(Employee[] employeeList) {

		for (int x = 1; x < employeeList.length; x++) {
			Employee key = employeeList[x];
			int pos = x;

			while (pos > 0 && employeeList[pos-1].compareTo(key) > 0) {
				employeeList[pos] = employeeList[pos-1];
				pos--;
			}
			employeeList[pos] = key;
		}

		return employeeList;
	}

}