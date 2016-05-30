/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicPkg;

import java.util.ArrayList;

/**
 *
 * @author ignacio
 */
public class AritmeticMedian {
    //Class atributes
    //Only needs the list for each element
    private final ArrayList<Double> list = new ArrayList();
    
    //Constructor: doesn't require anything
    public AritmeticMedian(){}
      
    //This reads the input directly from the textfield and parses it into a double
    private void readInput(ArrayList<String> pInput){
        list.clear();
        try{
            for(String data : pInput){
                double castable = Double.parseDouble(data);
                list.add(castable);
            }
        }
        catch(ArithmeticException e){}
    }
    
    //Returns the aritmetic median from the actual elements of the list
    public double calcMedian(ArrayList<String> pInput){
        readInput(pInput);
        double res = 0;
        for(Double data: list)
            res += data;
        return res/list.size();
    }
}
