package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Modalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadRepository<FiltroModalidad> extends JpaRepository<Modalidad, Integer>  {

	
	//public abstract List<Docente> findByDni(String dni);
	//public abstract List<Docente> findByNombreContaining(String dni);
	
	public abstract List<Modalidad> findByNombre(String nombre);
	public abstract List<Modalidad> findBySedeContaining(String nombre);
	
	//JPQL es un query con las clases y atributos (entidades)
		@Query("select d from Modalidad d where "
							+ "( :p_nom is '' or d.nombre = :p_nom ) and "
							+ "( :p_nuHom is '' or d.numHombres = :p_numHom ) and "
							+ "( :p_numMuj is '' or d.numMujeres = :p_numMuj ) and "
							+ "( :p_edadMax is '' or d.edadMaxima = :p_edadMax ) and "
							+ "( :p_edadMin is '' or d.edadMinima = :p_edadMin ) and "
							+ "( :p_sed is '' or d.sede like :p_sed )")
		public abstract List<Modalidad> listaModalidadPorNombreNumHobresNumMujeresEdadMaximaEdadMinimaSede(
											 	@Param("p_nombre") String nombre, 
											 	@Param("p_sede") String sede);
		
		
		@Query("select d from Modalidad d where "
				+ "( :p_nombre is '' or d.nombre = :p_nombre ) and "
				+ "( :p_sede is '' or d.sede like :p_sede ) and "
				+ "( :p_depor is 0  or d.deporte.idDeporte = :p_deport ) ")
		public abstract List<Modalidad> listaModalidadPorNombreNumHombresNumMujeresEdadMaximaEdadMinimaSede(
									 	@Param("p_nombre") String nombre, 
									 	@Param("p_numHombres") String numHombres,
									 	@Param("p_numMujeres") int numMujeres ,
									 	@Param("p_edadMaxima") int edadMaxima,
									 	@Param("p_edadMinima") int edadMinima,
									 	@Param("p_sede") String sede,
									 	@Param("p_depor") int idDeporte);
		
		
		@Query("select d from Modalidad d where "
				+ "( :#{#fil.nombre} is '' or d.nombre = :#{#fil.nombre} ) and "
				+ "( :#{#fil.numHombres} is '' or d.numHombres = :#{#fil.numHombres} ) and "
				+ "( :#{#fil.numMujeres} is '' or d.numMujeres = :#{#fil.numMujeres} ) and "
				+ "( :#{#fil.edadMaxima} is '' or d.edadMaxima = :#{#fil.edadMaxima} ) and "
				+ "( :#{#fil.edadMinima} is '' or d.edadMinima = :#{#fil.edadMinima} ) and "
				+ "( :#{#fil.sede} is '' or d.sede like :#{#fil.sede} ) and "
				+ "( :#{#fil.idDeporte} is 0  or d.deporte.idDeporte = :#{#fil.idDeporte} ) ")
		public abstract List<Modalidad> listaPorFiltro(@Param("fil")FiltroModalidad filtro);
		public abstract List<Modalidad> listaModalidadPorNombreNumHombresNumMujeresEdadMaximaEdadMinimaSedeDeporte(
				String nombre, int numHombres, int numMujeres, int edadMaxima, int edadMinima, String sede);
		
		
	}


