package com.cbfacademy.cars;

// Car.getMake()

// Car mycar = new Car()

// Car.make
// mycar.getMake()

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    // public int hashCode() {
    //     return 5;
    // }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public String getDetails() {
        return String.format("%s %s %s (%d)", colour, make, model, year);
    }
}