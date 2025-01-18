package day10_collections_framework.ListLinked;

import day10_collections_framework.ListArray.EmployeeLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class EmployeeServiceLinkedList {
    private LinkedList<EmployeeLinkedList> employeeLinkedLists;

    public EmployeeServiceLinkedList() {
        employeeLinkedLists = new LinkedList<>();
    }

    //get
    public EmployeeLinkedList getFirstElement(){
        return employeeLinkedLists.getFirst();
    }

    public EmployeeLinkedList getLastElement(){
        return employeeLinkedLists.getLast();
    }

    //add
    public void addEmployee(EmployeeLinkedList employee){
        employeeLinkedLists.add(employee);
    }

    //add employee by index
    public void addEmployeeByFirstElement(EmployeeLinkedList employee){
        employeeLinkedLists.addFirst(employee);
    }

    public void addEmployeeByLastElement(EmployeeLinkedList employee){
        employeeLinkedLists.addLast(employee);
    }

    //update
    public void updateEmployeeByIndex(int index, EmployeeLinkedList updateEmployee){
        employeeLinkedLists.set(index,updateEmployee);
    }

    //remove
    public EmployeeLinkedList removeEmployeeByFirstElement(){
        return employeeLinkedLists.removeFirst();
    }

    public EmployeeLinkedList removeEmployeeByLastElement(){
        return employeeLinkedLists.removeLast();
    }

    public EmployeeLinkedList removeEmployeeByIndex(int removeByIndex){
        return employeeLinkedLists.remove(removeByIndex);
    }

    //total employees
    public int getTotalOfEmployees(){
        return employeeLinkedLists.size();
    }

    //empty
    public boolean isEmpty(){
        return employeeLinkedLists.isEmpty();
    }

    //printing all of employee
    public void printAllEmployees(){
        for(EmployeeLinkedList emp : employeeLinkedLists){
            System.out.println(emp);
        }
    }
}
