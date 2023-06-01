/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariangel.administracion_tarea.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "TBL_TIPOTOUR")
@NamedQueries({
    @NamedQuery(name = "TipoTour.findAll", query = "SELECT t FROM TipoTour t"),
    @NamedQuery(name = "TipoTour.findByTtCodigo", query = "SELECT t FROM TipoTour t WHERE t.ttCodigo = :ttCodigo"),
    @NamedQuery(name = "TipoTour.findByTtTipo", query = "SELECT t FROM TipoTour t WHERE t.ttTipo = :ttTipo"),
    @NamedQuery(name = "TipoTour.findByTtNombretour", query = "SELECT t FROM TipoTour t WHERE t.ttNombretour = :ttNombretour"),
    @NamedQuery(name = "TipoTour.findByTtPais", query = "SELECT t FROM TipoTour t WHERE t.ttPais = :ttPais")})
public class TipoTour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TT_CODIGO")
    private Integer ttCodigo;
    @Basic(optional = false)
    @Column(name = "TT_TIPO")
    private String ttTipo;
    @Basic(optional = false)
    @Column(name = "TT_NOMBRETOUR")
    private String ttNombretour;
    @Basic(optional = false)
    @Column(name = "TT_PAIS")
    private String ttPais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trsTipotourcodigo")
    private Collection<Tour> tourCollection;

    public TipoTour() {
    }

    public TipoTour(Integer ttCodigo) {
        this.ttCodigo = ttCodigo;
    }

    public TipoTour(Integer ttCodigo, String ttTipo, String ttNombretour, String ttPais) {
        this.ttCodigo = ttCodigo;
        this.ttTipo = ttTipo;
        this.ttNombretour = ttNombretour;
        this.ttPais = ttPais;
    }

    public Integer getTtCodigo() {
        return ttCodigo;
    }

    public void setTtCodigo(Integer ttCodigo) {
        this.ttCodigo = ttCodigo;
    }

    public String getTtTipo() {
        return ttTipo;
    }

    public void setTtTipo(String ttTipo) {
        this.ttTipo = ttTipo;
    }

    public String getTtNombretour() {
        return ttNombretour;
    }

    public void setTtNombretour(String ttNombretour) {
        this.ttNombretour = ttNombretour;
    }

    public String getTtPais() {
        return ttPais;
    }

    public void setTtPais(String ttPais) {
        this.ttPais = ttPais;
    }

    public Collection<Tour> getTourCollection() {
        return tourCollection;
    }

    public void setTourCollection(Collection<Tour> tourCollection) {
        this.tourCollection = tourCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttCodigo != null ? ttCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTour)) {
            return false;
        }
        TipoTour other = (TipoTour) object;
        if ((this.ttCodigo == null && other.ttCodigo != null) || (this.ttCodigo != null && !this.ttCodigo.equals(other.ttCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariangel.administracion_tarea.Model.TipoTour[ ttCodigo=" + ttCodigo + " ]";
    }
    
}
