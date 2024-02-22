package com.example.cs2skin.service;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.model.SkinOptions;
import com.example.cs2skin.repository.SkinOptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SkinOptionsService {
    @Autowired
    SkinOptionsRepository skinOptionsRepository;
    public List<SkinOptions> getAllSkins(){
        List<SkinOptions> skinOptions = new ArrayList<>();
        skinOptionsRepository.findAll().forEach(skin -> skinOptions.add(skin));
        return skinOptions;
    }
}
