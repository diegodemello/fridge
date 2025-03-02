package br.com.fridge.Fridge.repository;

import br.com.fridge.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}