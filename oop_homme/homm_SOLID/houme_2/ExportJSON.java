package oop_homme.homm_SOLID.houme_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExportJSON implements exportInterface {


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
