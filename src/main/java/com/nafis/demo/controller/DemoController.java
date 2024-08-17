package com.nafis.demo.controller;

import com.nafis.demo.DemoException;
import com.nafis.demo.entity.Definition;
import com.nafis.demo.model.DemoRequest;
import com.nafis.demo.model.DemoResponse;
import com.nafis.demo.model.dictionary.DictionaryEntry;
import com.nafis.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping( value = "/definition/{word}")
    public DictionaryEntry[] getDefinition(@PathVariable String word) {
        return demoService.getDefinition(word);
    }

    @GetMapping( value = "/definition/new/{word}")
    public Definition getNewDefinition(@PathVariable String word) throws DemoException {
        return demoService.getNewDefinition(word);
    }

    @PostMapping( value = "/definition")
    public DemoResponse createDefinition(@RequestBody DemoRequest demoRequest) {
        return demoService.createDefinition(demoRequest);
    }





}
