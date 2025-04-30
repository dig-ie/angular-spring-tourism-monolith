package com.diego.resourttour.infrastructure.repositories;

import com.diego.resourttour.domain.models.Attraction;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AttractionRepository extends JpaRepository<Attraction, Long> {
}