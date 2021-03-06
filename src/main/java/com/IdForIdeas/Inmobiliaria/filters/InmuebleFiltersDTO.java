package com.IdForIdeas.Inmobiliaria.filters;

public class InmuebleFiltersDTO {
	
	private String nombre;
	private Integer ambientesMin;
	private Integer ambientesMax;
	private String contrato;
	private String ciudad;
	private String pais;
	private Double precioMin;
	private Double precioMax;
	private String estado;
	
	public InmuebleFiltersDTO(String nombre, Integer ambientesMin, Integer ambientesMax, String contrato, String ciudad, String pais,
			Double precioMin, Double precioMax, String estado) {
		this.nombre = nombre;
		this.ambientesMin = ambientesMin;
		this.ambientesMax = ambientesMax;
		this.contrato = contrato;
		this.ciudad = ciudad;
		this.pais = pais;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAmbientesMin() {
		return ambientesMin;
	}

	public void setAmbientesMin(Integer ambientesMin) {
		this.ambientesMin = ambientesMin;
	}

	public Integer getAmbientesMax() {
		return ambientesMax;
	}

	public void setAmbientesMax(Integer ambientesMax) {
		this.ambientesMax = ambientesMax;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Double getPrecioMin() {
		return precioMin;
	}

	public void setPrecioMin(Double precioMin) {
		this.precioMin = precioMin;
	}

	public Double getPrecioMax() {
		return precioMax;
	}

	public void setPrecioMax(Double precioMax) {
		this.precioMax = precioMax;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
