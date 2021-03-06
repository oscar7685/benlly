/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.model.filtros;

import com.udec.benlly.Log;
import com.udec.benlly.Sensor;
import com.udec.benlly.Vehiculo;

/**
 *
 * @author windows7
 */
public abstract class Filtro {

    public static final float MINUTO = 60.0f;
    private Log lineaLog = null;
    private Vehiculo vehiculo = null;
    private Sensor sensor = null;

    public Filtro() {
    }

    public Filtro(Vehiculo vehiculo1, Log log, Sensor sensor){
        this.vehiculo = vehiculo1;
        this.lineaLog = log;
        this.sensor = sensor;
    }

    public Log getLog() {
        return lineaLog;
    }

    public void setLog(com.udec.benlly.Log log) {
        this.lineaLog = log;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
    public abstract float getValor();
}
