/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptimetable;

/**
 *
 * @author martynas
 */
public class Event {
    
    public String Ivykis[] = new String[100];
    
    public void setIvykis(int index, String event){
        Ivykis[index].equals(event);
        System.out.println(Ivykis[index]);
    }
}
