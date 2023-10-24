package br.com.pedropaulo.todolist.food;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepository extends JpaRepository<FoodModel, UUID>{
  
}
