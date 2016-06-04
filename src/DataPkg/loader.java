/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPkg;
import InterfacePkg.*;
/**
 *
 * @author ignacio
 */
public class loader {
    // Attributes
    private final Object _obj;
    private final int _window;
    
    public loader(Object obj, int window){
        this._obj = obj;
        this._window = window;
    }
    
    public void selector(){
        switch(_window){
            case 25:
                graphicBarFrame a =  new graphicBarFrame((graphFileReader) _obj);
                a.setVisible(true);
                break;
        }
    }
}
