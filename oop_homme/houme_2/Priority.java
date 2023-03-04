package oop_homme.houme_2;

public enum Priority {
    LOW ("Низкий"),
    MEDIUM ("Средний"),
    URGENT ("Срочный");


    String translate;

    Priority(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return this.translate;
    }
}
