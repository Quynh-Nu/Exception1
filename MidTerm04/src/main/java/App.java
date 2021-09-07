import Entries.Passenger;
import Entries.Ticket;
import Utility.PassengerUtilities;
import Utility.TicketUtilities;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1 - Nhap vao 2 gia tri: so luong hanh khach va so ve toi da 1 hanh khach mua
        int noOfPassenger = scanner.nextInt();
        int noOfMaxTickets = scanner.nextInt();

        PassengerUtilities passengerUtilities = new PassengerUtilities();
        TicketUtilities ticketUtilities = new TicketUtilities();

        // Tao danh sach ngau nhien khach hang va so ve 1 khach hang mua
        List<Passenger> passengerList = passengerUtilities.generateRandomPassenger(noOfPassenger);
        ticketUtilities.generateRandomTicketsForPassenger(passengerList, noOfMaxTickets);

        // IN ra danh sach khach hang + so tien phai tra tuong ung voi 1 khach hang
        System.out.println("Passenger list before sorting : " + passengerList);
        //Setup ticket

        passengerUtilities.sortPassengerListBySumPrice(passengerList);
        System.out.println("Passengers list after sorting : " + passengerList);


    }
}
