/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udec.benlly;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "recorridoorig", catalog = "benlly", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recorridoorig.findAll", query = "SELECT r FROM Recorridoorig r"),
    @NamedQuery(name = "Recorridoorig.findByIdrecorridoorig", query = "SELECT r FROM Recorridoorig r WHERE r.idrecorridoorig = :idrecorridoorig"),
    @NamedQuery(name = "Recorridoorig.findByNombre", query = "SELECT r FROM Recorridoorig r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Recorridoorig.findByHoraSalida", query = "SELECT r FROM Recorridoorig r WHERE r.horaSalida = :horaSalida"),
    @NamedQuery(name = "Recorridoorig.findByHoraLlegada", query = "SELECT r FROM Recorridoorig r WHERE r.horaLlegada = :horaLlegada")})
public class Recorridoorig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrecorridoorig")
    private Integer idrecorridoorig;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "hora_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSalida;
    @Column(name = "hora_llegada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaLlegada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recorridoorigIdrecorridoorig")
    private List<Log> logList;
    @JoinColumn(name = "conductor_idConductor", referencedColumnName = "idConductor")
    @ManyToOne(optional = false)
    private Conductor conductoridConductor;
    @JoinColumn(name = "vehiculo_idvehiculo", referencedColumnName = "idvehiculo")
    @ManyToOne(optional = false)
    private Vehiculo vehiculoIdvehiculo;

    public Recorridoorig() {
    }

    public Recorridoorig(Integer idrecorridoorig) {
        this.idrecorridoorig = idrecorridoorig;
    }

    public Integer getIdrecorridoorig() {
        return idrecorridoorig;
    }

    public void setIdrecorridoorig(Integer idrecorridoorig) {
        this.idrecorridoorig = idrecorridoorig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @XmlTransient
    public List<Log> getLogList() {
        return logList;
    }

    public void setLogList(List<Log> logList) {
        this.logList = logList;
    }

    public Conductor getConductoridConductor() {
        return conductoridConductor;
    }

    public void setConductoridConductor(Conductor conductoridConductor) {
        this.conductoridConductor = conductoridConductor;
    }

    public Vehiculo getVehiculoIdvehiculo() {
        return vehiculoIdvehiculo;
    }

    public void setVehiculoIdvehiculo(Vehiculo vehiculoIdvehiculo) {
        this.vehiculoIdvehiculo = vehiculoIdvehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrecorridoorig != null ? idrecorridoorig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recorridoorig)) {
            return false;
        }
        Recorridoorig other = (Recorridoorig) object;
        if ((this.idrecorridoorig == null && other.idrecorridoorig != null) || (this.idrecorridoorig != null && !this.idrecorridoorig.equals(other.idrecorridoorig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udec.benlly.Recorridoorig[ idrecorridoorig=" + idrecorridoorig + " ]";
    }
    
}
