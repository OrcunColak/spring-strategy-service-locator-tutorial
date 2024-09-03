package com.colak.springtutorial.service;

public enum ContentType {
    JSON(TypeConstants.JSON_PARSER),
    XML(TypeConstants.XML_PARSER),
    ;
    private final String parserName;

    ContentType(String parserName) {
        this.parserName = parserName;
    }

    @Override
    public String toString() {
        return this.parserName;
    }

    public interface TypeConstants {
        String JSON_PARSER = "jsonParser";
        String XML_PARSER = "xmlParser";
    }
}
