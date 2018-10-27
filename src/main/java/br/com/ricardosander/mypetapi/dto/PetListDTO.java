package br.com.ricardosander.mypetapi.dto;

import br.com.ricardosander.mypetapi.entities.Pet;

public class PetListDTO {

  private final Integer id;

  private final String name;

  private final String owner;

  private final String species;

  private final String breed;

  public PetListDTO(Pet pet) {
    this.id = pet.getId();
    this.name = pet.getName();
    this.owner = pet.getOwner().getName();
    this.species = pet.getSpecies();
    this.breed = pet.getBreed();
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getOwner() {
    return owner;
  }

  public String getSpecies() {
    return species;
  }

  public String getBreed() {
    return breed;
  }

}
