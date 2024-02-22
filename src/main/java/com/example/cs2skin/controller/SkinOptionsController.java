package com.example.cs2skin.controller;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.model.SkinOptions;
import com.example.cs2skin.service.SkinOptionsService;
import com.example.cs2skin.service.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skinsOptions")
public class SkinOptionsController {
    @Autowired
    SkinOptionsService skinOptionsService;
    @GetMapping()
    List<SkinOptions> getAllSkins(){
        return skinOptionsService.getAllSkins();
    }

}
