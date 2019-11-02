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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author victordehoyos
 */
@Entity
@Table(name = "rec_usuario", catalog = "d23q9477s25drf", schema = "public")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "nro_identificacion", nullable = false, length = 12)
    private String nroIdentificacion;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;
    @Column(name = "telefono_principal", length = 20)
    private String telefonoPrincipal;
    @Column(name = "telefono_secundario", length = 20)
    private String telefonoSecundario;
    @Column(name = "correo_principal", length = 100)
    private String correoPrincipal;
    @Column(name = "correo_secundario", length = 100)
    private String correoSecundario;
    @Column(name = "direccion", length = 100)
    private String direccion;
    @Column(name = "permite_uso_datos", length = 2)
    private String permiteUsoDatos;
    @Column(name = "permite_abeas_data", length = 2)
    private String permiteAbeasData;
    @Column(name = "permite_envio_info", length = 2)
    private String permiteEnvioInfo;
    @JoinColumn(name = "id_tipo_identificacion", referencedColumnName = "id_tipo_identificacion", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoIdentificacion idTipoIdentificacion;
    @OneToMany(mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Tarjeta> tarjetaList;
    @OneToMany(mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Password> passwordList;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String nroIdentificacion, String nombre, String apellido) {
        this.idUsuario = idUsuario;
        this.nroIdentificacion = nroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(String nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTelefonoSecundario() {
        return telefonoSecundario;
    }

    public void setTelefonoSecundario(String telefonoSecundario) {
        this.telefonoSecundario = telefonoSecundario;
    }

    public String getCorreoPrincipal() {
        return correoPrincipal;
    }

    public void setCorreoPrincipal(String correoPrincipal) {
        this.correoPrincipal = correoPrincipal;
    }

    public String getCorreoSecundario() {
        return correoSecundario;
    }

    public void setCorreoSecundario(String correoSecundario) {
        this.correoSecundario = correoSecundario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPermiteUsoDatos() {
        return permiteUsoDatos;
    }

    public void setPermiteUsoDatos(String permiteUsoDatos) {
        this.permiteUsoDatos = permiteUsoDatos;
    }

    public String getPermiteAbeasData() {
        return permiteAbeasData;
    }

    public void setPermiteAbeasData(String permiteAbeasData) {
        this.permiteAbeasData = permiteAbeasData;
    }

    public String getPermiteEnvioInfo() {
        return permiteEnvioInfo;
    }

    public void setPermiteEnvioInfo(String permiteEnvioInfo) {
        this.permiteEnvioInfo = permiteEnvioInfo;
    }

    public TipoIdentificacion getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(TipoIdentificacion idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    @XmlTransient
    public List<Tarjeta> getTarjetaList() {
        return tarjetaList;
    }

    public void setTarjetaList(List<Tarjeta> tarjetaList) {
        this.tarjetaList = tarjetaList;
    }

    @XmlTransient
    public List<Password> getPasswordList() {
        return passwordList;
    }

    public void setPasswordList(List<Password> passwordList) {
        this.passwordList = passwordList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
