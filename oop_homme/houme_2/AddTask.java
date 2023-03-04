package oop_homme.houme_2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import oop_homme.houme_2.TaskCreator;
public class AddTask extends Task {
    public Scanner input = new Scanner(System.in);

    public void addNewTask() {

        System.out.println("Введите Имя");
        String name = input.next();
        System.out.println("Введите текст записи");
        String text = input.next();
        System.out.println("Введите сегодняшнюю дату пример: (2010-10-01)");
        String date = input.next();
        String time = LocalTime.now().toString();
        Task task = new Task();
        this.name = name;
        this.id = TaskCreator.counter;
        this.priority = Priority.LOW;
        this.taskBody = text;
        this.taskDate = LocalDate.parse(date);
        this.taskTime = LocalTime.parse(time);



    }

}
