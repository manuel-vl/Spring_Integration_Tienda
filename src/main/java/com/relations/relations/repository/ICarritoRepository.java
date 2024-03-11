package com.relations.relations.repository;

import com.relations.relations.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.jar.JarEntry;

@Repository
public interface ICarritoRepository extends JpaRepository<Carrito,Long> {
}
