package com.poliCscan.mnc.PoliCscan.analyser;

public class DeepAnalyse {

    public int deepScanScore(String text) {
        // Simple analysis logic for now (you can add NLP later!)
        int lengthScore = text.length() > 500 ? 5 : 2;
        int complexityScore = text.contains("whereas") ? 3 : 1;
        return lengthScore + complexityScore;
    }
}

