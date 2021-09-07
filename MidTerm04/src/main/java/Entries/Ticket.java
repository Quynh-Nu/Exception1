package Entries;

import java.time.LocalDateTime;

public class Ticket {
    private String flightName;
    private LocalDateTime flightDate;
    private int ticketPrice;

    //Constructors
    public Ticket() {
    }
    public Ticket(String flightName, LocalDateTime flightDate, int ticketPrice) {
        this.flightName = flightName;
        this.flightDate = flightDate;
        this.ticketPrice = ticketPrice;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public LocalDateTime getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDateTime flightDate) {
        this.flightDate = flightDate;
    }

    public int getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "flightName='" + flightName + '\'' +
                ", flightDate=" + flightDate +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}

