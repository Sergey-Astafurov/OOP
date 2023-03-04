package oop_homme.houme_2;

import java.util.ArrayList;
import java.util.List;


public class TaskRepository  {

    ArrayList<Task> repo = new ArrayList<>();

    public void setTask(Task el){
        this.repo.add(el);
    }

    public String getRepo(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repo.size(); i++){
            sb.append(repo.get(i));



        }
        return sb.toString();
    }

    public Integer getSize(){
        return repo.size();
    }
    public Task getTask(int value){
        return repo.get(value);
    }





}
