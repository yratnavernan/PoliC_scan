package com.poliCscan.mnc.PoliCscan.controller;


import com.poliCscan.mnc.PoliCscan.model.AdminRequest;
import com.poliCscan.mnc.PoliCscan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addKeyword")
    public String addKeyword(@RequestBody AdminRequest request) {
        return adminService.addKeyword(request.getKeyword());
    }

    @PostMapping("/removeKeyword")
    public String removeKeyword(@RequestBody AdminRequest request) {
        return adminService.removeKeyword(request.getKeyword());
    }

    @GetMapping("/listKeywords")
    public String listKeywords() {
        return adminService.listKeywords();
    }
}
