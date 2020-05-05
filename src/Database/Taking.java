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
public class Taking {
    
    private String cNum;
    private String ID;
    
    public Taking(String cNum, String ID){
    
    this.cNum = cNum;
    this.ID = ID;
    }
    
    public String getSid(String ID){
       String sId = "1";
       if(ID.equals("12345")){
           sId = "2";
       }else if(ID.equals("123456")){
           sId = "3";
       }
       return sId;
    }
    
    public boolean checkId (String ID){
        return this.ID.equals(ID);
    }
    
    public String getCnum (){
        return this.cNum;
    }
    
}
