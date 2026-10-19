package codebank.entity_enums;

public enum Language {


    HTML("HTML"),
    CSS("CSS"),
    CPP("C++"),
    SQL("SQL"),
    JAVA("Java");

    private final String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
