package oop_lectia.lectia_4;

public class Main {
    public static void main(String[] args) {
        var model = new SumModel();
        var view = new View();

        Presenter pr = new Presenter(model, view);
        pr.buttonClick();
    }
}
