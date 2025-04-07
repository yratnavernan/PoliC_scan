package com.poliCscan.mnc.PoliCscan.service;


import com.poliCscan.mnc.PoliCscan.utils.KeywordStore;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public String addKeyword(String keyword) {
        KeywordStore.addKeyword(keyword);
        return "Keyword '" + keyword + "' added successfully!";
    }

    public String removeKeyword(String keyword) {
        KeywordStore.removeKeyword(keyword);
        return "Keyword '" + keyword + "' removed successfully!";
    }

    public String listKeywords() {
        return "Current keywords: " + KeywordStore.getThreatWords();
    }
}
