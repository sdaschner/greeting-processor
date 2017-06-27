package com.sebastian_daschner.greeting_processor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("health-check")
public class HealthResource {

    @GET
    public String status() {
        return "OK";
    }

}
