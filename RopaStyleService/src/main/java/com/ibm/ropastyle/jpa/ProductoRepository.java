package com.ibm.ropastyle.jpa;

import org.springframework.data.repository.CrudRepository;

import com.ibm.ropastyle.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	Iterable<Producto> findByCategoria(Integer categoria);
}
