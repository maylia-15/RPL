package com.example.rpl;

public class Main {
    static void main() {

        System.out.println("=======================================");
        System.out.println("     SIMULASI SISTEM PARKIR");
        System.out.println("=======================================\n");

        ParkingArea area = new ParkingArea(1, "Area A");
        Gate gate = new Gate(1, "ENTRY");

        Vehicle vehicle = new Vehicle(1, "DA1234AB");

        System.out.println("[1] Kendaraan Masuk");
        System.out.println("---------------------------------------");
        System.out.println("Vehicle ID    : " + vehicle.getVehicleId());
        System.out.println("Plate Number  : " + vehicle.getPlateNumber());
        System.out.println("Gate          : " + gate.getGateType());
        System.out.println();

        ParkingEntry entry = new ParkingEntry(1, vehicle, gate);
        entry.generateTicket();

        System.out.println("[2] Tiket Dibuat");
        System.out.println("---------------------------------------");
        System.out.println("Ticket Code   : " + entry.getTicket().getTicketCode());
        System.out.println();

        ParkingSlot slot = new ParkingSlot(1, area);

        System.out.println("[3] Slot Tersedia");
        System.out.println("---------------------------------------");
        System.out.println("Slot ID       : " + slot.getSlotId());
        System.out.println("Area          : " + area.getAreaName());
        System.out.println("Status        : " + slot.getStatus());
        System.out.println();

        SlotAssignment assignment = new SlotAssignment(entry, slot, "10:01");
        assignment.assignSlot();

        System.out.println("[4] Slot Dialokasikan");
        System.out.println("---------------------------------------");
        System.out.println("Assigned Time : " + assignment.getAssignedAt());
        System.out.println("Status Slot   : " + slot.getStatus());
        System.out.println();

        System.out.println("=======================================");
        System.out.println("            RINGKASAN");
        System.out.println("=======================================");
        System.out.println("Kendaraan   : " + vehicle.getPlateNumber());
        System.out.println("Tiket       : " + entry.getTicket().getTicketCode());
        System.out.println("Slot Status : " + slot.getStatus());
        System.out.println("=======================================");

    }
}