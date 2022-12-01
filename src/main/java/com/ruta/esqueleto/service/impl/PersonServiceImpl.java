package com.ruta.esqueleto.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ruta.esqueleto.data.ISpringDataPerson;
import com.ruta.esqueleto.domain.Person;
import com.ruta.esqueleto.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService {

    private final ISpringDataPerson iSpringDataPerson;

    public PersonServiceImpl(ISpringDataPerson iSpringDataPerson) {
        this.iSpringDataPerson = iSpringDataPerson;
    }

    @Override
    public List<Person> finAllPersons() {
        return iSpringDataPerson.findAllPersons();
    }

}
