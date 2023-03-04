package oop_homme.houme_2;

import java.time.LocalDate;
import java.time.LocalTime;
import oop_homme.houme_2.AddTask;
public class Task {
    Integer id;
    String taskBody;
    LocalDate taskDate;
    LocalTime taskTime;
    Priority priority;
    String name;


    @Override
     public String toString() {
         return String.format("Запись номер %d;\nДата: %s;\nВремя %s;\nТекст: %s;\nПриоритет: %s;\nИмя: %s", id, taskDate, taskTime, taskBody, priority, name);
     }

    public Integer getID(){
        return id;
    }






}
