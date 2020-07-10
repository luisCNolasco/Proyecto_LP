package com.municipio.entidad;

import java.sql.Date;

public class ActaDeEntrega {

	private String codigo;
	private Date fecha;
	private String descripcion;
	private boolean firma;
	private String codigo_usuario;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isFirma() {
		return firma;
	}
	public void setFirma(boolean firma) {
		this.firma = firma;
	}
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	
	
}
