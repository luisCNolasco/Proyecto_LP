package com.municipio.entidad;

import java.sql.Date;

public class InformeCertificacionPresupuestal {

	private String codigo;
	private int estado;
	private Date fecha;
	private String documento;
	private String codigo_solicitud_habilitacion_presupuestal;
	private String codigo_usuario;

	
	public String getCodigo_solicitud_habilitacion_presupuestal() {
		return codigo_solicitud_habilitacion_presupuestal;
	}
	public void setCodigo_solicitud_habilitacion_presupuestal(String codigo_solicitud_habilitacion_presupuestal) {
		this.codigo_solicitud_habilitacion_presupuestal = codigo_solicitud_habilitacion_presupuestal;
	}
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
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
	
	
}
