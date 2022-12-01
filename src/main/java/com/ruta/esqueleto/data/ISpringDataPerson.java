package com.ruta.esqueleto.data;

import java.util.List;

import com.ruta.esqueleto.domain.Person;

public interface ISpringDataPerson {

    List<Person> findAllPersons();
}
