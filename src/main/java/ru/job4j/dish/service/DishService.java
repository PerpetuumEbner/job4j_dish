package ru.job4j.dish.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.dish.model.Dish;
import ru.job4j.dish.persistence.DishPersist;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DishService {
    private final DishPersist dishPersist;

    public Dish save(Dish dish) {
        return dishPersist.save(dish);
    }

    public void delete(int id) {
        dishPersist.deleteById(id);
    }

    public Dish update(Dish dish) {
        return dishPersist.save(dish);
    }

    public Optional<Dish> findById(int id) {
        return dishPersist.findById(id);
    }

    public List<Dish> findByAll() {
        return (List<Dish>) dishPersist.findAll();
    }
}