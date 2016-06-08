package com.diamond.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.diamond.Application;
import com.diamond.domain.Evento;
import com.diamond.domain.EventoRepository;
import com.diamond.domain.Organizador;
import com.diamond.domain.OrganizadorRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class OrganizadorTest {
	
	@Autowired
	OrganizadorRepository organizadorRepository;
	
	@Autowired
	EventoRepository eventoRepository;
	
	@Test
	public void guardarOrganizadorEventoTest(){
		Organizador organizador = new Organizador();
		organizador.setNombre("Ivonne");
		organizador.setApellidoPaterno("Perez");
		organizador.setApellidoMaterno("Contreras");
		organizador.setCalle("lomas de chapultepec");
		organizador.setColonia("valle gomez");
		organizador.setNumInt(null);
		organizador.setNumExt(10);
		organizador.setCp(15070);
		organizador.setEmail("ivonneAmor@outlook.com");
		organizador.setTelefono(56982132);
		organizador.setUsuario("ivonne");
		organizador.setPassword("pulgas");
		
		Evento evento = new Evento();
		evento.setNombreEvento("UACM");
		evento.setSalon(2);
		evento.setFechaEvento(new Date());
		evento.setOrganizador(organizador);//el join entre tablas para ejecutar la prueba
		
		organizadorRepository.save(organizador);
		eventoRepository.save(evento); 
		
	}


}
