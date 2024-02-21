package com.example.cs2skin.controller;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.service.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skins")
public class SkinController {
@Autowired
    SkinService skinService;
    @GetMapping()
    List<Skin> getAllSkins(){
        return skinService.getAllSkins();
    }
    @GetMapping("/{id}")
    Skin getSkinById(@PathVariable int id) {
        return skinService.getSkinById(id);
    }
    @PostMapping()
    void createSkin(@RequestBody Skin skin) {
        skinService.addSkin(skin);
    }
    @PutMapping()
    void updateSkinById(@RequestBody Skin updSkin) {
        skinService.addSkin(updSkin);
    }
    @DeleteMapping("/{id}")
    void deleteSkinById(@PathVariable int id) {
        skinService.delete(id);
    }

}
