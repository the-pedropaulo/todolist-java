package br.com.pedropaulo.todolist.food;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "foods")
public class FoodModel {
  
  @Id @GeneratedValue(generator = "UUID")
  private UUID id;

  private String title;
  private String image;
  private Integer price;

  public FoodModel(FoodRequestDTO data)  {
    this.image = data.image();
    this.title = data.title();
    this.price = data.price();
  }
}
