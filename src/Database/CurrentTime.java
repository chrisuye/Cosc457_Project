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
    
    private LocalDateTime date = LocalDateTime.now();
       
    private DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    private DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    private String formattedDate = date.format(formatDate);
    private String formattedTime = date.format(formatTime);
    
    public CurrentTime(){}
    
    public String getTime(){
        return formattedTime;
    }
    
    public String getDate(){
        return formattedDate;
    }
    
}
