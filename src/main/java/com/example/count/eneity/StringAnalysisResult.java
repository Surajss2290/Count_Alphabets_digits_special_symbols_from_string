package com.example.count.eneity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StringAnalysisResult {
    private int alphabetCount;
    private int digitCount;
    private int specialSymbolCount;


}