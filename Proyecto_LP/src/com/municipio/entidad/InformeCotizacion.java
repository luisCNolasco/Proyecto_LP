package com.municipio.entidad;

import java.sql.Date;

public class InformeCotizacion {

	private String codigo;
	private int estado;
	private Date fecha;
	private String documento;
	private String codigo_informe_tecnico;
	private String codigo_usuario;
	
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getCodigo_informe_tecnico() {
		return codigo_informe_tecnico;
	}
	public void setCodigo_informe_tecnico(String codigo_informe_tecnico) {
		this.codigo_informe_tecnico = codigo_informe_tecnico;
	}
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	
	
	
}
