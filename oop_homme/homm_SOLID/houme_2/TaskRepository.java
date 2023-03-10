/**
 * Принцип единственной ответсвенности не нарушен.
 * Этот класс отвечает за себя.Показывает только свои значения и массив который
 * у него внутри только то за что он отвечает
 *
 */
package oop_homme.homm_SOLID.houme_2;

import java.util.ArrayList;

public class TaskRepository {

    private ArrayList<Task> repo = new ArrayList<>();

    public void setTask(Task el) {
        this.repo.add(el);
    }

    public String getRepo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repo.size(); i++) {
            sb.append(repo.get(i));

        }
        return sb.toString();
    }

    public Integer getSize() {
        return repo.size();
    }

    public Task getTask(int value) {
        return repo.get(value);
    }

}
