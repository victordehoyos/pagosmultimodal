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

/**
 *
 * @author victordehoyos
 */
@Entity
@Table(name = "rec_recarga", catalog = "d23q9477s25drf", schema = "public")
public class Recarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_recarga", nullable = false)
    private Integer idRecarga;
    @Column(name = "fecha_recarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRecarga;
    @Column(name = "valor_cargado")
    private Integer valorCargado;
    @JoinColumn(name = "id_medio_recarga", referencedColumnName = "id_medio_recarga")
    @ManyToOne(fetch = FetchType.LAZY)
    private MedioRecarga idMedioRecarga;
    @JoinColumn(name = "id_tarjeta", referencedColumnName = "id_tarjeta")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tarjeta idTarjeta;

    public Recarga() {
    }

    public Recarga(Integer idRecarga) {
        this.idRecarga = idRecarga;
    }

    public Integer getIdRecarga() {
        return idRecarga;
    }

    public void setIdRecarga(Integer idRecarga) {
        this.idRecarga = idRecarga;
    }

    public Date getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(Date fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }

    public Integer getValorCargado() {
        return valorCargado;
    }

    public void setValorCargado(Integer valorCargado) {
        this.valorCargado = valorCargado;
    }

    public MedioRecarga getIdMedioRecarga() {
        return idMedioRecarga;
    }

    public void setIdMedioRecarga(MedioRecarga idMedioRecarga) {
        this.idMedioRecarga = idMedioRecarga;
    }

    public Tarjeta getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Tarjeta idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecarga != null ? idRecarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recarga)) {
            return false;
        }
        Recarga other = (Recarga) object;
        if ((this.idRecarga == null && other.idRecarga != null) || (this.idRecarga != null && !this.idRecarga.equals(other.idRecarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Recarga[ idRecarga=" + idRecarga + " ]";
    }
    
}
