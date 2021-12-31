package com.ibm.academia.apirest.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.models.entities.Cajero;


@Repository
public interface CajeroRepository extends PagingAndSortingRepository<Cajero, String>{

}
