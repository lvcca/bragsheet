/**
 * Author:      Mason Palma
 * File:        ModifyGUI.java
 * Purpose:     This class provides '.bragsheet' formatted text to write.
 * 
 */

package ProjectPackage;

public class ToFile {
    
    String tmp;
    
    public ToFile(){
        
    }
    
    String formatText(entryContainer cont){
        
        this.tmp = "";
        
        this.tmp += "<record><Category>" + cont.category + "</Category>"+
                "<startDay>" + cont.startDay + "</startDay>"+
                "<startMonth>" + cont.startMonth +"</startMonth>"+
                "<startYear>" + cont.startYear + "</startYear>"+
                "<endDay>" + cont.endDay + "</endDay>"+
                "<endMonth>" + cont.endMonth + "</endMonth>"+
                "<endYear>" + cont.endYear + "</endYear>"+
                "<impact>" + cont.impact + "</impact>"+
                "<content>" + cont.content + "</content>" + "</record>" + "\n";
        
        
        return this.tmp;
        
    }   
}
