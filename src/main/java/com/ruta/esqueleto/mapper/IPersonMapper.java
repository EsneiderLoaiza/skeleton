package com.ruta.esqueleto.mapper;

import com.ruta.esqueleto.domain.Person;
import com.ruta.esqueleto.entity.PersonEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPersonMapper extends IObjectMapper<PersonEntity, Person> {

}
