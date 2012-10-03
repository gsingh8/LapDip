/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Random;

/**
 *
 * @author Gautam
 */
public class RandomMessageInputStrategy implements MessageInputStrategy{
       
    private Message[] randomMessages = {
        new Message("Hello World"),
        new Message("Hello Java"),
        new Message("I love Advanced Java")
    };
    
    public Message getMessage(){
        Random r = new Random(System.nanoTime());
        int index = r.nextInt(randomMessages.length-1);
        return randomMessages[index];
    }
}
