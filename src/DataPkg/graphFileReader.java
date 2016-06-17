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
public class graphFileReader implements java.io.Serializable{
    private String _title, _x, _y;
    private ArrayList<String> _columns = new ArrayList();
    private ArrayList<Double> _values = new ArrayList();

    public graphFileReader(String _title, String _x, String _y, ArrayList<String> _columns, ArrayList<Double> _values) {
        this._title = _title;
        this._x = _x;
        this._y = _y;
        this._columns = _columns;
        this._values = _values;
    }

    public String getTitle() {
        return _title;
    }

    public String getX() {
        return _x;
    }

    public String getY() {
        return _y;
    }

    public ArrayList<String> getColumns() {
        return _columns;
    }

    public ArrayList<Double> getValues() {
        return _values;
    }
    
    
}
