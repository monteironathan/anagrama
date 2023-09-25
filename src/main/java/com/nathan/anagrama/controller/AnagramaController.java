package com.nathan.anagrama.controller;

import com.nathan.anagrama.payload.request.AnagramaRequest;
import com.nathan.anagrama.payload.response.AnagramaResponse;
import com.nathan.anagrama.service.AnagramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anagrama")
public class AnagramaController {

    @Autowired
    private AnagramaService service;

    @GetMapping
    public AnagramaResponse isAnagrama(@RequestBody AnagramaRequest request){
        return service.isAnagrama(request);
    }
}
