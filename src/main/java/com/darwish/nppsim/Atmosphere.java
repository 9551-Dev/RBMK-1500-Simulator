package com.darwish.nppsim;

public class Atmosphere extends WaterSteamComponent implements Connectable {

    public Atmosphere(double waterTemp) {
        waterTemperature = waterTemp;
    }

    @Override
    public double getSteamDensity() {
        
        return 0;
    }

    @Override
    public void updateSteamOutflow(double flow, double tempC) {
        
        
    }

    @Override
    public void updateWaterInflow(double flow, double tempC) {
        
        
    }

    @Override
    public double getWaterDensity() {
        return 0.00100094;
    }

    @Override
    public double getSteamMass() {
        
        return 0;
    }

    @Override
    public double getSteamVolume() {
        
        return 0;
    }

    @Override
    public void updateSteamInflow(double flow, double tempC) {
        
        
    }

    @Override
    public void updateWaterOutflow(double flow, double tempC) {
        
        
    }

    @Override
    public double getWaterMass() {
        return 100000000000.0;
    }
}