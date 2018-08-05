package com.ibm.ropastyle.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ropastyle.entity.TipoDocumento;
import com.ibm.ropastyle.jpa.TipoDocumentoRepository;

@CrossOrigin
@RestController
public class TipoDocumentoController {
	private static final Logger log = LogManager.getLogger(TipoDocumentoController.class);
	
	@Autowired
	private TipoDocumentoRepository tipoDocumento;

	@RequestMapping("/tipodocumento")
	public Iterable<TipoDocumento> getTipoDocumento() {
		log.info("Request: /tipodocumento");
		return tipoDocumento.findAll();
	}
}
