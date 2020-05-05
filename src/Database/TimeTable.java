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
public class TimeTable {
    private String lastName;
    private String firstName;
    private String date;
    private String time;
    
    public TimeTable(String firstName, String lastName, String date,String time){
    
    this.lastName = lastName;
    this.firstName = firstName;
    this.date = date;
    this.time = time;
    }
    
    public boolean checkDate(String date){
       
        return this.date.equals(date);
    }
    public String getFirst(){
        return this.firstName;
    }
    public String getLast(){
        return this.lastName;
    }
    public String getDate(){
        return this.date;
    }
    public String getTime(){
        return this.time;
    }
}
