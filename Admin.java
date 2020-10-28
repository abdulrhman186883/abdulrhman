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




    public class Admin extends User implements Serializable {
    
    private String AdminPW;
    private  int adminId;
    private int WH;//Working hours
     public Admin() {
        super();
        this.AdminPW=" ";
    }
    
    public Admin(String name, int age, String Number, String Email,String AdminPW, int adminId,  int WH) {
        super(name, age, Number, Email);
        this.AdminPW=AdminPW;
        this.adminId = adminId;
        this.WH = WH;
    }
    //////////////////////////
    //////////SETER///////////
    public void SetAdminPW(String AdminPW){
    this.AdminPW=AdminPW;
    }

    public  void setAdminId(int adminId) {
        this.adminId = adminId;
    }
  
     public void SetWH(int WH){
    this.WH=WH;
    }
    /////////////////////////
    //////////GETER//////////
    public String GetAdminPW(){
    return AdminPW;
    }

    public  int getAdminId() {
        return adminId;
    }
     public int GetWH(){
    return WH;
    }

    @Override
    public String toString() {
        return "Admin{" + "AdminPW=" + AdminPW + ", adminId=" + adminId + ", WH=" + WH + '}' + super.toString();
    }

     
}

