/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;


/**
 *
 * @author Gautam
 */

public interface TipCalculatorStrategy {
    
    public abstract double getTip();
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
}
