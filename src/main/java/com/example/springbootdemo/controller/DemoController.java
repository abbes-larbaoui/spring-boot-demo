package com.example.springbootdemo.controller;

import com.example.springbootdemo.common.GenericController;
import com.example.springbootdemo.model.DemoModel;
import com.example.springbootdemo.repository.DemoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demos")
public class DemoController extends GenericController<DemoModel> {

    public DemoController(DemoRepository demoRepository) {
        super(demoRepository);
    }
}
