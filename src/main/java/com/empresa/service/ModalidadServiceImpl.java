package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Modalidad;
import com.empresa.repository.ModalidadRepository;

import jdk.jfr.internal.Repository;

@Service
public class ModalidadServiceImpl implements ModalidadService {

	@Autowired
	private ModalidadRepository repositorio;

	@Override
	public Modalidad insertaActualizaModalidad(Modalidad obj) {
		return (Modalidad) repositorio.save(obj);
	}

	@Override
	public List<Modalidad> listaModalidad() {
		return repositorio.findAll();
	}

	@Override
	public List<Modalidad> listaModalidadPorNombreNumHombresNumMujeresEdadMaximaEdadMinimaSedeDeporte(String nombre,
			int numHombres, int numMujeres, int edadMaxima, int edadMinima, String sede) {
		return repositorio.listaModalidadPorNombreNumHombresNumMujeresEdadMaximaEdadMinimaSedeDeporte(nombre, numHombres,numMujeres,edadMaxima,edadMinima,sede);
	}

	
	
	public <FiltroModalidad> List<Modalidad> listaPrFiltro(FiltroModalidad filtro) {
		
		return null;
	}

	@Override
	public List listaPorFiltro(Object filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listamodalidadporNombrenumHombresnumMujeresedadMaxedadMinsedeDeporte(Object filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

}
