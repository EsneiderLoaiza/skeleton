package com.ruta.esqueleto.data.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ruta.esqueleto.data.ISpringDataPerson;
import com.ruta.esqueleto.domain.Person;
import com.ruta.esqueleto.entity.PersonEntity;
import com.ruta.esqueleto.mapper.IPersonMapper;
import com.ruta.esqueleto.repository.JpaPersonRepository;

@Repository
public class SpringDataPersonImpl implements ISpringDataPerson {

    private final JpaPersonRepository JpaPersonRepository;

    private IPersonMapper iPersonMapper;

    public SpringDataPersonImpl(JpaPersonRepository jpaPersonRepository, IPersonMapper iPersonMapper) {
        JpaPersonRepository = jpaPersonRepository;
        this.iPersonMapper = iPersonMapper;
    }

    public List<Person> findAllPersons() {
        List<PersonEntity> persons = JpaPersonRepository.findAll();
        System.out.println("****************** personsss : " + persons);
        return iPersonMapper.toDomain(persons);
    }

}
