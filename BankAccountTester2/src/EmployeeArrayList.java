import java.util.ArrayList;

public class EmployeeArrayList {
	public static void main(String[] args) {

		// Creating Objects of Employee class
		Employee e1 = new Employee("Raj","Manager");
		Employee e2 = new Employee("Simran", "CEO");
		Employee e3 = new Employee("Anish", "CTO");

		// Creating an ArrayList of Employee type
		ArrayList<Employee> employeeList= new ArrayList<>();

		// Inserting the employee objects in the ArrayList
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		// e1 will be inserted again as ArrayList can store multiple
		// reference to the same object
		employeeList.add(e1);
		//employeeList.removeAll(Collection:e1);
		//employeeList.remove(e2);

		// Checking if e2 already exists inside ArrayList
		// if it exists then we don't insert it again
		if(!employeeList.contains(e2))
			{System.out.println("adding e2");employeeList.add(e2);}

		// ArrayList after insertions: [e1, e2, e3, e1]

		// Iterating the ArrayList with the help of Enhanced for loop
		for(Employee employee: employeeList){
			System.out.println(employee.getName() + " is a " + employee.getDesignation());
		}
	}
}
