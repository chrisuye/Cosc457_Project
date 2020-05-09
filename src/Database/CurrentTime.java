/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author chris
 */
public class CurrentTime { 
    public CurrentTime(){}
    
    public String getTime(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    
     
        String formattedTime = date.format(formatTime);
        
        return formattedTime;
    }
    
    public String getDate(){
        LocalDateTime date = LocalDateTime.now();
       
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        
        String formattedDate = date.format(formatDate);
        
        return formattedDate;
    }
    
}
