package com.ibm.ropastyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibm.ropastyle.entity.Producto;
import com.ibm.ropastyle.entity.TipoDocumento;
import com.ibm.ropastyle.jpa.ProductoRepository;
import com.ibm.ropastyle.jpa.TipoDocumentoRepository;

@SpringBootApplication
public class RopaStyleServiceApplication implements CommandLineRunner {
	@Autowired
	private TipoDocumentoRepository tipoDocumento;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RopaStyleServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		llenarTipoDocumento();
		llenarProductos();
	}
	
	private void llenarTipoDocumento() {
		Iterable<TipoDocumento> findAll = tipoDocumento.findAll();
		if(!findAll.iterator().hasNext()) {
			tipoDocumento.save(new TipoDocumento("CC", "Cédula de ciudadanía"));
			tipoDocumento.save(new TipoDocumento("CE", "Cédula de Extranjería"));
			tipoDocumento.save(new TipoDocumento("NIT", "Número de Identificación Tributaria"));
			tipoDocumento.save(new TipoDocumento("PAS", "Pasaporte"));
			tipoDocumento.save(new TipoDocumento("TI", "Tarjeta de Identidad"));
		}		
	}
	
	private void llenarProductos() {
		Iterable<Producto> findAll = productoRepository.findAll();
		if(!findAll.iterator().hasNext()) {
			productoRepository.save(new Producto("CAMISA ALGODÓN LCC56 AZUL", "CAMISA ALGODÓN LCC56 AZUL", 1, 60000d));		
			productoRepository.save(new Producto("CAMISA ALGODON SLIM FIT LCC136 BLANCO", "CAMISA ALGODON SLIM FIT LCC136 BLANCO", 1, 40000d));
			productoRepository.save(new Producto("Camisa Algodón Slim Fit Lcc134 Blanco", "Camisa Algodón Slim Fit Lcc134 Blanco", 1, 48000d));
			productoRepository.save(new Producto("Camisa Algodón Slim Fit Lcc134 Azul", "Camisa Algodón Slim Fit Lcc134 Azul", 1, 65000d));
			productoRepository.save(new Producto("CAMISA LCC56 CAFE", "CAMISA LCC56 CAFE", 1, 52000d));
					
			productoRepository.save(new Producto("Ppantalon Jd8830", "Ppantalon Jd8830", 2, 90000d));
			productoRepository.save(new Producto("Pantalon Lchp03 Blue Envio Gratis", "Pantalon Lchp03 Blue Envio Gratis", 2, 80000d));
			productoRepository.save(new Producto("Pantalon Jd8896", "Pantalon Jd8896", 2, 91000d));
			productoRepository.save(new Producto("Pantalón Slim Fit Loto Green", "Pantalón Slim Fit Loto Green", 2, 89000d));
			productoRepository.save(new Producto("Pantalón Sura Beige", "Pantalón Sura Beige", 2, 93000d));
						
			productoRepository.save(new Producto("CHAQUETA EN CUERO LCHLW27", "CHAQUETA EN CUERO LCHLW27", 3, 70000d));			
			productoRepository.save(new Producto("Chaqueta En Cuero Mujer Nina Black", "Chaqueta En Cuero Mujer Nina Black", 3, 65500d));
			productoRepository.save(new Producto("Chaqueta En Cuero Mujer Nina Honey", "Chaqueta En Cuero Mujer Nina Honey", 3, 76000d));
			productoRepository.save(new Producto("Chaqueta En Cuero Mujer Nina White", "Chaqueta En Cuero Mujer Nina White", 3, 79800d));
			productoRepository.save(new Producto("Chaqueta En Cuero Lchlw01 Black", "Chaqueta En Cuero Lchlw01 Black", 3, 88000d));
		}
	}
}
