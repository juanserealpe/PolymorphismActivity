/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.edu.polymorphismactivity.models;

import com.unicauca.edu.polymorphismactivity.interfaces.IFigure;

/**
 *
 * @author juans
 * @author alexp
 */
public abstract class Figure implements IFigure{

    private double x1;
    private double y1;
    
    public Figure(double prmX1, double prmY1) {
        this.x1 = prmX1;
        this.y1 = prmY1;
    }

    public Figure() {
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }
    
    @Override
    public double calculateArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculatePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
