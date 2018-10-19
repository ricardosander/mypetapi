package br.com.ricardosander.mypetapi.repositories;

import br.com.ricardosander.mypetapi.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
