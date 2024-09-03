package com.colak.springtutorial.parser.impl;

import com.colak.springtutorial.service.ContentType;
import com.colak.springtutorial.parser.Parser;
import org.springframework.stereotype.Component;

@Component(ContentType.TypeConstants.XML_PARSER)
public class XMLParser implements Parser {

    @Override
    public String parse() {
        return "XMLParser";
    }
}
