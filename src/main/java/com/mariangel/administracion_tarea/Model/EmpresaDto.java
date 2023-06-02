/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mariangel.administracion_tarea.Model;

import java.time.LocalDate;
import java.time.ZoneId;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Mariangel
 */
public class EmpresaDto {

    public SimpleStringProperty emNombre;
    public SimpleStringProperty emCedulajuridica;
    public SimpleStringProperty emTelefono;
    public SimpleStringProperty emCorreo;
    public SimpleStringProperty emCalificacion;
    public ObjectProperty<LocalDate> emFechafundacion;

    public EmpresaDto() {

        this.emNombre = new SimpleStringProperty();
        this.emCedulajuridica = new SimpleStringProperty();
        this.emTelefono = new SimpleStringProperty();
        this.emCorreo = new SimpleStringProperty();
        this.emCalificacion = new SimpleStringProperty();
        this.emFechafundacion = new SimpleObjectProperty();
    }

    public EmpresaDto(Empresa empresa) {
        this();
        this.emNombre.set(empresa.getEmNombre());
        this.emCedulajuridica.set(empresa.getEmCedulajuridica());
        this.emCalificacion.set(Long.toString(empresa.getEmCalificacion()));
        this.emCorreo.set(empresa.getEmCorreo());
        this.emFechafundacion.set(empresa.getEmFechafundacion().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }

    public void setEmpresaNombre(String pacNombre) {
        this.emNombre.set(pacNombre);
    }

    public String getEmpresaNombre() {
        return emNombre.get();
    }

    public String getEmpresaCedJuridica() {
        return emCedulajuridica.get();
    }

    public void setEmpresaCedJuridica(Long pemCedulajuridica) {
        if (pemCedulajuridica != null) {
            this.emCedulajuridica.set(Long.toString(pemCedulajuridica));
        } else {
            this.emCedulajuridica.set(null);
        }
    }

    public String getEmpresCalificacion() {
        return emCalificacion.get();
    }

    public void setEmpresCalificacion(Long pemCalificacion) {
        if (pemCalificacion != null) {
            this.emCedulajuridica.set(Long.toString(pemCalificacion));
        } else {
            this.emCedulajuridica.set(null);
        }
    }

    public void setEmpresaCorreo(String pemCorreo) {
        this.emCorreo.set(pemCorreo);
    }

    public String getEmpresaCorreo() {
        return emCorreo.get();
    }

    public void setEmpresaFechafundacion(LocalDate pemFechafundacion) {
        this.emFechafundacion.set(pemFechafundacion);
    }

    public LocalDate getEmpresaFechafundacion() {
        return emFechafundacion.get();
    }

}
