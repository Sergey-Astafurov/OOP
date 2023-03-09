package oop_lectia.lectia_4;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public void buttonClick(){
        int a =view.getValue("a : ");
        int b = view.getValue("b : ");
        model.setX(a);
        model.setY(b);

        int result = model.result();
        view.print(result, "result: ");
    }
}
