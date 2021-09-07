package Utility;

import Entries.Passenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PassengerUtilities {

    public List<Passenger> generateRandomPassenger(int n){
        List<Passenger> passengers = new ArrayList<>();  // khoi tao list chua passenger random ra
        for(int i = 0; i < n; i++){
            Passenger p = new Passenger("Passenger " + (i + 1) , i %2 == 0, (20 + i), null);
            passengers.add(p);
        }
        return passengers;
    }

    public void sortPassengerListBySumPrice(List<Passenger> passengers){
       for(int i = 0; i < passengers.size(); i++){
           for(int j = i +1; j < passengers.size(); j++){
               if(passengers.get(j).getPassengerSumPrice() > passengers.get(i).getPassengerSumPrice()){
                   Passenger passenger = passengers.get(i);
                   passengers.set(i, passengers.get(j));
                   passengers.set(j, passenger);
               }
           }
       }
    }
}
