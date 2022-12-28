/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.ConversorDeTemperatura.Service;

import org.springframework.stereotype.Service;

/**
 *
 * @author flopy
 */
@Service
public class ConversorService implements IConversorService {
    @Override
    public long FahrenheitaCelsius(long f){
        return (f-32)*5/9;
    }
    
    @Override
    public long CelsiusaFahrenheit(long c){
        return c*9/5 + 32;
    }
}
