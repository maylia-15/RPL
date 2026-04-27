package com.example.rpl;

public class Gate {
    private int gateId;
    private String gateType;

    public Gate(int gateId, String gateType) {
        this.gateId = gateId;
        this.gateType = gateType;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }
}
