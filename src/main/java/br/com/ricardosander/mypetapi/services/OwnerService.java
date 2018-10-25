package br.com.ricardosander.mypetapi.services;

import br.com.ricardosander.mypetapi.entities.Owner;
import br.com.ricardosander.mypetapi.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

  private OwnerRepository repository;

  @Autowired
  public OwnerService(OwnerRepository repository) {
    this.repository = repository;
  }

  public List<Owner> findAll(Integer userId) {
    return repository.findAll(userId);
  }

}
