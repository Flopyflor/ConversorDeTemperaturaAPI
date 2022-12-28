/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.ConversorDeTemperatura.Controller;

import com.allamiflorencia.ConversorDeTemperatura.Service.IConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author flopy
 */
@RestController
public class ConversorController {
    @Autowired
    private IConversorService conversor;
    
    @GetMapping ("/convertir/fahrenheit_a_celsius/{f}")
    public long FaC(@PathVariable long f){
        return conversor.FahrenheitaCelsius(f);
    }
    
    @GetMapping ("/convertir/celsius_a_fahrenheit/{c}")
    public long CaF(@PathVariable long c){
        return conversor.CelsiusaFahrenheit(c);
    }
}
