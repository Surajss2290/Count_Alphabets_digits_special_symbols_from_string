package com.example.count.service;
import org.springframework.stereotype.Service;

import com.example.count.eneity.StringAnalysisResult;

@Service
public class StringAnalyzer {

    public static StringAnalysisResult analyze(String inputString) {
        int alphabetCount = 0;
        int digitCount = 0;
        int specialSymbolCount = 0;

        // Iterate through each character in the string
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                specialSymbolCount++;
            }
        }

        // Create and return the result
        return new StringAnalysisResult(alphabetCount, digitCount, specialSymbolCount);
    }
}
