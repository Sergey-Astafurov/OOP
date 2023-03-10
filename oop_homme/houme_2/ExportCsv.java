package oop_homme.houme_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.io.FileWriter;

class ExportCsv extends TaskRepository implements exportInterface {
    private FileWriter fw;
    private ArrayList<Task> repo = new ArrayList<>();

    /**
     *Тут я вижу принцип открытости закрытости. Я создал интерфейс Экспорт
     потому что может понадобится экспортировать под разные файлы не только csv. Поэтому чтобы не модифицировать класс (что нарушает принцип единственной ответсвенности.) Я создал данный интерфейс
     * @param repo
     */
    @Override
    public void export(TaskRepository repo) {
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
