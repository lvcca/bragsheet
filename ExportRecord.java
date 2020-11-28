/**
 * Author:      Mason Palma
 * File:        ExportRecord.java
 * Purpose:     This class writes text to disk.
 */

package ProjectPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportRecord {
    
    File myObj = new File("record.txt");
    
    public ExportRecord() {
    
        checkFile();
    
    }
    
    String getfilepath(){
        return this.myObj.getAbsolutePath();
    }
    
    void writeOut(String text){
        
        try{
            FileWriter myWriter = new FileWriter(myObj.getAbsoluteFile());
            myWriter.write(text);
            myWriter.close();
        }
        
        catch(IOException e){
            System.out.println("Something went wrong.. " + e);
        }
    }
    
    
    void checkFile(){
        
        try{
            if(myObj.exists()){
                System.out.println("File exists.." + myObj.getAbsolutePath());
            }
            else{
                myObj.createNewFile();
                System.out.println("File was not found..\nCreating new record file at " + myObj.getAbsolutePath());
            }
        }
        catch(IOException e){
            System.out.println("Something went wrong.." + e);
        }
    }
    
}
