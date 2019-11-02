package io.swagger.business.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rec_contrasena", catalog = "d23q9477s25drf", schema = "public")
public class Password implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id_contrasena", nullable = false)
	private Integer idContrasena;
	@Column(name = "fecha_vig_inicial")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaVigInicial;
	@Column(name = "fecha_vig_final")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaVigFinal;
	@Column(name = "descripcion", length = 100)
	private String descripcion;
	@Column(name = "activo", length = 2)
	private String activo;
	@JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario idUsuario;

	public Password() {
	}

	public Password(Integer idContrasena) {
		this.idContrasena = idContrasena;
	}

	public Integer getIdContrasena() {
		return idContrasena;
	}

	public void setIdContrasena(Integer idContrasena) {
		this.idContrasena = idContrasena;
	}

	public Date getFechaVigInicial() {
		return fechaVigInicial;
	}

	public void setFechaVigInicial(Date fechaVigInicial) {
		this.fechaVigInicial = fechaVigInicial;
	}

	public Date getFechaVigFinal() {
		return fechaVigFinal;
	}

	public void setFechaVigFinal(Date fechaVigFinal) {
		this.fechaVigFinal = fechaVigFinal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idContrasena != null ? idContrasena.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Password)) {
			return false;
		}
		Password other = (Password) object;
		if ((this.idContrasena == null && other.idContrasena != null)
				|| (this.idContrasena != null && !this.idContrasena.equals(other.idContrasena))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "id =" + idContrasena + "";
	}

}
