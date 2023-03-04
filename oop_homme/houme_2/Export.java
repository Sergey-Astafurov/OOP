package oop_homme.houme_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat.Encoding;

import oop_homme.houme_11.People;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

 class Export  extends TaskRepository {
    FileWriter fw;
    ArrayList<Task> repo = new ArrayList<>();

    public void export(TaskRepository repo)  {
        try (PrintWriter writer = new PrintWriter(new File("oop_homme/houme_2/exp.csv"))) {

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




