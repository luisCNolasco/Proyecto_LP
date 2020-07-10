package com.municipio.service;

import java.util.ArrayList;
import com.municipio.entidad.Area;
import com.municipio.fabrica.DAOFactory;
import com.municipio.interfaces.AreaDAO;

public class AreaService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(1);

	AreaDAO daoArea = fabrica.getAreaDAO();

	public ArrayList<Area> listarAreas(){
		return daoArea.listarAreas();
	}
}
