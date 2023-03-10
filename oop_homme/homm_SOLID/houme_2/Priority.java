package oop_homme.homm_SOLID.houme_2;

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
