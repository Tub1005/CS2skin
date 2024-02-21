package com.example.cs2skin.controller;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.service.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/skins")
public class SkinController {
@Autowired
    SkinService skinService;
    @GetMapping()
    List<Skin> getAllSkins(){

    }

}
