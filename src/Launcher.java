public class Launcher {
    public static void main(String[] args) {

        Action.addEmployee("1", "Тестов", "Тест", "Тестович", 100001);
        Action.addEmployee("2", "Тестов", "Тест", "Тестович", 100002);
        Action.addEmployee("1", "Тестов", "Тест", "Тестович", 100005);
        Action.chooseSalary(100002, Action.LESS);
    }
}
