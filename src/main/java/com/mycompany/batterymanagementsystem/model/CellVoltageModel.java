/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.batterymanagementsystem.model;

/**
 *
 * @author HP 15 - CS1032TX
 */
public class CellVoltageModel {
    private double minVoltage;
    private double maxVoltage;
    private double voltageDiffrence;

    public double getMinVoltage() {
        return minVoltage;
    }

    public void setMinVoltage(double minVoltage) {
        this.minVoltage = minVoltage;
    }

    public double getMaxVoltage() {
        return maxVoltage;
    }

    public void setMaxVoltage(double maxVoltage) {
        this.maxVoltage = maxVoltage;
    }

    public double getVoltageDiffrence() {
        return voltageDiffrence;
    }

    public void setVoltageDiffrence(double voltageDiffrence) {
        this.voltageDiffrence = voltageDiffrence;
    }
}
