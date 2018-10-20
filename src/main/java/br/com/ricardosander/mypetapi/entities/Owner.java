package br.com.ricardosander.mypetapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cliente")
public class Owner {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "nome", length = 150)
  private String name;

  @Column(name = "nome_secundario", length = 150)
  private String secundaryName;

  @Column(name = "endereco", length = 200)
  private String address;

  @Column(name = "bairro", length = 50)
  private String neighborhood;

  @Column(name = "telefone", length = 11)
  private String phone;

  @Column(name = "telefone2", length = 11)
  private String phone2;

  @Column(name = "telefone3", length = 11)
  private String phone3;

  @Column(name = "telefone4", length = 11)
  private String phone4;

  @Column(name = "telefone5", length = 11)
  private String phone5;

  @Column(name = "observacao", columnDefinition = "TEXT")
  private String comments;

  @Column(name = "saldo_devedor")
  private Double debt;

  @Column(name = "usuario")
  private Integer user;

  public Owner() {

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

  public String getSecundaryName() {
    return secundaryName;
  }

  public void setSecundaryName(String secundaryName) {
    this.secundaryName = secundaryName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public String getPhone3() {
    return phone3;
  }

  public void setPhone3(String phone3) {
    this.phone3 = phone3;
  }

  public String getPhone4() {
    return phone4;
  }

  public void setPhone4(String phone4) {
    this.phone4 = phone4;
  }

  public String getPhone5() {
    return phone5;
  }

  public void setPhone5(String phone5) {
    this.phone5 = phone5;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public Double getDebt() {
    return debt;
  }

  public void setDebt(Double debt) {
    this.debt = debt;
  }

  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

}
