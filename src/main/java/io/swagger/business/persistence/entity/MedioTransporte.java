package io.swagger.business.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author victordehoyos
 */
@Entity
@Table(name = "rec_medio_trasporte", catalog = "d23q9477s25drf", schema = "public")
public class MedioTrasporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medio_trasporte", nullable = false)
    private Integer idMedioTrasporte;
    @Column(name = "codigo", length = 10)
    private String codigo;
    @Column(name = "descripcion", length = 100)
    private String descripcion;
    @Column(name = "valor")
    private Integer valor;
    @OneToMany(mappedBy = "idMedioTrasporte", fetch = FetchType.LAZY)
    private List<HistoricoIngreso> historicoIngresoList;

    public MedioTrasporte() {
    }

    public MedioTrasporte(Integer idMedioTrasporte) {
        this.idMedioTrasporte = idMedioTrasporte;
    }

    public Integer getIdMedioTrasporte() {
        return idMedioTrasporte;
    }

    public void setIdMedioTrasporte(Integer idMedioTrasporte) {
        this.idMedioTrasporte = idMedioTrasporte;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @XmlTransient
    public List<HistoricoIngreso> getHistoricoIngresoList() {
        return historicoIngresoList;
    }

    public void setHistoricoIngresoList(List<HistoricoIngreso> historicoIngresoList) {
        this.historicoIngresoList = historicoIngresoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedioTrasporte != null ? idMedioTrasporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedioTrasporte)) {
            return false;
        }
        MedioTrasporte other = (MedioTrasporte) object;
        if ((this.idMedioTrasporte == null && other.idMedioTrasporte != null) || (this.idMedioTrasporte != null && !this.idMedioTrasporte.equals(other.idMedioTrasporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.MedioTrasporte[ idMedioTrasporte=" + idMedioTrasporte + " ]";
    }
    
}
