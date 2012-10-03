/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Gautam
 */
public class GoodMorningInputStrategy implements MessageInputStrategy{
    private static final String MSG = "Good morning!";
    public Message getMessage(){
        Message msg = new Message(MSG);
       // msg.setMessage("Good Morning");
        return msg;
    }
    
    
}
