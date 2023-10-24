package br.com.pedropaulo.todolist.food;

import java.util.UUID;

public record FoodResponseDTO(UUID id, String title, String image, Integer price) {
  
  public FoodResponseDTO(FoodModel food) {
    this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
  }
}