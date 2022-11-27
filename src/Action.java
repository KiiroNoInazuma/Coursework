public class Action {
    final static int LESS = 0;
    final static int MORE = 1;
    private Employee[] baseEmp = new Employee[3];


    void allDataEmp() {
        for (Employee j : baseEmp) {
            if (j != null)
                System.out.println(j);
        }
    }

    void allDataEmp(String depart) {
        for (Employee j : baseEmp) {
            if (j != null && j.getDepartment().equals(depart))
                System.out.println(j.getId() + "." + j.getNameEmp() + "(" + j.getSalary() + ")");
        }
    }


    void allFullName() {
        for (Employee j : baseEmp) {
            if (j != null)
                System.out.println(j.getNameEmp());
        }
    }


     void chooseSalary(double salary, int choose) {
        for (Employee j : baseEmp) {
            if (choose == 0) {
                if (j != null && j.getSalary() <= salary)
                    System.out.println(j.getId() + "." + j.getNameEmp() + "(" + j.getSalary() + ")");
            } else if (choose == 1) {
                if (j != null && j.getSalary() >= salary)
                    System.out.println(j.getId() + "." + j.getNameEmp() + "(" + j.getSalary() + ")");
            }
        }
    }


     void minSalary() {
        System.out.println(getMin());
    }

     void minSalary(String depart) {
        System.out.println(getMin(depart));
    }


     void maxSalary() {
        System.out.println(getMax());
    }

     void maxSalary(String depart) {
        System.out.println(getMax(depart));
    }


     double sumSalary() {
        double sum = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null) {
                sum += baseEmp[i].getSalary();
            }
        }
        return sum;
    }


     double sumSalary(String depart) {
        double sum = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && baseEmp[i].getDepartment().equals(depart)) {
                sum += baseEmp[i].getSalary();
            }
        }
        return sum;
    }


     double averageSalary() {
        int checkElement = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null)
                checkElement++;
        }
        double avg = sumSalary() / checkElement;
        return avg;
    }


     double averageSalary(String depart) {
        int checkElement = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && baseEmp[i].getDepartment().equals(depart))
                checkElement++;
        }
        double avg = sumSalary(depart) / checkElement;
        return avg;
    }


     Employee getMin() {
        double min = getMax().getSalary();
        int ind = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && min > baseEmp[i].getSalary()) {
                min = baseEmp[i].getSalary();
                ind = i;

            }
        }
        return baseEmp[ind];
    }

     Employee getMin(String depart) {
        double min = getMax().getSalary();
        int ind = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && min > baseEmp[i].getSalary() && baseEmp[i].getDepartment().equals(depart)) {
                min = baseEmp[i].getSalary();
                ind = i;

            }
        }
        return baseEmp[ind];
    }


     Employee getMax() {
        double max = 0;
        int ind = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && max < baseEmp[i].getSalary()) {
                max = baseEmp[i].getSalary();
                ind = i;

            }
        }
        return baseEmp[ind];
    }


     Employee getMax(String depart) {
        double max = 0;
        int ind = 0;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && max < baseEmp[i].getSalary() && baseEmp[i].getDepartment().equals(depart)) {
                max = baseEmp[i].getSalary();
                ind = i;

            }
        }
        return baseEmp[ind];
    }


     void indexationSalary(double indexS) {
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null) {
                baseEmp[i].setSalary(baseEmp[i].getSalary() * (indexS / 100 + 1));
            }
        }
    }


     void indexationSalary(double indexS, String depart) {
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] != null && baseEmp[i].getDepartment().equals(depart)) {
                baseEmp[i].setSalary(baseEmp[i].getSalary() * (indexS / 100 + 1));
            }
        }
    }


     void addEmployee(String department, String surname, String name, String patronymic, int salary) {
        Employee add = new Employee(department, new NameEmployee(surname, name, patronymic), salary);
        Boolean check = true;
        for (int i = 0; i < baseEmp.length; i++) {
            if (baseEmp[i] == null) {
                check = false;
                baseEmp[i] = add;
                break;
            }

        }
        if (check) {
            System.out.println("Внимание! Архив заполнен. Невозможно добавить данные.");
        } else {
            System.out.println("Запись добавлена.");
        }
    }


}
