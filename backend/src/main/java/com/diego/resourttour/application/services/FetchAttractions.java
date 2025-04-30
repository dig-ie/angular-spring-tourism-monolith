package com.diego.resourttour.application.services;

import com.diego.resourttour.domain.models.Attraction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FetchAttractions {

    private final List<Attraction> allAttractions = List.of(
        new Attraction("Marco Zero", "Recife, PE", "Praça histórica no centro do Recife.", "https://example.com/marco-zero.jpg"),
        new Attraction("Instituto Ricardo Brennand", "Recife, PE", "Museu com acervo de arte e armas medievais.", "https://example.com/brennand.jpg"),
        new Attraction("Praia de Boa Viagem", "Recife, PE", "Praia urbana famosa com águas claras e coqueiros.", "https://example.com/boa-viagem.jpg"),

        new Attraction("Praia de Ponta Verde", "Maceió, AL", "Praia com águas calmas e piscinas naturais.", "https://example.com/ponta-verde.jpg"),
        new Attraction("Piscinas Naturais de Pajuçara", "Maceió, AL", "Passeio de jangada até piscinas no mar.", "https://example.com/pajucara.jpg"),

        new Attraction("Praia de Porto de Galinhas", "Ipojuca, PE", "Praia paradisíaca com piscinas naturais.", "https://example.com/porto.jpg"),
        new Attraction("Projeto Hippocampus", "Ipojuca, PE", "Centro de preservação de cavalos-marinhos.", "https://example.com/hippocampus.jpg")
    );

    public List<Attraction> getAttractionsByLocation(String location) {
        return allAttractions.stream()
                .filter(attraction -> attraction.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }
}
