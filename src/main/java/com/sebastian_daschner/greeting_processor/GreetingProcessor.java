package com.sebastian_daschner.greeting_processor;

import javax.inject.Inject;

public class GreetingProcessor {

    @Inject
    @Config("GREETING")
    private String greeting;

    public String calculateGreeting(String name) {
        return greeting + ", " + name;
    }

}
