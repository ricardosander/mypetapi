package br.com.ricardosander.mypetapi.repositories;

import br.com.ricardosander.mypetapi.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer> {

  @Query("select s from Session s where s.token =:token")
  Session findByToken(@Param("token") String token);

}
