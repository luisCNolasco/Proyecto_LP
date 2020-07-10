package com.municipio.fabrica;

import com.municipio.interfaces.*;

public abstract class DAOFactory {
	// los posibles orígenes de datos
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;
    // Existirá un método get por cada DAO que exista en el sistema
    // Ejemplo:
    //public abstract ArticuloDAO getArticuloDAO();
    // registramos nuestros daos

    public abstract ActaDeEntregaDAO getActaDeEntregaDAO();
    public abstract InformeCertificacionPresupuestalDAO getInformeCertificacionPresupuestalDAO();
    public abstract InformeCotizacionDAO getInformeCotizacionDAO();
    public abstract InformeTecnicoDAO getInformeTecnicoDAO();
    public abstract SolicitudHabilitacionPresupuestalDAO getSolicitudhabilitacionPresupuestalDAO();
    public abstract SolicitudRequerimientoDAO getSolicitudRequerimientoDAO();
    public abstract UsuarioDAO getUsuarioDAO();
    public abstract AreaDAO getAreaDAO();
    
   
    public static DAOFactory getDAOFactory(int whichFactory){
        switch(whichFactory){
       	case MYSQL:
        	   return new MySqlDAOFactory();
        	case XML:
        	    //return new XmlDAOFactory();
        	//case ORACLE:
        	   // return new OracleDAOFactory();
        	/*case DB2:
        	    return new Db2DAOFactory();*/
        	//case SQLSERVER:
        	   // return new SqlServerDAOFactory();
        	/*case XML:
        	    return new XmlDAOFactory();*/
        	default:
        	    return null;
        }
     }
}
