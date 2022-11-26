public class NameEmployee {
    String name, patronymic, surname;


    NameEmployee(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = patronymic;

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
