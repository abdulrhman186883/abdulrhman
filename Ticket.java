/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */


public class Ticket implements Serializable{
   
private int ticketID;
private String date;
private String Time;
private int price;
private int childPrice;
private int seatNum;
private int passengerID;
private String Origin;
private String destination;
private int busID;
ArrayList<Ticket> tickets = new ArrayList<>();
Bus b;
Passenger p;
    public Ticket() {
        
    }

    public Ticket(int ticketID, String date, int price, int seatNum, int passengerID, String destination, String Origin,String Time,int busID) {
        this.ticketID = ticketID;
        this.date = date;
        this.price = price;
        this.seatNum = seatNum;
        this.passengerID = passengerID;
        this.destination = destination;
        this.Origin = Origin;
        this.Time = Time;
        this.busID = busID;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID() {
           try{
   FileInputStream fis = new FileInputStream("Tickets.txt");
                    ObjectInputStream ois = new ObjectInputStream(fis);
        tickets = (ArrayList<Ticket>) ois.readObject();
                    fis.close();
                    ois.close();
                    this.ticketID = tickets.size() + 400;
       }
    catch(IOException | ClassNotFoundException e){System.out.println(e);}
      
    }

    public int getPrice() {
        return price;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public String getDestination() {
        return destination;
    }





   

public String getDate() {
return date;
}


public int setPrice(int p) {
    price = p + 5;
return price;
}
public double getDiscount()
{
    return price - (price*(10/100));
}

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getpID() {
        return passengerID;
    }

    public void setpID(int passengerID) {
        this.passengerID = passengerID;
    }

public void setDestination(String dest){
this.destination = dest;
}
public int getChild()
        {
            if(p.getAge() <= 12)
                childPrice = (int) (price * 0.5);
            return childPrice;
        }



public void setDate(String date) {
this.date = date;
}


    @Override
    public String toString() {
        return "Ticket{" + "ticketID=" + ticketID + ", date=" + date + ", price=" + price + ", seatNum=" + seatNum + ", passengerID=" + passengerID + ", destination=" + destination + '}';
    }



}



