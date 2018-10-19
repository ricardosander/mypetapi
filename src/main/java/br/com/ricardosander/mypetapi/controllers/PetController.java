package br.com.ricardosander.mypetapi.controllers;

import br.com.ricardosander.mypetapi.entities.Pet;
import br.com.ricardosander.mypetapi.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

  private PetService service;

  @Autowired
  public PetController(PetService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Pet>> findAll() {
    List<Pet> pets = service.findAll();
    return ResponseEntity.ok(pets);
  }

}