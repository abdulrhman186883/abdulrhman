/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */

public class Passenger extends User {
    private String UserPW;
    private int passengerID;
 public Passenger(){
        super();
        this.UserPW= " ";
        this.passengerID = 0;
    }
    public Passenger(String name, int age, String Number, String Email, String UserPW , int passengerID) {
        super(name, age, Number, Email);
        this.UserPW=UserPW;
        this.passengerID=passengerID;
    }
    //////////////////////////
    //////////SETER///////////
    public void SetUserPW(String UserPW){
    this.UserPW=UserPW;
    }
    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    } 
    /////////////////////////
    //////////GETER//////////
    public String GetUserPW(){
    return UserPW;
    }

    public int getPassengerID() {
        return passengerID;
    }
       public void EditPassenger(String name, int age,String Number, String Email, String UserPW , int passengerID) throws FileNotFoundException, IOException, ClassNotFoundException
       {
           try {
               ArrayList<Passenger> P = new ArrayList<Passenger> ();
        FileOutputStream s = new FileOutputStream("Passengers.txt"); 
       ObjectOutputStream out = new ObjectOutputStream(s);
       FileInputStream s2 = new FileInputStream("Passengers.txt");
        ObjectInputStream in = new ObjectInputStream(s2);
                P=(ArrayList<Passenger>) in.readObject();
       
                for (Passenger t:P)
        {
            if(passengerID == t.getPassengerID())
            {
                P.add(new Passenger (name, age, Number, Email, UserPW,passengerID));
            }
           //Ticket t=T.get(i);
          
           
     
        }
               out.writeObject(P);
           s.close();
           s2.close();
           out.close();
           in.close();  
         
        
               
           } catch (IOException | ClassNotFoundException k) {
           }
   
           

       }
public void delete(int x) throws FileNotFoundException, IOException, ClassNotFoundException{
          
           try {
                FileInputStream s2 = new FileInputStream("Passengers.txt");
        ObjectInputStream in = new ObjectInputStream(s2);
        ArrayList<Passenger>PP=new ArrayList<>();
               PP=(ArrayList<Passenger>) in.readObject();
               s2.close();
               in.close();
               for (Passenger p:PP) {
                   if(x == (p.getPassengerID()))
                       PP.remove(p);
                   else{
                       
                   }
               }
               FileOutputStream fos=new FileOutputStream ("Passengers.txt");
               ObjectOutputStream oo=new ObjectOutputStream(fos);
               oo.writeObject(PP);
               fos.close();
               oo.close();
           } catch (Exception e) {
           }
        
        
        
      
       }
    @Override
    public String toString() {
        return "Passenger{" + "UserPW=" + UserPW  + ", passengerID=" + passengerID + '}' + super.toString();
    }
    
}
