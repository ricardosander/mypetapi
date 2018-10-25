package br.com.ricardosander.mypetapi.repositories;

import br.com.ricardosander.mypetapi.entities.Owner;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

  @Query(value = "select o from Owner o where o.user = :userId ORDER BY o.id")
  List<Owner> findAll(@Param("userId") Integer userId, Pageable pageable);

}
