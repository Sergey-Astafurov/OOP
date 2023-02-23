package oop_homme.homme_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PeopleRepository peoples = new PeopleRepository();
        peoples.create(new People("Астафуров Сергей Сергеевич", 24, "06.01.1999", "Астафуров Сергей Петрович", "Кретова Наталья Владимировна", "Астафуров Петр Владимирович", "Астафурова Раиса Владимировна"));
        peoples.create(new People("Астафуров Сергей Петрович", 49, "06.01.1974", "Астафуров Петр Владимирович", "Астафурова Раиса Владимировна", "Астафуров Владимир Владимирович", "Мирошниченко Галина Михайловна"));

        Repo repo = new Repo(peoples);
        var res = repo.readCommonList();
        System.out.println(res);



    }
}


    class PeopleRepository{
        // Создаем массив
        ArrayList<People> db = new ArrayList<>();
        public ArrayList<People> getDb() {
          return db;// ???!!!!
        }

        void create(People current) {
          db.add(current);
        }

      }


      class Repo {
        PeopleRepository pr;

        public Repo(PeopleRepository pr) {
          this.pr = pr;
        }
        StringBuilder readCommonList() {
          StringBuilder sb = new StringBuilder();

          for (People item : pr.getDb()) {
            sb.append(String.format("---------------- \n Имя: %s, Возраст: %s, ДР: %s, \n Отец: %s, \n Мать: %s, \n Дедуля: %s, \n Бабуля: %s \n", item.fullName, item.age, item.birthDay, item.father, item.mother, item.grandFathher, item.grandMother));
          }

          return sb;
        }
      }












