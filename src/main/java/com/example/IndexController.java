package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class IndexController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String showIndexPage() {
        return "Hello from the demo app!";
    }
}
