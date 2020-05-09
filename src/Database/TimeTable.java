/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    
    public String getHours(TimeTable timeTable) throws ParseException{
        
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        Date date1 = format.parse(this.time);

        Date date2 = format.parse(timeTable.getTime());

        long millis = date2.getTime() - date1.getTime(); 
        int hours = (int) (millis/(1000 * 60 * 60));
        int mins = (int) ((millis/(1000*60)) % 60);

        String diff = hours + ":" + mins; 
        
        return diff;
    }
}
