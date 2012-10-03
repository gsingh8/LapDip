/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Gautam
 */
public class JOptionOutputStrategy implements MessageOutputStrategy{

    Message message;
    
    public void produceMessage(Message message) {
        JOptionPane.showMessageDialog(null,message.getMessage());
    
    }
    
}
