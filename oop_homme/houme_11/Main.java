package oop_homme.houme_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        PeopleRepository pr = new PeopleRepository();
        /**Создаем члена семьи
         * p1 Сын
         */

        People p1 = CreatePeople.getInsctance()
                    .setFirstName("Сергей")
                    .setDay("1999-01-06")
                    .setLastName("Сергеевич")
                    .setSurName("Астафуров")
                    .Create();
        // System.out.println(p1);
        System.out.println("-------------------------");
        /**
         * Мать
         */
        People p2 = CreatePeople.getInsctance()
                    .setFirstName("Наталья")
                    .setSurName("Астафурова")
                    .setLastName("Владимировна")
                    .setDay("1978-04-19")
                    .Create();
        // System.out.println(p2);
        System.out.println("-------------------------");

        System.out.println(p1);
        /**
         * Отец
         */
        People p3 = CreatePeople.getInsctance()
                    .setFirstName("Сергей")
                    .setSurName("Астафуров")
                    .setLastName("Петрович")
                    .setDay("1974-06-09")
                    .Create();
        // System.out.println(p2);

        /**
         * Создаем между ними связи
         */
        Kinship k1 = new Kinship();
        Kinship k2 = new Kinship();
        Kinship k3 = new Kinship();

        /**
         * Сын по отношению к матери и отцу
         */
        k1.setKinship(p1, Relationship.SON, p2);
        k1.setKinship(p1, Relationship.SON, p3);

        k2.setKinship(p2, Relationship.MOTHER, p1);
        k2.setKinship(p2, Relationship.WIFE, p3);

        k3.setKinship(p3, Relationship.FATHER, p1);
        k3.setKinship(p3, Relationship.HUSBAND, p2);

        System.out.println(k1);



    }
}
