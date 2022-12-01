package com.ruta.esqueleto.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruta.esqueleto.domain.Person;
import com.ruta.esqueleto.service.IPersonService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class PersonRestTemplate {

    private final Logger log = LoggerFactory.getLogger(PersonRestTemplate.class);

    private final IPersonService iPersonService;

    public PersonRestTemplate(IPersonService iPersonService) {
        this.iPersonService = iPersonService;
    }

    @GetMapping("/getallpersons")
    public ResponseEntity<List<Person>> getAllPersons() {

        log.info("***** INTENTO DE PETICIÓN");

        List<Person> persons = iPersonService.finAllPersons();
        log.info(" persons {}", persons);

        return ResponseEntity.ok(persons);
    }
}
