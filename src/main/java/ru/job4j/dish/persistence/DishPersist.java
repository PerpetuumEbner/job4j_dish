package ru.job4j.dish.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.dish.model.Dish;

@Repository
public interface DishPersist extends CrudRepository<Dish, Integer> {
}