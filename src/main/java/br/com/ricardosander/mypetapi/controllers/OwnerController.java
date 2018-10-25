package br.com.ricardosander.mypetapi.controllers;

import br.com.ricardosander.mypetapi.entities.Owner;
import br.com.ricardosander.mypetapi.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/owners")
public class OwnerController {

  private OwnerService service;

  @Autowired
  public OwnerController(OwnerService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<Owner>> findAll(@RequestParam(required = false) Integer page,
      HttpServletRequest request) {

    Integer actualPage = page == null  || page < 1 ? 0 : page - 1;
    Integer userId = Integer.valueOf(request.getSession().getAttribute("userId").toString());

    List<Owner> owners = service.findAll(userId, actualPage);
    return ResponseEntity.ok(owners);
  }

}
