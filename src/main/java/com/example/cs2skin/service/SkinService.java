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
    public Skin getSkinById(int id){
        return skinRepository.findById(id).get();
    }
    public void addSkin(Skin skin){
        skinRepository.save(skin);
    }
    public void delete(int id){
        skinRepository.deleteById(id);
    }

}
