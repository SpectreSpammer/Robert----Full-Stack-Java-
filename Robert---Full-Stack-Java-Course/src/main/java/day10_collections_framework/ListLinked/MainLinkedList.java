package day10_collections_framework.ListLinked;

import day10_collections_framework.ListArray.EmployeeLinkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        EmployeeServiceLinkedList employeeLinkedList = new EmployeeServiceLinkedList();
        employeeLinkedList.addEmployee(new EmployeeLinkedList(1,"Robert","IT"));
        employeeLinkedList.addEmployee(new EmployeeLinkedList(3,"Nan","Security"));
        employeeLinkedList.addEmployee(new EmployeeLinkedList(2,"Nami","Finance"));
        employeeLinkedList.addEmployee(new EmployeeLinkedList(2,"Nami","Finance"));
        employeeLinkedList.addEmployee(new EmployeeLinkedList(4,"Robin","HR"));

        System.out.println("After adding of employees");
        employeeLinkedList.printAllEmployees();
        System.out.println();
        System.out.println("First Employee: " + employeeLinkedList.getFirstElement());
        System.out.println("Last Employee: " + employeeLinkedList.getLastElement());
        System.out.println();
        System.out.println("Removing First Employee: " + employeeLinkedList.removeEmployeeByFirstElement());
        System.out.println("Removing Last Employee: " + employeeLinkedList.removeEmployeeByLastElement());
        System.out.println();
        System.out.println("-----Update Employee-----");
        employeeLinkedList.printAllEmployees();

    }
}
