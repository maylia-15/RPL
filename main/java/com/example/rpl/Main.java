package com.example.rpl;

public class Main {
    static void main() {

        ParkingArea area = new ParkingArea(1, "Area A");
        Gate gate = new Gate(1, "ENTRY");

        Vehicle vehicle = new Vehicle(1, "DA1234AB");

        ParkingEntry entry = new ParkingEntry(1, vehicle, gate);
        entry.generateTicket();

        ParkingSlot slot = new ParkingSlot(1, area);

        SlotAssignment assignment = new SlotAssignment(entry, slot, "10:01");
        assignment.assignSlot();

        vehicle.displayInfo();
        entry.getTicket().printTicket();

        System.out.println("Slot Status: " + slot.getStatus());
    }
}