/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariangel.administracion_tarea.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "TBL_RESERVAS")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByRsId", query = "SELECT r FROM Reserva r WHERE r.rsId = :rsId"),
    @NamedQuery(name = "Reserva.findByRsFechareserva", query = "SELECT r FROM Reserva r WHERE r.rsFechareserva = :rsFechareserva"),
    @NamedQuery(name = "Reserva.findByRsMontoabonado", query = "SELECT r FROM Reserva r WHERE r.rsMontoabonado = :rsMontoabonado")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RS_ID")
    private Integer rsId;
    @Basic(optional = false)
    @Column(name = "RS_FECHARESERVA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rsFechareserva;
    @Basic(optional = false)
    @Column(name = "RS_MONTOABONADO")
    private int rsMontoabonado;
    @JoinColumn(name = "RS_CEDULACLIENTE", referencedColumnName = "CLT_CEDULA")
    @ManyToOne(optional = false)
    private Cliente rsCedulacliente;
    @JoinColumn(name = "RS_CODIGOTOUR", referencedColumnName = "TRS_CODIGOTOUR")
    @ManyToOne(optional = false)
    private Tour rsCodigotour;

    public Reserva() {
    }

    public Reserva(Integer rsId) {
        this.rsId = rsId;
    }

    public Reserva(Integer rsId, Date rsFechareserva, int rsMontoabonado) {
        this.rsId = rsId;
        this.rsFechareserva = rsFechareserva;
        this.rsMontoabonado = rsMontoabonado;
    }

    public Integer getRsId() {
        return rsId;
    }

    public void setRsId(Integer rsId) {
        this.rsId = rsId;
    }

    public Date getRsFechareserva() {
        return rsFechareserva;
    }

    public void setRsFechareserva(Date rsFechareserva) {
        this.rsFechareserva = rsFechareserva;
    }

    public int getRsMontoabonado() {
        return rsMontoabonado;
    }

    public void setRsMontoabonado(int rsMontoabonado) {
        this.rsMontoabonado = rsMontoabonado;
    }

    public Cliente getRsCedulacliente() {
        return rsCedulacliente;
    }

    public void setRsCedulacliente(Cliente rsCedulacliente) {
        this.rsCedulacliente = rsCedulacliente;
    }

    public Tour getRsCodigotour() {
        return rsCodigotour;
    }

    public void setRsCodigotour(Tour rsCodigotour) {
        this.rsCodigotour = rsCodigotour;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rsId != null ? rsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.rsId == null && other.rsId != null) || (this.rsId != null && !this.rsId.equals(other.rsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mariangel.administracion_tarea.Model.Reserva[ rsId=" + rsId + " ]";
    }
    
}
