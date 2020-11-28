/**
 * Author:      Mason Palma
 * File:        ModifyGUI.java
 * Purpose:     This class provides a container to store information of entries.
 * 
 */

package ProjectPackage;

public class entryContainer {
    
    String category, impact, content;
    String startDay, startMonth, startYear, endDay, endMonth, endYear;
    
    public entryContainer(){
       
    }
    
    public entryContainer(String category, String startDay, String startMonth, String startYear, 
            String endDay, String endMonth, String endYear, String impact, 
            String content){
        
        this.category = category;
        this.impact = impact;
        this.content = content;
        this.startDay = startDay;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
        
    }
    
    //getters
    
    String getCategory(){
        return this.category;
    }
    String getImpact(){
        return this.impact;
    }
    String getContent(){
        return this.content;
    }
    
    String getStartDay(){
        return this.startDay;
    }
    String getStartMonth(){
        return this.startMonth;
    }
    String getStartYear(){
        return this.startYear;
    }
    
    String getEndDay(){
        return this.endDay;
    }
    String getEndMonth(){
        return this.endMonth;
    }
    String getEndYear(){
        return this.endYear;
    }
    
    //Setters
    
    void setCategory(String category){
        this.category = category;
    }
    void setImpact(String impact){
        this.impact = impact;
    }
    void setContent(String content){
        this.content = content;
    }
    void setStartDay(String startDay){
        this.startDay = startDay;
    }
    void setStartMonth(String startMonth){
        this.startMonth = startMonth;
    }
    void setStartYear(String startYear){
        this.startYear = startYear;
    }
    void setEndDay(String endDay){
        this.endDay = endDay;
    }
    void setEndMonth(String endMonth){
        this.endMonth = endMonth;
    }
    void setEndYear(String endYear){
        this.endYear = endYear;
    }
}
