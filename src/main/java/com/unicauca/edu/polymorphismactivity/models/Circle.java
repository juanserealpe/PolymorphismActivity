/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.edu.polymorphismactivity.models;

import com.unicauca.edu.polymorphismactivity.interfaces.ICircle;



/**
 *
 * @author juans
 * @author alexp
 */
public class Circle extends Figure implements ICircle {

    private float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    public Circle(double semiMajorAxis, double semiMinorAxis) {
        super(semiMajorAxis, semiMinorAxis);
    }

    @Override
    public double calculateArea() {
        if (radius > 0) {
            return Math.PI * radius * radius;
        }
        return Math.PI * getX1() * getY1();
    }

    @Override
    public double calculatePerimeter() {
        if (radius > 0) {
            return 2 * Math.PI * radius;
        }
        double a = getX1();
        double b = getY1();
        return Math.PI * (3*(a+b) - Math.sqrt((3*a + b) * (a + 3*b)));
    }

    @Override
    public double calculateAreaWithRadious() {
        return Math.PI * radius * radius;
    }
}

