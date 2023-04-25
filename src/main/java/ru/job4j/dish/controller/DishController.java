package ru.job4j.dish.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.service.DishService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/dishes")
public class DishController {
    private final DishService dishService;

    @PostMapping("/create")
    public ResponseEntity<Dish> create(@RequestBody Dish dish) {
        return new ResponseEntity<>(dishService.save(dish), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Dish> delete(@PathVariable int id) {
        dishService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        return new ResponseEntity<>(dishService.findById(id), HttpStatus.FOUND);
    }

    @GetMapping()
    public ResponseEntity<List<Dish>> findDishes(Model model) {
        model.addAttribute("dishes", dishService.findByAll());
        return new ResponseEntity<>(dishService.findByAll(), HttpStatus.OK);
    }
}