package oop_homme.homm_SOLID.houme_2;

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
                ExportCsv ex = new ExportCsv();
                ex.export(tr);
                AddTask add1 = new AddTask();
                // add1.addNewTask();
                tr.setTask(add1);
                ex.export(tr);

                // im.readCSVFile(); Чтение

        }
}
