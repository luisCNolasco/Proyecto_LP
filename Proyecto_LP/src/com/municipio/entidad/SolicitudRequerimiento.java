package com.municipio.entidad;

import java.util.Date;

public class SolicitudRequerimiento {
	private String codigo;
	private int estado ;
	private Date fecha;
	private String descripcion;
	private int codigo_area;
	private String codigo_usuario_solicitante;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
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
	public int getCodigo_area() {
		return codigo_area;
	}
	public void setCodigo_area(int codigo_area) {
		this.codigo_area = codigo_area;
	}
	public String getCodigo_usuario_solicitante() {
		return codigo_usuario_solicitante;
	}
	public void setCodigo_usuario_solicitante(String codigo_usuario_solicitante) {
		this.codigo_usuario_solicitante = codigo_usuario_solicitante;
	}
	
	
	
	
}
