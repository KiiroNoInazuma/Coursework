public class Employee {
    static int counter = 1;
    private int id = counter;
    private String department;
    private double salary;
    private NameEmployee nameEmp;


    public Employee(String department, NameEmployee nameEmp, double salary) {
        this.department = department;
        this.salary = salary;
        this.nameEmp = nameEmp;
        counter++;

    }

    int getCounter() {
        return counter;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }

    NameEmployee getNameEmp() {
        return nameEmp;
    }

    int getId() {
        return id;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "." + department + " --> " + nameEmp + "(" + salary + ");";
    }
}
