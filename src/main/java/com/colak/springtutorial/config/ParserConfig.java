package com.colak.springtutorial.config;

import com.colak.springtutorial.parser.ParserFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParserConfig {

    @Bean("parserFactory")
    public FactoryBean<Object> serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        // Set up the service locator interface.
        factoryBean.setServiceLocatorInterface(ParserFactory.class);
        return factoryBean;
    }
}
