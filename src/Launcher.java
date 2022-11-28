
public class Launcher {
    public static void main(String[] args) {
        Action act = new Action();

        act.addEmployee("1", "Тестов", "Тест", "Тестович", 100001);
        act.addEmployee("2", "Тестов", "Тест", "Тестович", 100002);
        act.addEmployee("1", "Тестов", "Тест", "Тестович", 100005);
        act.editSalary("Тестов Тест Тестович", 1);

        act.editDepartment("Тестов Тест Тестович", "3");
        act.allDataEmp();
    }
}
