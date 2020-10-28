/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author compu magic
 */
public class AccModify {
    String Email;
    String Name;
    String phonenum;
    String PassWord;

   AccModify(){
    
}
   
    AccModify(String data) {
        String[] dataArr = data.split(",");
        this.Email = dataArr[0];
        this.Name = dataArr[1];
        this.phonenum = dataArr[2];
        this.PassWord = dataArr[3];
    }


    public AccModify(String Email, String Name, String phonenum, String PassWord) {
        this.Email = Email;
        this.Name = Name;
        this.phonenum = phonenum;
        this.PassWord = PassWord;
    }

    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }
    

    

   public static void main(String args[]) throws IOException {  
         ArrayList<AccModify> T = new ArrayList<AccModify> ();
        T.add(new AccModify ("yousef@mail.com","Yousef","010101010","1234"));
        T.add(new AccModify ("ahmed@mail.com","Ahmed","011234556","2345"));
        T.add(new AccModify ("ali@mail.com","Ali","01345678","09876"));
        T.add(new AccModify ("hamed@mail.com","hamed","0123455","0000"));

//FileWriter writer = new FileWriter("output.txt");

    FileOutputStream s = new FileOutputStream("UserData.txt"); //("//C:/Products_a.txt")
       DataOutputStream out = new DataOutputStream(s);

        //for (int i=0; i<T.size(); i++)
                for (AccModify t:T)
        {
           //Ticket t=T.get(i);
           out.writeUTF(t.getEmail());
           out.writeUTF(t.getName());
           out.writeUTF(t.getPhonenum());
           out.writeUTF(t.getPassWord());
         

        }   
                   //writer.close();   
        s.close();
        out.close();
//      =============================================
              
    FileInputStream s2 = new FileInputStream("UserData.txt");
        DataInputStream in = new DataInputStream(s2);
        try {
            while (true) {
                 String Email = in.readUTF();
                String Name = in.readUTF(); 
                String phonenum = in.readUTF();
                 String PassWord = in.readUTF();
                System.out.println(Email + " " +  Name + " " + phonenum +" "+PassWord);
                  }
        } catch (EOFException e) {
            //System.out.println(e.getMessage());
        }
        s2.close();
}
}
