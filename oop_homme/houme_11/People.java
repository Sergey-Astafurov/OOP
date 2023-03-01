package oop_homme.houme_11;

import java.time.LocalDate;

public class People {
    String firstName;
    String surName;
    String lasttName;
    LocalDate birthDate;
    String sex;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s\nИмя: %s\nОтчество:%s\nДата рождения: %s ", surName,firstName,lasttName,birthDate);
    }
}
