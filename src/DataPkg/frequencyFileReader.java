/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPkg;

import java.util.ArrayList;

/**
 *
 * @author ignacio
 */
public class frequencyFileReader implements java.io.Serializable{
    private ArrayList<Double> list = new ArrayList();
    
    public frequencyFileReader(ArrayList<Double> pList){
        this.list = pList;
    }

    public ArrayList<Double> getList() {
        return list;
    }
}
