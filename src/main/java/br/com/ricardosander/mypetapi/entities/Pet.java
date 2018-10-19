package br.com.ricardosander.mypetapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "animal")
public class Pet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  public Pet() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
