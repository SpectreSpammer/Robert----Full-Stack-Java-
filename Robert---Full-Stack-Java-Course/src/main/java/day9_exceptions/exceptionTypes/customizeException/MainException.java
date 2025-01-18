package day9_exceptions.exceptionTypes.customizeException;

public class MainException {
    public static void main(String[] args)  {
        EmployeeException employeeException = new EmployeeException("Robert", 50000.75);


        try{
            employeeException.raiseSalary( 10);
            System.out.println("10% raise is successfull");
            System.out.println("Current Salary: " + employeeException.getSalary());

            System.out.println("---------");
            employeeException.raiseSalary(101);
            System.out.println("Salary failed: " + employeeException.getSalary());

        }catch (InvalidRaiseException invalidRaiseException){
            System.out.println("Error: " + invalidRaiseException.getMessage());
        }finally {
            System.out.println("Salary processing is completed.");
        }

        /*
        employeeException.raiseSalary(10);
        System.out.println("Current Salary: " + employeeException.getSalary());

        employeeException.raiseSalary(101);
        System.out.println("2nd Current Salary: " + employeeException.getSalary());
        */
    }
}
