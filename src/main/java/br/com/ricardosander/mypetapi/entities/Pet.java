package br.com.ricardosander.mypetapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Pet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "nome", length = 50)
  private String name;

  @Column(name = "especie", length = 50)
  private String species;

  @Column(name = "raca", length = 50)
  private String breed;

  @Column(name = "pelo", length = 50)
  private String fur;

  @Column(name = "pelagem", length = 50)
  private String coat;

  @Column(name = "porte", length = 50)
  private String size;

  @Column(name = "peso", length = 50)
  private Double weigh;

  @Column(name = "nascimento", length = 50)
  private Date birth;

  @Column(name = "cadastro", length = 50)
  private Date register;

  @Column(name = "castrado", length = 50)
  private boolean castrated;

  @Column(name = "observacoes", columnDefinition = "TEXT")
  private String comments;

  @Column(name = "sexo", length = 50)
  private String gender;

  @Column(name = "usuario", length = 50)
  private Integer user;

  @Column(name = "cliente_pacote", length = 50)
  private boolean bundle;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "cliente")
  private Owner owner;

  public Pet() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getFur() {
    return fur;
  }

  public void setFur(String fur) {
    this.fur = fur;
  }

  public String getCoat() {
    return coat;
  }

  public void setCoat(String coat) {
    this.coat = coat;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Double getWeigh() {
    return weigh;
  }

  public void setWeigh(Double weigh) {
    this.weigh = weigh;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public Date getRegister() {
    return register;
  }

  public void setRegister(Date register) {
    this.register = register;
  }

  public boolean isCastrated() {
    return castrated;
  }

  public void setCastrated(boolean castrated) {
    this.castrated = castrated;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public boolean isBundle() {
    return bundle;
  }

  public void setBundle(boolean bundle) {
    this.bundle = bundle;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

}
