public class EmployeeSearch {

	public Employee[] linearSearch(Employee[] employeeList, String lastName) {
		
		Employee[] resultList = new Employee[0];
		for (int x = 0; x < employeeList.length; x++) {
			if (lastName.equalsIgnoreCase(employeeList[x].getLastName())) {
				Employee[] resultListTemp = new Employee[resultList.length + 1];
				for (int results = 0; results < resultList.length; results++)
					resultListTemp[results] = resultList[results];
				resultList = resultListTemp;

				resultList[resultList.length - 1] = employeeList[x];
			}
		}
		return resultList;

	}

	public Employee[] binarySearch(Employee[] employeeList, String lastName) {
		
		Employee[] resultList = new Employee[0];
		int low = 0, high = employeeList.length-1, middle = (low + high) / 2;

		while (!lastName.equalsIgnoreCase(employeeList[middle].getLastName()) && low <= high) {
			if (employeeList[middle].getLastName().compareToIgnoreCase(lastName) > 0) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
			middle = (low + high) / 2;
		}

		if(lastName.equalsIgnoreCase(employeeList[middle].getLastName())) { // repeat for left and right of this

			for(int x = low; x <= high; x++) {
				if (lastName.equalsIgnoreCase(employeeList[x].getLastName())) {
					Employee[] resultListTemp = new Employee[resultList.length + 1];
					for (int results = 0; results < resultList.length; results++) {
						resultListTemp[results] = resultList[results];
					}
					resultList = resultListTemp;

					resultList[resultList.length - 1] = employeeList[x];
				}
			}
		}

		return resultList;
	}

}