package io.swagger.business.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victordehoyos
 */
@Entity
@Table(name = "rec_parametrica", catalog = "d23q9477s25drf", schema = "public")
public class Parametrica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parametrica", nullable = false)
    private Integer idParametrica;
    @Column(name = "llave", length = 10)
    private String llave;
    @Column(name = "valor", length = 100)
    private String valor;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "activo", length = 2)
    private String activo;

    public Parametrica() {
    }

    public Parametrica(Integer idParametrica) {
        this.idParametrica = idParametrica;
    }

    public Integer getIdParametrica() {
        return idParametrica;
    }

    public void setIdParametrica(Integer idParametrica) {
        this.idParametrica = idParametrica;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParametrica != null ? idParametrica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametrica)) {
            return false;
        }
        Parametrica other = (Parametrica) object;
        if ((this.idParametrica == null && other.idParametrica != null) || (this.idParametrica != null && !this.idParametrica.equals(other.idParametrica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Parametrica[ idParametrica=" + idParametrica + " ]";
    }
    
}
