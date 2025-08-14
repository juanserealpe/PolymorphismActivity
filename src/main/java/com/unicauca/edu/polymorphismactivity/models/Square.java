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
public class Square extends Figure{
    
    public Square(double prmX1, double prmY1) {
        super(prmX1, prmY1);
    }
    
    @Override
    public double calculateArea() {
        return  getX1()*getY1();
    }

    @Override
    public double calculatePerimeter() {
        return 2*(getX1()+getY1());
    }
}
