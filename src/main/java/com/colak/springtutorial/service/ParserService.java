package com.colak.springtutorial.service;

import com.colak.springtutorial.parser.Parser;
import com.colak.springtutorial.parser.ParserFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParserService {

    private final ParserFactory parserFactory;

    public String getAll(ContentType contentType) {
        // ...
        // The key logic is to directly obtain the corresponding item according to the type.
        Parser parser = parserFactory.getParser(contentType);
        return parser.parse();
    }
}
