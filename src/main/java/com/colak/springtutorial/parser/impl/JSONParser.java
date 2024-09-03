package com.colak.springtutorial.parser.impl;

import com.colak.springtutorial.service.ContentType;
import com.colak.springtutorial.parser.Parser;
import org.springframework.stereotype.Component;

@Component(ContentType.TypeConstants.JSON_PARSER)
public class JSONParser implements Parser {

    @Override
    public String parse() {
        return "JSONParser";
    }
}
