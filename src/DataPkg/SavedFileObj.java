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
public class SavedFileObj implements java.io.Serializable{
    // Attributes for the class
    private final int _windowType;

    public SavedFileObj(int _windowType) {
        this._windowType = _windowType;
    }   

    public int getWindowType(){
        return _windowType;
    }
}
