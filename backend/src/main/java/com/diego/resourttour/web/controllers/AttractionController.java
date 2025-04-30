package com.diego.resourttour.web.controllers;

import com.diego.resourttour.application.services.FetchAttractions;
import com.diego.resourttour.domain.models.Attraction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AttractionController {

    @GetMapping("/attractions")
    public List<Attraction> getAllAttractions() {
        return List.of(
                new Attraction("Praia de Boa Viagem", "Recife - PE", "Praia urbana famosa com recifes e quiosques.", "https://example.com/img1.jpg"),
                new Attraction("Pajuçara", "Maceió - AL", "Orla com piscinas naturais e jangadas.", "https://example.com/img2.jpg"),
                new Attraction("Porto de Galinhas", "Ipojuca - PE", "Praia com águas claras e corais.", "https://example.com/img3.jpg")
        );
    }
}
