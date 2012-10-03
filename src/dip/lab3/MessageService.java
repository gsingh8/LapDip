/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Gautam
 */
public class MessageService {
    
    MessageInputStrategy input;
    MessageOutputStrategy output;
    
    public MessageService(MessageInputStrategy input, MessageOutputStrategy output){
        this.input = input;
        this.output = output;
    }
    
    public void produceMessage(){
        output.produceMessage(input.getMessage());
    }
    
    
}
