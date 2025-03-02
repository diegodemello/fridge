package br.com.fridge.Fridge.controller;

import br.com.fridge.Fridge.model.Food;
import br.com.fridge.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll(){
        return foodService.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food){
        return foodService.save(food);
    }

}
