/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Gautam
 */
public class StartUp {
    
    public static void main(String args[]){
        MessageInputStrategy in = new RandomMessageInputStrategy();
        MessageOutputStrategy out = new JOptionOutputStrategy();

        MessageService service = new MessageService(in,out);

        service.produceMessage();
    }    
}
