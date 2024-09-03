package com.colak.springtutorial.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ParserServiceTest {

    @Autowired
    private ParserService parserService;

    @Test
    void getXmlParser() {
        String result = parserService.getAll(ContentType.XML);
        assertThat(result).isEqualTo("XMLParser");
    }

    @Test
    void getJsonParser() {
        String result = parserService.getAll(ContentType.JSON);
        assertThat(result).isEqualTo("JSONParser");
    }
}