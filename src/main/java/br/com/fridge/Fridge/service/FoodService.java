package br.com.fridge.Fridge.service;

import br.com.fridge.Fridge.model.Food;
import br.com.fridge.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    public final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    public Food save(Food food){
        return foodRepository.save(food);
    }
}
