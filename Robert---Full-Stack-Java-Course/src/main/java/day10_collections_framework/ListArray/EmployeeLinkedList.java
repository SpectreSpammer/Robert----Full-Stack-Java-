package day10_collections_framework.ListArray;

public class EmployeeLinkedList {

    private  int id;
    private String name;
    private String department;

    public EmployeeLinkedList(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "RobertEmployeeArrayList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
