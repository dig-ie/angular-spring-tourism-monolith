package com.diego.resourttour.infrastructure.repositories;
import com.diego.resourttour.domain.models.City;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
	List<City> findByState(String state);
}
