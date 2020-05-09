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
public class Course {
    private String num;
    private String name;
    
    public Course(String num, String name){
        this.num = num;
        this.name = name;
    }
    
    public boolean checkNum(String num){
        return this.num.equals(num);
    }
    
}
