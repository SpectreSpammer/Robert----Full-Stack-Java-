package day10_collections_framework.ListArray;

public class MainArrayList {
    public static void main(String[] args) {

        EmployeeServiceArrayList employee = new EmployeeServiceArrayList();

        employee.addEmployee(new EmployeeLinkedList(1,"Robert","IT"));
        employee.addEmployee(new EmployeeLinkedList(3,"Nan","Security"));
        employee.addEmployee(new EmployeeLinkedList(2,"Nami","Finance"));
        employee.addEmployee(new EmployeeLinkedList(2,"Nami","Finance"));
        employee.addEmployee(new EmployeeLinkedList(4,"Robin","HR"));

        System.out.println("After adding of employees");
        employee.printAllEmployees();
        System.out.println();
        System.out.println("-----Updating employee------");
        employee.updateEmployeeByIndex(4,new EmployeeLinkedList(6,"Nico Robin","Human Resource)"));
        employee.printAllEmployees();
        System.out.println();
        System.out.println("-----Removing an Employee-----");
        employee.removeEmployeeByIndex(3);
        employee.printAllEmployees();
        System.out.println();
        System.out.println("Total of employees: "  + employee.getTotalOfEmployees());
        System.out.println("Is the employeee empty?: "  + employee.isEmpty());
        System.out.println("Employee at index 3 ?: "  + employee.getEmployeeByIndex(3));


    }
}
