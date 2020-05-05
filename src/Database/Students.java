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
public class Students {
    
    private String ID;
    private String lastName;
    private String firstName;
    
    public Students(String ID, String lastName, String firstName){
    this.ID = ID;
    this.lastName = lastName;
    this.firstName = firstName;
    }
    
    public String getLast(){
        return this.lastName;
    }
    
    public String getFirst(){
        
        return this.firstName;
    }
    
    public Boolean checkID(String ID){
        boolean check = false;
        if(this.ID.equals(ID)){
            check = true;
        }
        return check;
    }
    
}
