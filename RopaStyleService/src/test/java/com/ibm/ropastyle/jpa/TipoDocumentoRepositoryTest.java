package com.ibm.ropastyle.jpa;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.ropastyle.entity.TipoDocumento;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TipoDocumentoRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private TipoDocumentoRepository tipoDocumento;

	@Test
	@Transactional
	@Rollback(false)
	public void testFindAll() {
		TipoDocumento documento = new TipoDocumento("CC", "Cedula de Ciudadania");
		entityManager.persist(documento);

		Iterable<TipoDocumento> findAll = tipoDocumento.findAll();
		System.out.println("Marcelo " + findAll);
	}

}
