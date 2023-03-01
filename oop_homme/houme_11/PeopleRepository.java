package oop_homme.houme_11;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import oop_homme.houme_11.CreatePeople;

public class PeopleRepository extends People implements  Serializable {
    public static Scanner input = new Scanner(System.in);
    private List<List<Node>> family = new ArrayList<>();
    private Kinship newKinship = new Kinship(new ArrayList<>());


    public People addInfoAboutNewPeople() {

        System.out.println("Введите Фамилию и нажмите Enter");
        String fn = input.next();
        System.out.println("Введите Имя и нажмите Enter");
        String name = input.next();
        System.out.println("Введите Отчество и нажмите Enter");
        String ln = input.next();
        System.out.println("Введите Дату рождения(1960,07,22-год,месяц,день через зпт и без пробелов) и нажимайте Enter");
        String year = input.next();
        String[] arr = year.split(",");
        LocalDate d = LocalDate.of(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        System.out.println("Введите Пол(м/ж) и нажмите Enter");
        String sex = input.next();
        System.out.println("Введите статус(допустимые значения мать, отец, сестра, брат, жена, муж, дочь, " +
                "сын) и нажмите Enter");
        String status = input.next();

        return CreatePeople.getInsctance()
                .setSurName(fn)
                .setFirstName(name)
                .setLastName(ln)
                .setDay(year)
                .setSex(sex)
                .Create();
    }



    public void getAllTree() {
        System.out.println(family);
    }

    public void setFamily(List<Node> relatives) {
        this.family.add(relatives);
    }


}
