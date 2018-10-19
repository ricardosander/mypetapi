package br.com.ricardosander.mypetapi.repositories;

import br.com.ricardosander.mypetapi.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface PetRepository extends JpaRepository<Pet, CriteriaBuilder.In> {

}
