package com.ruta.esqueleto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruta.esqueleto.entity.PersonEntity;

@Repository
public interface JpaPersonRepository extends JpaRepository<PersonEntity, Long> {

}
