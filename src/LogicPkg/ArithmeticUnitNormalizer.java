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
public class ArithmeticUnitNormalizer {
    
    private final ArithmeticUnit unit = new ArithmeticUnit();
    private ArrayList<String> list = new ArrayList();

    public ArithmeticUnitNormalizer() {
    }
    
    public String getResults(){
        String median, min, max, trend;
        int trendCount;
        unit.calcTrend(list);
        median = unit.calcMedian(list);
        min = unit.getMin(list);
        max = unit.getMax(list);
        trend = unit.getConcS();
        trendCount = unit.getConc();
        return ("Media Aritmética: " + median + "\n"
                +"Máximo: " + min + "\n"
                +"Mínimo: " + max + "\n"
                +"Moda: " + trend + ", Ocurrencias: " + trendCount + "\n");
    }
    
    public void setArray(ArrayList<String> pInput){
        this.list = pInput;
    }
}
