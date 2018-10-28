package br.com.ricardosander.mypetapi.repositories;

import br.com.ricardosander.mypetapi.entities.Pet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface PetRepository extends JpaRepository<Pet, CriteriaBuilder.In> {

  @Query(value = "select p from Pet p where p.user = :userId order by p.id",
      countQuery = "select count(1) from Pet p where p.user = :userId order by p.id")
  Page<Pet> findAll(@Param("userId") Integer userId, Pageable pageable);

}
