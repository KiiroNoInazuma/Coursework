import java.util.Arrays;

public class Launcher {
    static Employee[] baseEmp = new Employee[10];


    static void allDataEmp(Employee[] emp) {
        System.out.println(Arrays.toString(emp));
    }

    static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null) {
                sum += baseEmp[i].getSalary();
            }
        }
        return sum;
    }

    static double averageSalary() {
        int x = 0;
        double avg = sumSalary();
        return avg;
    }


    public static void main(String[] args) {
        Employee emp = new Employee("1", new NameEmployee("Тестов", "Тест", "Тестович"), 100000.00);
        Employee emp1 = new Employee("1", new NameEmployee("Тестов", "Тест", "Тестович"), 100000.00);
        baseEmp[0] = emp;
        baseEmp[1] = emp1;
        allDataEmp(baseEmp);
        System.out.println(averageSalary());


    }
}
