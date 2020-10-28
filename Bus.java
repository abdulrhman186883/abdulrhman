/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

/**
 *
 * @author DELL
 */


import java.io.Serializable;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Bus implements Serializable {
    private int BusId;
    private String WorkingTimes;
    private int totalFare;
    private String date;
    private String Bus_lic;
    int[] seats = new int[20]; 
   private static int numberOfTickets = 0;
   busRoute route;

    
    
        public Bus() {
        this.BusId = 0;
        this.date = "";
        this.WorkingTimes = " ";
        this.route = new busRoute();
        seats[0] = 1;
    }
      public Bus(int Bus_ID, String Bus_lic) {
        this.BusId = Bus_ID;
        this.Bus_lic = Bus_lic;
    }

        public Bus(int BusId,String WorkingTimes,String date,String origin, String destination, int distance) {
        this.BusId = BusId;
        this.WorkingTimes = WorkingTimes;
        this.date = date;
        this.route = new busRoute( origin,  destination,  distance);
    seats[0] = 1;
        }
    public int getBusId() {
        return BusId;
    }
    public void setBusId(int BusId) {
        this.BusId = BusId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWorkingTimes() {
        return WorkingTimes;
    }

    public void setWorkingTimes(String WorkingTimes) {
        this.WorkingTimes = WorkingTimes;
    }
    public String getSource(){
    return route.getOrigin();
    
    }
    public String getDestination(){
    
    return route.getDestination();
    }
    public int getFare(){
    return route.getFare();
    }
    public void bookSeats(int seatNum){
        try{
     seats[seatNum - 1] = 1;
     numberOfTickets++;
        }catch(ArrayIndexOutOfBoundsException e ){
        JOptionPane.showMessageDialog(null, "Invalid Seat", "Alert!", JOptionPane.ERROR_MESSAGE);
        } 
    }
     public boolean checkSeats(int seatNum){
    if(seats[seatNum - 1] == 0){
     return true;
    }
    else{
     return false;   
    }
     }
    public void unBookSeat(int seatNum){
    seats[seatNum - 1] = 0;
    }
    
    public void summaryStatus(){
    totalFare = numberOfTickets * route.getFare();
        System.out.println("Total fare is: " + totalFare + "\n");
        System.out.println("Number of booked seats is: " + numberOfTickets + "\n");
    }
    void setNewRoute(String origin, String destination, int distance){
    this.route = new busRoute( origin,  destination,  distance);
    }
    void setNewDestination(String destination){
    this.route.setDestination(destination);
    }
    void setNewOrigin(String OG){
    this.route.setOrigin(OG);
    } 
     void setNewDistance(int distance){
    this.route.setDistance(distance);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bus other = (Bus) obj;
        if (!Objects.equals(this.WorkingTimes, other.WorkingTimes)) {
            return false;
        }
        if (!Objects.equals(this.route, other.route)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BUS{" + "BusId=" + BusId + ", WorkingTimes=" + WorkingTimes + ", totalFare=" + totalFare + ", route=" + route + '}';
    }

 
 


}


