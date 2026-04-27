package com.example.rpl;

public class Vehicle extends VehicleBase implements Parkable {
    private int vehicleId;

    public Vehicle(int vehicleId, String plateNumber) {
        super(plateNumber);
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId + ", Plate: " + plateNumber);
    }

    @Override
    public void park(ParkingSlot slot) {
        slot.setStatus("OCCUPIED");
    }
}