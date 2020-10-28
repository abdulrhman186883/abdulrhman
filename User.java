/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.io.Serializable;

/**
 *
 * @author DELL
 */


public class User implements Serializable{
     private String name;
    private int age;
    private String number;
    private String mail;
    private boolean passCheck;
    public User() {
        this.name = " ";
        this.age = 0;
        this.number = " ";
        this.mail = " ";
    }

    public User(String name, int age, String number, String mail) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public String getMail() {
        return mail;
    }
public boolean email_checker(String email){
    
     
     for (int i =0;i<email.length();i++){
         if (email.charAt(i)== '@'){
     passCheck = true;
     break;
         }
         else{
          System.out.println("your email is not right ");
          passCheck = false;
         }
         }
       return passCheck;
}
 public boolean password_checker(String password){
 if( password.length()<=7){
    
       System.out.println("Your passWord is very short please Enter your passWord again");
       passCheck = false;
       
   }
 else {
       System.out.println("Your passWord is accepted ");
       passCheck = true;
   }
 return passCheck;
}
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + ", number=" + number + ", mail=" + mail + '}';
    }
    
}

