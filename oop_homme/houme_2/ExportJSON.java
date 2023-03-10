package oop_homme.houme_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportJSON implements exportInterface {
    private FileWriter fw;
    private ArrayList<Task> repo = new ArrayList<>();

    @Override
    public void export(TaskRepository repo) {
        try (PrintWriter writer = new PrintWriter(new File("oop_homme/houme_2/exp.json"))) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < repo.getSize(); i++) {
                sb.append(repo.getTask(i));
                sb.append("\n");

            }

            writer.write(sb.toString());
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
