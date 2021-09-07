package Entries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Passenger {
    private String name;
    private boolean gender;
    private int age;
    private Ticket[] list;

    public Passenger() {
    }
    public Passenger(String name, boolean gender, int age, Ticket[] list) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.list = list;
    }

//    public static Passenger parseFromString(String str) {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ticket[] getList() {
        return list;
    }

    public void setList(Ticket[] list) {
        this.list = list;
    }

    public int getPassengerSumPrice(){
        int sum = 0;
        for(int i =0; i <list.length; i++){
            sum = sum + list[i].getTicketPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "\n" + "Passenger{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", list=" + Arrays.toString(list) +
                ", sumPrice=" + getPassengerSumPrice() +
                '}' + "\n";
    }
}
