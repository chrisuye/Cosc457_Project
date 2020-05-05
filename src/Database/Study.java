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
public class Study {
    
    private String studyID;
    private String mathID;
    private String fName;
    private String lName;
    
    public Study(String studyID,String mathID,String fName,String lName){
        this.studyID = studyID;
        this.mathID = mathID;
        this.fName = fName;
        this.lName = lName;
    }
    
    public String getMath(){
        return this.mathID;
    }
    public String getFirst(){
        return this.fName;
    }
    public String getLast(){
        return this.lName;
    }
    public Boolean checkID(String studyID){
        boolean check = false;
        if(studyID.equals(this.studyID)){
            check = true;
        }
        return check;
    }
}
