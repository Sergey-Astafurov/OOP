package oop_homme.houme_11;

import java.time.LocalDate;

public class CreatePeople {
    private static CreatePeople instance;

    public static CreatePeople getInsctance() {
        if (instance == null)
            instance = new CreatePeople();
            instance.init();
            return instance;


    }

    People people;

    private void init() {
        people = new People();
        people.birthDate = LocalDate.parse("1999-01-06");
        people.firstName = "";
        people.surName = "";
        people.lasttName = "";
        people.sex = "";
    }

    public CreatePeople setDay(String ofBrith) {
        people.birthDate = LocalDate.parse(ofBrith);
        return this;
    }

    public CreatePeople setFirstName(String firstName) {
        people.firstName = firstName;
        return this;

    }

    public CreatePeople setSurName(String surname) {
        people.surName = surname;
        return this;

    }

    public CreatePeople setLastName(String lastName) {
        people.lasttName = lastName;
        return this;
    }

    public CreatePeople setSex(String sex) {
        people.sex = sex;
        return this;
    }

    public People Create() {
        return people;
    }

    public String infoPeople() {
        return String.format("Фамилия %s Имя %s  Отчество %s", people.surName, people.firstName, people.lasttName);
    }
}
