package com.sebastian_daschner.greeting_processor;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("greetings")
public class GreetingsResource {

    @Inject
    GreetingProcessor greetingProcessor;

    @POST
    public JsonObject calculateGreeting(JsonObject jsonObject) {
        String name = extractName(jsonObject);
        String greeting = greetingProcessor.calculateGreeting(name);

        return Json.createObjectBuilder()
                .add("greeting", greeting)
                .build();
    }

    private String extractName(JsonObject jsonObject) {
        return jsonObject.getString("name", null);
    }

}
