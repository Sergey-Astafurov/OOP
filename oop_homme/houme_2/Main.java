package oop_homme.houme_2;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                Task t1 = TaskCreator.getInstance()
                                .setName("Sergey")
                                .setDate("2023-03-03")
                                .setTime("06:00")
                                .setText("Написать код")
                                .setPriority(Priority.LOW)
                                .create();
                Task t2 = TaskCreator.getInstance()
                                .setDate("2023-03-03")
                                .setTime("06:00")
                                .setText("Сделать домашку!")
                                .setPriority(Priority.URGENT)
                                .create();
                Task t3 = TaskCreator.getInstance()
                                .setDate("2023-03-03")
                                .setName("Sergey")
                                .setText("Посмотреть сериал")
                                .setPriority(Priority.MEDIUM)
                                .setTime("10:15")
                                .create();
                TaskRepository tr = new TaskRepository();
                tr.setTask(t1);
                tr.setTask(t2);
                tr.setTask(t3);
                Export ex = new Export();
                ex.export(tr);
                Import im = new Import();
                AddTask add1 = new AddTask();
                add1.addNewTask();
                System.out.println(add1.name);
                System.out.println(add1.priority);
                System.out.println(add1.taskDate);
                System.out.println(add1.taskTime);

                tr.setTask(add1);
                ex.export(tr);

                // im.readCSVFile(); Чтение


        }
}
