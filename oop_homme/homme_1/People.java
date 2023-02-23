package oop_homme.homme_1;


public class People {
    public String fullName;
    public int age;
    public String birthDay;
    public String father;
    public String mother;
    public String grandFathher;
    public String grandMother;


    /** Конструктор Человека. У каждого человека естьЭ
     * @param fullName ФИО
     * @param age Возраст
     * @param birthDay День рождения
     * @param father Отец
     * @param mother Мать
     * @param grandFathher Дедушка
     * @param grandMother бабушка
     */
    public People(String fullName, int age, String birthDay, String father, String mother, String grandFathher,
            String grandMother) {

        this.fullName = fullName;
        this.age = age;
        this.birthDay = birthDay;
        this.father = father;
        this.mother = mother;
        this.grandFathher = grandFathher;
        this.grandMother = grandMother;

    }
    public People(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }
    public String getMother() {
        return mother;
    }
    public void setMother(String mother) {
        this.mother = mother;
    }
    public String getGrandFathher() {
        return grandFathher;
    }
    public void setGrandFathher(String grandFathher) {
        this.grandFathher = grandFathher;
    }
    public String getGrandMother() {
        return grandMother;
    }
    public void setGrandMother(String grandMother) {
        this.grandMother = grandMother;
    }




}


