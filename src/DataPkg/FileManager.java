/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPkg;
import InterfacePkg.*;
import java.io.*;
/**
 *
 * @author ignacio
 */
public class FileManager {
    private final SavedFileObj _fileObj;
    private final String _path;
    FileOutputStream fileOut;
    
    public FileManager(SavedFileObj pFileObj, String pPath) throws FileNotFoundException{
        this._fileObj = pFileObj;
        this._path = pPath;
        fileOut = new FileOutputStream(_path);
    }
    
    public boolean save(Object obj){
        try
        {
            FileOutputStream fileOut = new FileOutputStream(_path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(_fileObj);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            return true;
        }
        catch(IOException i){
            i.printStackTrace();
            return false;
        }
    }
    
    public void load(String path){
        SavedFileObj e = null;
        try{           
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (SavedFileObj) in.readObject();
            if(e.getWindowType() == 25){
                graphFileReader a = (graphFileReader) in.readObject();
                in.close();
                fileIn.close();
                graphicBarFrame b =  new graphicBarFrame(a);
                b.setVisible(true);
            }
            else{
                in.close();
                fileIn.close();
            }
        }
        catch(IOException i){
            i.printStackTrace();
        }
        catch(ClassNotFoundException c){
            c.printStackTrace();
        }
    }
}
