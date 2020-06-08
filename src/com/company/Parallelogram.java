/*
 *
 * Classname Parallelogram
 *
 * Version from 07.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 */

package com.company;

import java.util.Objects;

public class Parallelogram {

    private int smallSide;
    private int bigSide;
    private double Angle;

    // 1. Constructor:
    // a) generate an empty constructor

    public Parallelogram() {
    }

    // b) generate the full constructor


    public Parallelogram(int smallside, int bigside, double angle) {
        this.smallSide = smallside;
        this.bigSide = bigside;
        this.Angle = angle;
    }

    // 2. Generate getters and setters

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public double getAngle() {
        return Angle;
    }

    public void setAngle(double angle) {
        Angle = angle;
    }


    // 3. Create 5 methods for parallelogram

    // a) Method for calculating the perimeter

    public double getPerimeter(){
        return 2 * (this.getSmallSide() + this.getBigSide());
    }

    // b) Method for calculating the area

    public double getArea(){
        return this.getSmallSide() * this.getBigSide() * Math.sin(this.getAngle());
    }

    // c) Method for calculating short diagonal

    public double getShortDiagonal (){
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() - 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    // d) Method for calculating long diagonal

    public double getLongDiagonal(){
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() + 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    // e) Method for checking if a parallelogram is rhombus

    public  boolean isRhombus(){
        return (this.getBigSide() == this.smallSide) ? true : false;
    }

    // 4. Override toString() method

    @Override
    public String toString() {
        return "Parallelogram { " +
                "smallSide = " + smallSide +
                ", bigSide = " + bigSide +
                ", Angle = " + Angle +
                ",\n Perimeter = " + this.getPerimeter() +
                ",\n Area = " + this.getArea() +
                ",\n Short Diagonal = " + this.getShortDiagonal() +
                ",\n Long Diagonal = " + this.getLongDiagonal() +
                ",\n It is a rhombus = " + this.isRhombus() +
                '}';
    }

    // 5. Override hash() and equals() methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return smallSide == that.smallSide &&
                bigSide == that.bigSide &&
                Double.compare(that.Angle, Angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(smallSide, bigSide, Angle);
    }
}
