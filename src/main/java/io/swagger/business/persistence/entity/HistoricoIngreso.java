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
@Table(name = "rec_his_ingreso", catalog = "d23q9477s25drf", schema = "public")
public class HistoricoIngreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_his_ingreso", nullable = false)
    private Integer idHisIngreso;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @JoinColumn(name = "id_medio_trasporte", referencedColumnName = "id_medio_trasporte")
    @ManyToOne(fetch = FetchType.LAZY)
    private MedioTrasporte idMedioTrasporte;
    @JoinColumn(name = "id_tarjeta", referencedColumnName = "id_tarjeta")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tarjeta idTarjeta;

    public HistoricoIngreso() {
    }

    public HistoricoIngreso(Integer idHisIngreso) {
        this.idHisIngreso = idHisIngreso;
    }

    public Integer getIdHisIngreso() {
        return idHisIngreso;
    }

    public void setIdHisIngreso(Integer idHisIngreso) {
        this.idHisIngreso = idHisIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public MedioTrasporte getIdMedioTrasporte() {
        return idMedioTrasporte;
    }

    public void setIdMedioTrasporte(MedioTrasporte idMedioTrasporte) {
        this.idMedioTrasporte = idMedioTrasporte;
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
        hash += (idHisIngreso != null ? idHisIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoIngreso)) {
            return false;
        }
        HistoricoIngreso other = (HistoricoIngreso) object;
        if ((this.idHisIngreso == null && other.idHisIngreso != null) || (this.idHisIngreso != null && !this.idHisIngreso.equals(other.idHisIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.HistoricoIngreso[ idHisIngreso=" + idHisIngreso + " ]";
    }
    
}