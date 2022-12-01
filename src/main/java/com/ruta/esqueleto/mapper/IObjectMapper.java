package com.ruta.esqueleto.mapper;

import java.util.List;

public interface IObjectMapper<E, D> {

    E toEntity(D dto);

    D toDomain(E entity);

    List<E> toEntity(List<D> domainList);

    List<D> toDomain(List<E> entityList);

}
