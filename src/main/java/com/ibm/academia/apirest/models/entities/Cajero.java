package com.ibm.academia.apirest.models.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Cajero implements Serializable {
	
	
	private String id;
	private String identificador;
	private String municipio;
	private String calle;
	private String direccion;
	private String identificador1;
	private String entrecalle1;
	private String entrecalle2;
	private String numeroSuc;
	private String identificador3;
	private String fechaCreacion;
	private String fechaModificacion;
	private String identificador4;
	private String horaApertura;
	private String horaCierre;
	private String gpsLongitud;
	private String gpsLatitud;
	private String estado;
	private String identificador5;
	private String tipoEstablecimiento;
	private String identificador6;
	private String identificador7;
	private String identificador9;
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(calle, direccion, entrecalle1, entrecalle2, estado, fechaCreacion, fechaModificacion,
				horaApertura, horaCierre, id, identificador, identificador1, identificador3, identificador4,
				identificador5, identificador6, identificador7, identificador9, municipio, numeroSuc,
				tipoEstablecimiento);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cajero other = (Cajero) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(entrecalle1, other.entrecalle1) && Objects.equals(entrecalle2, other.entrecalle2)
				&& Objects.equals(estado, other.estado) && Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(fechaModificacion, other.fechaModificacion)
				&& Objects.equals(horaApertura, other.horaApertura) && Objects.equals(horaCierre, other.horaCierre)
				&& Objects.equals(id, other.id) && Objects.equals(identificador, other.identificador)
				&& Objects.equals(identificador1, other.identificador1)
				&& Objects.equals(identificador3, other.identificador3)
				&& Objects.equals(identificador4, other.identificador4)
				&& Objects.equals(identificador5, other.identificador5)
				&& Objects.equals(identificador6, other.identificador6)
				&& Objects.equals(identificador7, other.identificador7)
				&& Objects.equals(identificador9, other.identificador9) && Objects.equals(municipio, other.municipio)
				&& Objects.equals(numeroSuc, other.numeroSuc)
				&& Objects.equals(tipoEstablecimiento, other.tipoEstablecimiento);
	}




	@Override
	public String toString() {
		return "Cajero [id=" + id + ", identificador=" + identificador + ", municipio=" + municipio + ", calle=" + calle
				+ ", direccion=" + direccion + ", identificador1=" + identificador1 + ", entrecalle1=" + entrecalle1
				+ ", entrecalle2=" + entrecalle2 + ", numeroSuc=" + numeroSuc + ", identificador3=" + identificador3
				+ ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", identificador4="
				+ identificador4 + ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + ", estado="
				+ estado + ", identificador5=" + identificador5 + ", tipoEstablecimiento=" + tipoEstablecimiento
				+ ", identificador6=" + identificador6 + ", identificador7=" + identificador7 + ", identificador9="
				+ identificador9 + "]";
	}




	private static final long serialVersionUID = 4960158170047534882L;

}
