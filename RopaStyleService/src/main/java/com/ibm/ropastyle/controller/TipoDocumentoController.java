package com.ibm.ropastyle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ropastyle.entity.TipoDocumento;
import com.ibm.ropastyle.jpa.TipoDocumentoRepository;

@RestController
public class TipoDocumentoController {
	
	@Autowired
	private TipoDocumentoRepository tipoDocumento;

	@RequestMapping("/tipodocumento")
	public Iterable<TipoDocumento> getTipoDocumento() {
//		TipoDocumento documento = new TipoDocumento("CC", "Cedula de Ciudadania");
//		tipoDocumento.save(documento);

//		Iterable<TipoDocumento> findAll = tipoDocumento.findAll();
//		System.out.println("Marcelo " + findAll);
//		List<TipoDocumento> arrayList = new ArrayList<>();
//		arrayList.add(new TipoDocumento("ewef", "asdasd"));
//		
//		return arrayList;

		return tipoDocumento.findAll();
	}
}
