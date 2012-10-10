/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Gautam
 */
public class Message implements MessageInterface{
    
    private String message;
    
    public Message(String message){
        this.message = message;
    }
    
    public String getMessage() {  
        return this.message;
    }
}
