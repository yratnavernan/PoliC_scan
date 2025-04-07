package com.poliCscan.mnc.PoliCscan.utils;

import java.util.HashSet;
import java.util.Set;

public class KeywordStore {
    private static final Set<String> threatWords = new HashSet<>();

    static {
        // Default threat words
        threatWords.add("penalty");
        threatWords.add("terminate");
        threatWords.add("risk");
        threatWords.add("liability");
    }

    public static Set<String> getThreatWords() {
        return threatWords;
    }

    public static void addKeyword(String word) {
        threatWords.add(word.toLowerCase());
    }

    public static void removeKeyword(String word) {
        threatWords.remove(word.toLowerCase());
    }
}

