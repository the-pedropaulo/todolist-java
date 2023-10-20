package br.com.pedropaulo.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "users")
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID uuid;

  /*
   * @Column(name = "usuario") Caso queira mudar o nome da coluna
   */
  @Column(unique = true)
  private String username;
  private String email;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
