package com.empresa.service;

import java.util.List;


import com.empresa.entity.Modalidad;

public interface ModalidadService<FiltroModalidad> {

	public Modalidad insertaActualizaModalidad(Modalidad obj);
	
	public abstract List<Modalidad> listaModalidad();
	
public abstract List<Modalidad> listaModalidadPorNombreNumHombresNumMujeresEdadMaximaEdadMinimaSedeDeporte(String nombre, int numHombres, int numMujeres, int edadMaxima, int edadMinima, String sede);
	
	public abstract <FiltroModalidad> List<Modalidad> listaPorFiltro(FiltroModalidad filtro);

	public List<Modalidad> listamodalidadporNombrenumHombresnumMujeresedadMaxedadMinsedeDeporte(FiltroModalidad filtro);

	<FiltroModalidad> List<Modalidad> listaPrFiltro(FiltroModalidad filtro);





	
}
