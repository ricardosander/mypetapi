package br.com.ricardosander.mypetapi.controllers;

import br.com.ricardosander.mypetapi.entities.User;
import br.com.ricardosander.mypetapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  private UserService userRepository;

  @Autowired
  public UserController(UserService userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> users = userRepository.findAll();
    return ResponseEntity.ok(users);
  }

}
