package br.com.ricardosander.mypetapi.controllers;

import br.com.ricardosander.mypetapi.pagination.Page;
import br.com.ricardosander.mypetapi.dto.PetListDTO;
import br.com.ricardosander.mypetapi.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/pets")
public class PetController {

  private PetService service;

  @Autowired
  public PetController(PetService service) {
    this.service = service;
  }

  @CrossOrigin
  @GetMapping
  public ResponseEntity<Page<PetListDTO>> findAll(@RequestParam(required = false) Integer page,
      HttpServletRequest request) {

    Integer actualPage = page == null || page < 1 ? 0 : page - 1;
    Integer userId = Integer.valueOf(request.getSession().getAttribute("userId").toString());

    Page<PetListDTO> pets = service.findAll(userId, actualPage);
    return ResponseEntity.ok(pets);
  }

  @CrossOrigin
  @RequestMapping(method = RequestMethod.OPTIONS)
  public void options() {

  }

}
