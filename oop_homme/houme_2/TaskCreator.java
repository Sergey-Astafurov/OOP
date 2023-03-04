package oop_homme.houme_2;

import java.time.LocalDate;
import java.time.LocalTime;

public class TaskCreator {
    static Integer counter = 1;
    private static TaskCreator instance;
    Task task;

    public static TaskCreator getInstance() {
        if (instance == null)
            instance = new TaskCreator();
            instance.init();
        return instance;
    }

    public void init() {
        task = new Task();
        task.id = counter++;
        task.priority = Priority.LOW;
        task.taskDate = LocalDate.parse("1999-06-01");
        task.taskTime = LocalTime.now();
        task.taskBody = "";
        task.name = "";

    }

    public TaskCreator setPriority(Priority priority) {
        task.priority = priority;
        return this;
    }

    public TaskCreator setDate(String date) {
        task.taskDate = LocalDate.parse(date);
        return this;
    }

    public TaskCreator setTime(String time) {
        task.taskTime = LocalTime.parse(time);
        return this;
    }

    public TaskCreator setText(String text){
        task.taskBody = text;
        return this;
    }

    public TaskCreator setName(String name){
        task.name = name;
        return this;
    }
    public Task create(){
        return task;
    }
    public Integer getCount(){
        return counter;
    }
}
