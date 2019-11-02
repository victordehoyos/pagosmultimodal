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
@Table(name = "rec_medio_recarga", catalog = "d23q9477s25drf", schema = "public")
public class MedioRecarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medio_recarga", nullable = false)
    private Integer idMedioRecarga;
    @Column(name = "codigo", length = 10)
    private String codigo;
    @Column(name = "descripcion", length = 100)
    private String descripcion;
    @Column(name = "entidad", length = 55)
    private String entidad;
    @OneToMany(mappedBy = "idMedioRecarga", fetch = FetchType.LAZY)
    private List<Recarga> recargaList;

    public MedioRecarga() {
    }

    public MedioRecarga(Integer idMedioRecarga) {
        this.idMedioRecarga = idMedioRecarga;
    }

    public Integer getIdMedioRecarga() {
        return idMedioRecarga;
    }

    public void setIdMedioRecarga(Integer idMedioRecarga) {
        this.idMedioRecarga = idMedioRecarga;
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

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @XmlTransient
    public List<Recarga> getRecargaList() {
        return recargaList;
    }

    public void setRecargaList(List<Recarga> recargaList) {
        this.recargaList = recargaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedioRecarga != null ? idMedioRecarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedioRecarga)) {
            return false;
        }
        MedioRecarga other = (MedioRecarga) object;
        if ((this.idMedioRecarga == null && other.idMedioRecarga != null) || (this.idMedioRecarga != null && !this.idMedioRecarga.equals(other.idMedioRecarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.MedioRecarga[ idMedioRecarga=" + idMedioRecarga + " ]";
    }
    
}
