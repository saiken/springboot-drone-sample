package com.example.sample.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApiController {
    @GetMapping("/api/sample")
    public String getSample(){
        return "success";
    }
}
