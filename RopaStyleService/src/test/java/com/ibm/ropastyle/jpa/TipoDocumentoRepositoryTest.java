package com.ibm.ropastyle.jpa;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.ropastyle.entity.TipoDocumento;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TipoDocumentoRepositoryTest {

	@Autowired
	private TipoDocumentoRepository tipoDocumento;

	@Test
	public void testFindAll() {
		Iterable<TipoDocumento> findAll = tipoDocumento.findAll();
		assertNotNull(findAll);
	}
}
