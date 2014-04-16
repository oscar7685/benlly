/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udec.model.filtros;

import com.udec.model.wraperModels.FakeSensor;
import com.udec.model.wraperModels.WraperSensorAnalogo;

/**
 *
 * @author windows7
 */
public class FiltroAnalogoVelocidad extends FiltroAnalogo implements InterfaceFiltroVelocidad{

    @Override
    public float getVelocidad() {
        return super.getVehiculo().getRadioRueda()*this.getVelocidadAngular();
    }

    private float getVelocidadAngular() {
        return this.getFrecuenciaDeGiro()*2.0f*((float)Math.PI);
    }

    private float getFrecuenciaDeGiro() {
        FakeSensor sensor = (FakeSensor) this.getSensor();
        return this.getFrecuenciaDeEntrada()/sensor.getDivisorDeFrecuenciaVelocidad();
    }

    @Override
    public float getValor() {
        return this.getVelocidad();
    }
    
}
