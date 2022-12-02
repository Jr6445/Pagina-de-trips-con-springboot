package com.sv.tripElSalvadorApp.model;

import java.util.Date;

public class Trip {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Double costo;
	private Integer destacado;
	private String imagen="no-image.png";
	private String detalles;
	
	
	

	@Override
	public String toString() {
		return "Trip [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", costo=" + costo + ", destacado=" + destacado + ", imagen=" + imagen + ", detalles=" + detalles
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Integer getDestacado() {
		return destacado;
	}

	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	

	
}
