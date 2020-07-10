package com.municipio.entidad;

import java.sql.Date;

public class InformeTecnico {
	private String codigo;
	private String documento;
	private Date fecha;
	private int estado;
	private String codigo_solicitud_requerimiento;
	
	public String getCodigo_solicitud_requerimiento() {
		return codigo_solicitud_requerimiento;
	}
	public void setCodigo_solicitud_requerimiento(String codigo_solicitud_requerimiento) {
		this.codigo_solicitud_requerimiento = codigo_solicitud_requerimiento;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
