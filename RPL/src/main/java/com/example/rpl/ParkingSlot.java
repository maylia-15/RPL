package com.example.rpl;

public class ParkingSlot {
    private int slotId;
    private String status;
    private ParkingArea area;

    public ParkingSlot(int slotId, ParkingArea area) {
        this.slotId = slotId;
        this.area = area;
        this.status = "AVAILABLE";
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ParkingArea getArea() {
        return area;
    }

    public void setArea(ParkingArea area) {
        this.area = area;
    }
}