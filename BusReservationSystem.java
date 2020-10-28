/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class BusReservationSystem {

   /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
    WelcomePage welcome = new WelcomePage();
    Passenger p1 = new Passenger("Kareem Abed", 20, "01131297465", "user", "user", 101);
 Passenger p2 = new Passenger("Adham Zeyad", 19, "01276223948", "adham@mail.com", "123aa456",102);
  Passenger p3 = new Passenger("Hussein Khaled", 20, "01189776423", "kareem@mail.com", "123kk456",103);
   Admin A1 = new Admin("Admin", 30, "01278664098","admin@admin.com","admin",1, 5);
   Admin A2 = new Admin("Admin2", 29, "01165328976","admin2@admin.com","admin2",2,7);
      Admin A3 = new Admin("Admin3", 35, "01239887546","admin3@admin.com","admin3",3,6);
      Bus b1 = new Bus(201,"9;00 AM","25/05/2020","Rehab", "Nasr City", 10);
      Bus b2 = new Bus(202,"10;00 AM","28/05/2020","Shrouk", "Mohandseen", 8);
      Bus b3 = new Bus(203,"11;00 AM","29/05/2020","Madinaty", "Moktam", 5);
      Bus b4 = new Bus(204,"12;00 AM","28/05/2020","Rehab", "Nasr City",10 );
      Ticket t1 = new Ticket(401, "29/05/2020", 100, 1, 101, "Nasr City","Rehab","9:00 AM",201);
      ArrayList<Admin> admins = new ArrayList<>();
  ArrayList<Passenger> passengers = new ArrayList<>(); 
       ArrayList<Bus> bussAL = new ArrayList<>();
       ArrayList<Ticket> tickets = new ArrayList<>();
       tickets.add(t1);
       bussAL.add(b1);
       bussAL.add(b2);
       bussAL.add(b3);
       bussAL.add(b4);
         passengers.add(p1);
         passengers.add(p2);
         passengers.add(p3);
          admins.add(A1);
        admins.add(A2); 
        admins.add(A3);
        FileOutputStream pass = new FileOutputStream("Passengers.txt");
        ObjectOutputStream poos = new ObjectOutputStream(pass);
        poos.writeObject(passengers);
        pass.close();
        poos.close();
         FileOutputStream admin = new FileOutputStream("Admins.txt");
        ObjectOutputStream aoos = new ObjectOutputStream(admin);
        aoos.writeObject(admins);
        pass.close();
        aoos.close();
  FileOutputStream bo = new FileOutputStream("Busses.txt");
        ObjectOutputStream boos = new ObjectOutputStream(bo);
            boos.writeObject(bussAL);       
        bo.close();
        boos.close();
        FileOutputStream ticket = new FileOutputStream("Tickets.txt");
        ObjectOutputStream toos = new ObjectOutputStream(ticket);
        toos.writeObject(tickets);
        pass.close();
        toos.close();
    welcome.setVisible(true);
    
    }
    
}
