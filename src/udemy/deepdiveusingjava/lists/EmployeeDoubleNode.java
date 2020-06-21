package udemy.deepdiveusingjava.lists;

import udemy.deepdiveusingjava.Employee;

public class EmployeeDoubleNode {

    private Employee employee;
    private EmployeeDoubleNode next;
    private EmployeeDoubleNode previous;

    public  EmployeeDoubleNode(Employee employee)
    {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoubleNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoubleNode next) {
        this.next = next;
    }

    public EmployeeDoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoubleNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
