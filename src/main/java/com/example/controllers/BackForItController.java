package com.example.Controllers;

import io.micronaut.http.annotation.*;

@Controller("/backForIt")
public class BackForItController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}