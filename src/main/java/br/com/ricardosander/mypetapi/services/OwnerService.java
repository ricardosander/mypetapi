package br.com.ricardosander.mypetapi.services;

import br.com.ricardosander.mypetapi.entities.Owner;
import br.com.ricardosander.mypetapi.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

  private static final int SEARCH_SIZE = 10;

  private OwnerRepository repository;

  @Autowired
  public OwnerService(OwnerRepository repository) {
    this.repository = repository;
  }

  public List<Owner> findAll(Integer userId, Integer page) {

    Pageable pageable = PageRequest.of(page, SEARCH_SIZE);

    return repository.findAll(userId, pageable);
  }

}
