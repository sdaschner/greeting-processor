package com.sebastian_daschner.greeting_processor;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("greetings")
public class GreetingsResource {

    @Inject
    Greetings greetings;

    @POST
    public JsonObject createGreeting(JsonObject greeting) {
        String name = greeting.getString("name", null);
        if (name == null)
            throw new BadRequestException();

        return Json.createObjectBuilder()
                .add("greeting", greetings.createGreeting(name))
                .build();
    }

}
