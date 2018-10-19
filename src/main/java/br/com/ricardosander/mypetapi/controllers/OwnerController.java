package br.com.ricardosander.mypetapi.controllers;

import br.com.ricardosander.mypetapi.entities.Owner;
import br.com.ricardosander.mypetapi.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

  private OwnerService service;

  @Autowired
  public OwnerController(OwnerService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Owner>> findAll() {
    List<Owner> owners = service.findAll();
    return ResponseEntity.ok(owners);
  }

}