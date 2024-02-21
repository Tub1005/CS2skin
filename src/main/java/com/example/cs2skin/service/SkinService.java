package com.example.cs2skin.service;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.repository.SkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkinService {
    @Autowired
    SkinRepository skinRepository;
    public List<Skin> getAllSkins(){
        List<Skin> skins = new ArrayList<>();
        skinRepository.findAll().forEach(skin -> skins.add(skin));
        return skins;
    }

}
