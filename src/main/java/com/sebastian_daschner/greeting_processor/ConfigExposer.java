package com.sebastian_daschner.greeting_processor;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class ConfigExposer {

    @Produces
    @Config("unused")
    public String exposeConfigProperty(InjectionPoint injectionPoint) {
        Config config = injectionPoint.getAnnotated().getAnnotation(Config.class);
        return System.getenv(config.value());
    }

}
