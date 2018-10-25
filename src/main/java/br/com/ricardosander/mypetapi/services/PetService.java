package br.com.ricardosander.mypetapi.services;

import br.com.ricardosander.mypetapi.entities.Pet;
import br.com.ricardosander.mypetapi.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

  private PetRepository repository;

  @Autowired
  public PetService(PetRepository repository) {
    this.repository = repository;
  }

  public List<Pet> findAll(Integer userId) {
    return repository.findAll(userId);
  }

}
