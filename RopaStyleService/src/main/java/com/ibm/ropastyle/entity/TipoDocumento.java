package com.ibm.ropastyle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoDocumento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String sigla;
	private String nombre;
	
	public TipoDocumento() {}

	public TipoDocumento(String sigla, String nombre) {
		this.sigla = sigla;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
    public String toString() {
        return String.format("TipoDocumento[id=%d, sigla='%s', nombre='%s']", id, sigla, nombre);
    }
}
