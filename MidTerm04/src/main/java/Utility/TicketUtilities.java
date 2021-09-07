package Utility;

import Entries.Passenger;
import Entries.Ticket;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class TicketUtilities {
    public void generateRandomTicketsForPassenger(List<Passenger> passengers, int n){
        if(n > 5){
            System.out.println("Number too big. We can only generate less than 5 tickets for 1 passenger");
        }else{
            for(Passenger passenger : passengers) {
                Random random = new Random();
                Ticket[] tickets = new Ticket[random.nextInt(n)];
                for (int i = 0; i < tickets.length; i++) {
                    tickets[i] = generateRandomTicket();
                }
                passenger.setList(tickets);
            }
        }
    }

    private Ticket generateRandomTicket(){
        Random random = new Random();
        Ticket ticket = new Ticket("Flight " + Math.abs(random.nextInt(1000)) , LocalDateTime.now(),
                Math.abs(random.nextInt(100000)));
        return ticket;
    }

}
