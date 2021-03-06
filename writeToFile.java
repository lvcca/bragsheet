/**
 * Author:      Mason Palma
 * File:        ModifyGUI.java
 * Purpose:     This class writes '.bragsheet' formatted file.
 * 
 */

package ProjectPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
    
    File myObj = new File("bragsheet.bragsheet");
    FileWriter myWriter;
    
    public writeToFile(){
        checkFile();
    }
    
    void writeOut(String text){
        try{
            this.myWriter = new FileWriter(myObj.getAbsoluteFile());
            this.myWriter.write(text);
            this.myWriter.close();
        }
        catch(IOException e){
            System.out.println("Something went wrong.. " + e);
        }
    }
    
    void appendToFile(String text){
        try{
            this.myWriter = new FileWriter(myObj.getAbsoluteFile());
            this.myWriter.append(text);
            this.myWriter.close();
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
                System.out.println("File was not found..\n" + "Creating new bragsheet file at " + myObj.getAbsolutePath());
            }
        }
        catch(IOException e){
            System.out.println("Something went wrong.." + e);
        }
    }
    
    
}
