/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicPkg;

import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author ignacio
 */
public class ArithmeticUnit {
    //Class atributes
    //Only needs the list for each element
    private final ArrayList<Double> list = new ArrayList();
    private int conc;
    private String concS;
    
    //Constructor: doesn't require anything
    public ArithmeticUnit(){}
      
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

    public void calcTrend(ArrayList<String> pInput){
        conc = 0;
        int counter;
        concS = pInput.get(0);
        for(int i = 0; i<pInput.size(); i++){
            counter = 0;
            for(int j = 0; j<pInput.size(); j++)
                if(pInput.get(i).equals(pInput.get(j)))
                    counter++;
            if(counter > conc){
                conc = counter;
                concS = pInput.get(i);
            }
        }
    }
    
    //Returns the aritmetic median from the actual elements of the list
    public String calcMedian(ArrayList<String> pInput){
        readInput(pInput);
        double res = 0;
        for(Double data: list)
            res += data;
        return String.valueOf(res/list.size());
    }
    
    public String getMax(ArrayList<String> pInput){
        double res = -999999999;
        readInput(pInput);
        for(Double i: list)
            if(i > res)
                res = i;
        return String.valueOf(res);
    }
    
    public String getMin(ArrayList<String> pInput){
        double res = 999999999;
        readInput(pInput);
        for(Double i: list)
            if(i < res)
                res = i;
        return String.valueOf(res);
    }

    public int getConc() {
        return conc;
    }

    public String getConcS() {
        return concS;
    }
  
}
