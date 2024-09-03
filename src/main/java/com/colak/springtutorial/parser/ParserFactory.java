package com.colak.springtutorial.parser;

import com.colak.springtutorial.service.ContentType;

public interface ParserFactory {

    Parser getParser(ContentType contentType);
}
