package com.br.viajeLeve.infra.persistence.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, BigInteger> {

    CategoriaEntity findById(Integer id);
}
