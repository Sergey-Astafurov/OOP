package oop_homme.houme_11;

public enum Relationship {
    SON ("Сын"),
    DAUGHTER ("Дочь"),
    FATHER ("Отец"),
    MOTHER ("Мать"),
    SISTER ("Сестра"),
    BROTHER ("Брат"),
    WIFE("Жена"),
    HUSBAND("Муж");


    String translate;

    Relationship(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return this.translate;
    }
}
