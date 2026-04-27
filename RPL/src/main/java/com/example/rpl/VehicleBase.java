package com.example.rpl;

public abstract class VehicleBase {
    protected String plateNumber;

    public VehicleBase(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public abstract void displayInfo();
}
