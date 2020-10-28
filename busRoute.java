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

public class busRoute implements Serializable {
    private String origin;
    private String destination;
    private int distance;
    private int fare;

     public busRoute() {
        this.origin = " ";
        this.destination = " ";
        this.distance = 0;
    }
      public busRoute(String origin, String destination, int distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.fare = distance * 5;
    }
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFare() {
        fare = this.distance * 5;
        return fare;
    }

    public void setFare() {
        fare = distance * 5;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return  "origin=" + origin + ", destination=" + destination + ", distance=" + distance + ", fare=" + fare + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final busRoute other = (busRoute) obj;
        if (!Objects.equals(this.destination, other.destination)) {
            return false;
        }
        return true;
    }

 
   
    
}
