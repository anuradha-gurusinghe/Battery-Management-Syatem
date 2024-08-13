/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.batterymanagementsystem.controller;

import com.mycompany.batterymanagementsystem.model.CellVoltageModel;

/**
 *
 * @author HP 15 - CS1032TX
 */
public class CellVoltageController {
    
    public CellVoltageModel calculateCellVoltage(double maxVoltage, double minVoltage){
        CellVoltageModel model = new CellVoltageModel();
        model.setMaxVoltage(maxVoltage);
        model.setMinVoltage(minVoltage);
        model.setVoltageDiffrence(maxVoltage - minVoltage);
        return model;
    }
    
}
