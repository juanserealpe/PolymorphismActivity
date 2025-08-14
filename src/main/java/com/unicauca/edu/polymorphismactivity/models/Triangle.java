/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.edu.polymorphismactivity.models;



/**
 *
 * @author juans
 * @author alexp
 */
public class Triangle extends Figure{
    
    private double z1;
    
    public Triangle(double base, double height, double sideC) {
    super(base, height); 
        this.z1 = sideC;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }
    
    @Override
    public double calculateArea() {
        return  (getX1()*getY1())/2;
    }

    @Override
    public double calculatePerimeter() {
        return getX1()+ getY1() + getZ1();
    }
}
