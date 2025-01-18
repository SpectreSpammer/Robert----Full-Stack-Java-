package day10_collections_framework.ListArray;

import java.util.ArrayList;

public class EmployeeServiceArrayList {
    private ArrayList<EmployeeLinkedList> employeeLinkedLists;

    public EmployeeServiceArrayList() {
        employeeLinkedLists = new ArrayList<>();
    }

    //get
    public EmployeeLinkedList getEmployeeByIndex(int getByIndex){
        return employeeLinkedLists.get(getByIndex);
    }


    //add
    public void addEmployee(EmployeeLinkedList employee){
        employeeLinkedLists.add(employee);
    }


    //add employee by index
    public void addEmployeeByIndex(int index, EmployeeLinkedList employee){
        employeeLinkedLists.add(index,employee);
    }

    //update
    public void updateEmployeeByIndex(int index, EmployeeLinkedList updateEmployee){
        employeeLinkedLists.set(index,updateEmployee);
    }

    //remove
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
