package com.example.rpl;

public class ParkingEntry {
    private int entryId;
    private Vehicle vehicle;
    private Ticket ticket;
    private Gate gate;

    public ParkingEntry(int entryId, Vehicle vehicle, Gate gate) {
        this.entryId = entryId;
        this.vehicle = vehicle;
        this.gate = gate;
    }

    public int getEntryId() {
        return entryId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void generateTicket() {
        this.ticket = new Ticket(entryId, "TICKET" + entryId);
    }
}
