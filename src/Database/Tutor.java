/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author chris
 */
public class Tutor {
    
    private String ID;
    
    public Tutor(String ID){
        this.ID = ID;
    }
    
    public Boolean checkID(String ID){
        boolean check = false;
        if(this.ID.equals(ID)){
            check = true;
        }
        return check;
    }
    
    public String getID(){
        return this.ID;
    }
    
}
