package oop_homme.homm_SOLID.houme_2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    protected String taskBody;
    protected LocalDate taskDate;
    protected Integer id;
    protected LocalTime taskTime;
    protected Priority priority;
    protected String name;

    @Override
    public String toString() {
        return String.format("Запись номер %d;\nДата: %s;\nВремя %s;\nТекст: %s;\nПриоритет: %s;\nИмя: %s", id,
                taskDate, taskTime, taskBody, priority, name);
    }

    public Integer getID() {
        return id;
    }

}
