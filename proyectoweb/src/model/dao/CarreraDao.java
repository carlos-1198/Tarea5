package model.dao;

import model.Carrera;
import model.util.Conexion;

public class CarreraDao 
	extends Conexion<Carrera> 
	implements GenericDao<Carrera> {
	
	public CarreraDao() {
		super(Carrera.class);
	}
}