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


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginSignup {
   private ArrayList<Admin> admins;
    private ArrayList<Passenger> passenger;
    private ArrayList<Bus> busses = new ArrayList<>();
    private  ArrayList<Ticket> tickets;
    Bus b;
    Ticket T;
    Admin a;
    Passenger p;
private boolean exist;

   
    //Manage passenger account

Passenger removePassenger(ArrayList<Passenger> passenger, int ID){
for(int i = 0 ; i < passenger.size(); i++){
if(passenger.get(i).getPassengerID() == ID)
    passenger.remove(i);
}
return null;
}
      boolean searchPassenger(ArrayList<Passenger> passengers,String mail, String pw){
    for(int i = 0; i < passengers.size(); i++){
if(passengers.get(i).getMail().equals(mail) && passengers.get(i).GetUserPW().equals(pw)){
exist = true;
break;
}else{
exist = false;
}
    }
    return exist;
      }
      
public Passenger getPassenger(ArrayList<Passenger> passengers,String mail, String pw){
    for(int i = 0; i < passengers.size(); i++){
if(passengers.get(i).getMail().equals(mail) && passengers.get(i).GetUserPW().equals(pw)){
p = passengers.get(i);
break;
}
}
return p;
}
// Manage Admin
Admin removeAdmin( ArrayList<Admin> admins, int adminID){
for(int i = 0 ; i < admins.size(); i++){
if(admins.get(i).getAdminId() == adminID)
    admins.remove(i);

}
return null;
}
 boolean searchAdmin(ArrayList<Admin> admins,String mail, String pw){
    for(int i = 0; i < admins.size(); i++){
if(admins.get(i).getMail().equals(mail) && admins.get(i).GetAdminPW().equals(pw)){
exist = true;
break;
}else{
exist = false;
}
}
return exist;
}
public Admin getAdmin(ArrayList<Admin> admins, int adminID){
  for(int i = 0; i < admins.size(); i++){
if(admins.get(i).getAdminId() == adminID){
a = admins.get(i);
break;
}
}
return a;
}
//Manage Bus
Bus removeBus( ArrayList<Bus> buss,int busID){
for(int i = 0 ; i < buss.size(); i++){
if(buss.get(i).getBusId() ==busID)
    buss.remove(i);
}
return null;
}
 boolean searchBus(ArrayList<Bus> buss,int busID){
    for(int i = 0; i < buss.size(); i++){
if(buss.get(i).getBusId() ==busID){
exist = true;
break;
}else{
exist = false;
}
}
return exist;
}



//Manage Tickets
boolean checkBus(ArrayList<Bus> buss,String Destination,String Source,String date){
    for(int i = 0; i < buss.size(); i++){
if(buss.get(i).getSource().equals(Source)&& buss.get(i).getDestination().equals(Destination) && buss.get(i).getDate().equals(date) ){
exist = true;
break;
}else{
    
exist = false;
}
}
  
return exist;
}
public ArrayList<Bus> getBus(ArrayList<Bus> buss,String Destination,String Source, String date){
   
    for(int i = 0; i < buss.size(); i++){
if(buss.get(i).getSource().equals(Source)&& buss.get(i).getDestination().equals(Destination)&& buss.get(i).getDate().equals(date)){
busses.add(buss.get(i));
}
}
return busses;
}
public Bus findBus(ArrayList<Bus> buss, int busID){
  for(int i = 0; i < buss.size(); i++){
if(buss.get(i).getBusId() == busID){
b = buss.get(i);
break;
}
}
return b;
}
public Ticket getPassengerTicket(ArrayList<Ticket> tickets,int passengerID,int ticketID){
  for(int i = 0; i < tickets.size(); i++){
if(tickets.get(i).getTicketID() == ticketID && tickets.get(i).getpID() == passengerID){
T = tickets.get(i);
break;
}
}
    return T;
}
Ticket removeTicket( ArrayList<Ticket> tickets,int ticketID){
for(int i = 0 ; i < tickets.size(); i++){
if(tickets.get(i).getTicketID() ==ticketID)
    tickets.remove(i);
}
return null;
}
 boolean searchTicket(ArrayList<Ticket> tickets,int ticketID){
    for(int i = 0; i < tickets.size(); i++){
if(tickets.get(i).getTicketID() == ticketID){
exist = true;
break;
}else{
exist = false;
}
}
return exist;
}
boolean passengerTicket(ArrayList<Ticket> tickets , int passengerID, int ticketID){
for(int i = 0; i < tickets.size();i++){
    if(passengerID == tickets.get(i).getpID() && ticketID == tickets.get(i).getTicketID()){
exist = true;
break;
}else{
exist = false;
}
}
return exist;
}
public void viewTickets(ArrayList<Ticket> tickets , int passengerID){
for(int i = 0; i < tickets.size();i++){
    if(passengerID == tickets.get(i).getpID())
        System.out.println(tickets.get(i));
   
        }
}
}
