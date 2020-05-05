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
public class TuePresent {
    
    private String lastName;
    private String firstName;
    
    public TuePresent(String firstName, String lastName){
    
    this.lastName = lastName;
    this.firstName = firstName;
    }
    
    public boolean checkName(String firstName, String lastName){
        return (this.firstName.equals(firstName) && this.lastName.equals(lastName));
    }
    public String getFirst(){
        return this.firstName;
    }
    public String getLast(){
        return this.lastName;
    }
    
}
