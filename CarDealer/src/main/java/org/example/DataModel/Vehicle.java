package org.example.DataModel;

import org.example.Type;

public class Vehicle {
        private int vinNumber;
        private int year;
        private String make;
        private String model;
        private Type type;
        private String color;
        private int odometerReading;
        private double price;

        public Vehicle(int vinNumber, int year, String make, String model, Type type,
                       String color, int odometerReading, double price) {
            this.vinNumber = vinNumber;
            this.year = year;
            this.make = make;
            this.model = model;
            this. type = type;
            this.color = color;
            this.odometerReading = odometerReading;
            this.price = price;

        }
        public Vehicle(){

        }

        // <editor-fold desc="getters and setters">
    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // </editor-fold>
    

}
