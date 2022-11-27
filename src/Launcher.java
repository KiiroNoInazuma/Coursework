import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
        Action.addEmployee("1", "Тестов", "Тест", "Тестович", 100001);
        Action.addEmployee("1", "Тестов", "Тест", "Тестович", 100002);
        Action.addEmployee("1", "Тестов", "Тест", "Тестович", 100003);
        Action.allDataEmp();
        Action.allFullName();
        Action.minSalary();
        Action.maxSalary();
    }
}
