package br.com.ricardosander.mypetapi.services;

import br.com.ricardosander.mypetapi.pagination.Page;
import br.com.ricardosander.mypetapi.dto.PetListDTO;
import br.com.ricardosander.mypetapi.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PetService {

  private static final int SEARCH_SIZE = 10;

  private PetRepository repository;

  @Autowired
  public PetService(PetRepository repository) {
    this.repository = repository;
  }

  public Page<PetListDTO> findAll(Integer userId, Integer page) {

    Pageable pageable = PageRequest.of(page, SEARCH_SIZE);

    return new Page<>(repository.findAll(userId, pageable).map(PetListDTO::new));
  }

}
