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
public class posMeasuresFileReader implements java.io.Serializable{
    private ArrayList<String> list = new ArrayList();
    
    public posMeasuresFileReader(ArrayList<String> pList){
        this.list = pList;
    }

    public ArrayList<String> getList() {
        return list;
    }
}
