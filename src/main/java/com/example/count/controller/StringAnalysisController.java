package com.example.count.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.count.eneity.StringAnalysisResult;
import com.example.count.service.StringAnalyzer;

@RestController
public class StringAnalysisController {

    @GetMapping("/analyze")
    public StringAnalysisResult analyzeString(@RequestParam String inputString) {
        return StringAnalyzer.analyze(inputString);
    }
}