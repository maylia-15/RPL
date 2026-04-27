package com.example.rpl;

public class Ticket {
    private int ticketId;
    private String ticketCode;

    public Ticket(int ticketId, String ticketCode) {
        this.ticketId = ticketId;
        this.ticketCode = ticketCode;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public void printTicket() {
        System.out.println("Ticket Code: " + ticketCode);
    }
}