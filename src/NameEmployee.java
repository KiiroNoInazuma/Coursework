public class NameEmployee {
    private String name, patronymic, surname;


    NameEmployee(String surname, String name, String patronymic) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;

    }


    String getName() {
        return name;
    }

    String getPatronymic() {
        return patronymic;
    }

    String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }
}
