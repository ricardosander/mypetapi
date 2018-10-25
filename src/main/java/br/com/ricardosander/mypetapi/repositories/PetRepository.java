package br.com.ricardosander.mypetapi.repositories;

import br.com.ricardosander.mypetapi.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface PetRepository extends JpaRepository<Pet, CriteriaBuilder.In> {

  @Query("select p from Pet p where p.user = :userId")
  List<Pet> findAll(@Param("userId") Integer userId);

}
