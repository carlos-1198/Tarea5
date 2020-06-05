package model.dao;

import model.Estudiante;
import model.util.Conexion;

public class EstudianteDao 
	extends Conexion<Estudiante> 
	implements GenericDao<Estudiante> {
	
	public EstudianteDao() {
		super(Estudiante.class);
	}
}
