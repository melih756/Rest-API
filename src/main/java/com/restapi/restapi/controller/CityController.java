package com.restapi.restapi.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @GetMapping()
    public ResponseEntity<List<City>>getCıty(){
        List<City>cities=Arrays.

        return new ResponseEntity<>()
    }
}
