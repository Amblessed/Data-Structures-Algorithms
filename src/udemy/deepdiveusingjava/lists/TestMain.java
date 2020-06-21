package udemy.deepdiveusingjava.lists;

import udemy.deepdiveusingjava.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestMain {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 2345));
        employeeList.add(new Employee("Mike", "Wilson", 7865));


        List<Employee> employeeVectorList = new Vector<>();   //The Vector class is synchronized
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 2345));
        employeeList.add(new Employee("Mike", "Wilson", 7865));

//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println("\n" + employeeList.isEmpty());

//        employeeList.set(1, new Employee("Patrick", "Adams", 5839));
//        System.out.println("\n\n");
//        employeeList.forEach(employee -> System.out.println(employee));


//        System.out.println("\nThe Size of the array list is " + employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
        System.out.println("\n");
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("\n");
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 2345)));

        System.out.println("\n");
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));


    }
}
