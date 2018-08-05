package com.ibm.ropastyle.jpa;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.ropastyle.entity.Producto;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductoRepositoryTest {

	@Autowired
	private ProductoRepository productoRepository;

	@Test
	public void testFindAll() {
		Iterable<Producto> findAll = productoRepository.findAll();
		assertNotNull(findAll);
	}
	
	@Test
	public void testFindByCategoria() {
		Iterable<Producto> findByCategoria = productoRepository.findByCategoria(1);
		assertNotNull(findByCategoria);
	}
}
