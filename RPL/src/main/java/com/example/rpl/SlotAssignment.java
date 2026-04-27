package com.example.rpl;

public class SlotAssignment {
    private ParkingEntry entry;
    private ParkingSlot slot;
    private String assignedAt;

    public SlotAssignment(ParkingEntry entry, ParkingSlot slot, String assignedAt) {
        this.entry = entry;
        this.slot = slot;
        this.assignedAt = assignedAt;
    }

    public ParkingEntry getEntry() {
        return entry;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public String getAssignedAt() {
        return assignedAt;
    }

    public void assignSlot() {
        slot.setStatus("OCCUPIED");
        System.out.println("Slot assigned at: " + assignedAt);
    }
}