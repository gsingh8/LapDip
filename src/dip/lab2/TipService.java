/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Gautam
 * 
 */

     
public class TipService {
          
    private TipCalculatorStrategy TipStrategy;
    
    public double getTip(){
        
        return TipStrategy.getTip();
    }
   
    // setService allows for different tipping services 
    // to be passed into the service
    public void setService(TipCalculatorStrategy service){
        TipStrategy = service;
    }
}
