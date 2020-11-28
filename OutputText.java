/**
 * Author:      Mason Palma
 * File:        ModifyGUI.java
 * Purpose:     This class provides main GUI and main class.
 * 
 */

package ProjectPackage;

import java.util.LinkedList;

public class OutputText {
    
    EntryRecord record = new EntryRecord();
    
    LinkedList<entryContainer> cat1 = new LinkedList<>();
    LinkedList<entryContainer> cat2 = new LinkedList<>();
    LinkedList<entryContainer> cat3 = new LinkedList<>();
    LinkedList<entryContainer> cat4 = new LinkedList<>();
    LinkedList<entryContainer> cat5 = new LinkedList<>();
    LinkedList<entryContainer> cat6 = new LinkedList<>();
    LinkedList<entryContainer> cat7 = new LinkedList<>();
    LinkedList<entryContainer> cat8 = new LinkedList<>();
    
    String str;
    
    public OutputText(){
        catagorize();
    }
    
    public OutputText(EntryRecord record){
        catagorize();
        this.record = record;
    }
    
    void setRecord(EntryRecord record){
        this.record = record;
    }
    
    void deleteContainer(String cat, int index){
                
        /**
         * 
            cat1 = Duties and Responsibilities
            cat2 = Job Accomplishments & Initiative
            cat3 = Supervision and Leadership
            cat4 = Special Achievements
            cat5 = Off-Duty Activities
            cat6 = Collateral Duties
            cat7 = Education (Navy, Personal)
            cat8 = Qualifications
         * 
         */
                
        if(cat.contains("Duties and Responsibilities")){
            System.out.println("cat size is " + this.cat1.size());
            this.cat1.remove(index);
            System.out.println("Afterwards cat size " + this.cat1.size());
        }
        else if(cat.contains("Job Accomplishments & Initiative")){
            System.out.println("cat size is " + this.cat2.size());
            this.cat2.remove(index);
            System.out.println("Afterwards cat size " + this.cat2.size());
        }
        else if(cat.contains("Supervision and Leadership")){
            System.out.println("cat size is " + this.cat3.size());
            this.cat3.remove(index);
            System.out.println("Afterwards cat size " + this.cat3.size());
        }
        else if(cat.contains("Special Achievements")){
            System.out.println("cat size is " + this.cat4.size());
            this.cat4.remove(index);
            System.out.println("Afterwards cat size " + this.cat4.size());
        }
        else if(cat.contains("Off-Duty Activities")){
            System.out.println("cat size is " + this.cat5.size());
            this.cat5.remove(index);
            System.out.println("Afterwards cat size " + this.cat5.size());
        }
        else if(cat.contains("Collateral Duties")){
            System.out.println("cat size is " + this.cat6.size());
            this.cat6.remove(index);
            System.out.println("Afterwards cat size " + this.cat6.size());
        }
        else if(cat.contains("Education (Navy, Personal)")){
            System.out.println("cat size is " + this.cat7.size());
            this.cat7.remove(index);
            System.out.println("Afterwards cat size " + this.cat7.size());
        }
        else if(cat.contains("Qualifications")){
            System.out.println("cat size is " + this.cat8.size());
            this.cat8.remove(index);
            System.out.println("Afterwards cat size " + this.cat8.size());
        }
        
        writeNewRecord();
        
    }
    
    void doReplace(entryContainer cont, entryContainer cont2){
        
        //Usage[*] : doReplace(containerToChange, containerWithChanges)
        
        try{
            cont.setCategory(cont2.getCategory());
            cont.setStartDay(cont2.getStartDay());
            cont.setStartMonth(cont2.getStartMonth());
            cont.setStartYear(cont2.getStartYear());

            cont.setEndDay(cont2.getEndDay());
            cont.setEndMonth(cont2.getEndMonth());
            cont.setEndYear(cont2.getEndYear());

            cont.setImpact(cont2.getImpact());
            cont.setContent(cont2.getContent());

            System.out.println("doReplace called...");
        }
        catch(Exception e){
            System.out.println("Exception in doReplace " + e);
        }
    }
    
    void replaceContainer(entryContainer cont, String cat, int index){
        //Usage[*] : replaceContainer(containerWithChanges, category, index)
        
        /**
         * 
            cat1 = Duties and Responsibilities
            cat2 = Job Accomplishments & Initiative
            cat3 = Supervision and Leadership
            cat4 = Special Achievements
            cat5 = Off-Duty Activities
            cat6 = Collateral Duties
            cat7 = Education (Navy, Personal)
            cat8 = Qualifications
         * 
         */
        try{
            if(cat.contains("Duties and Responsibilities")){
                doReplace(this.cat1.get(index), cont);
            }
            else if(cat.contains("Job Accomplishments & Initiative")){
                doReplace(this.cat2.get(index), cont);
            }
            else if(cat.contains("Supervision and Leadership")){
                doReplace(this.cat3.get(index), cont);
            }
            else if(cat.contains("Special Achievements")){
                doReplace(this.cat4.get(index), cont);
            }
            else if(cat.contains("Off-Duty Activities")){
                doReplace(this.cat5.get(index), cont);
            }
            else if(cat.contains("Collateral Duties")){
                doReplace(this.cat6.get(index), cont);
            }
            else if(cat.contains("Education (Navy, Personal)")){
                doReplace(this.cat7.get(index), cont);
            }
            else if(cat.contains("Qualifications")){
                doReplace(this.cat8.get(index), cont);
            }
            
        }catch(Exception e){
            System.out.println("Exception thrown in replaceContainer: " + e);
        }
    }
    
    void writeNewRecord(){
        //Populates internal linked lists with associated entryContainers
        
        try{    
            this.record = new EntryRecord();
            
            while(!this.cat1.isEmpty()){
                this.record.addRecord(cat1.poll());
            }
            while(!this.cat2.isEmpty()){
                this.record.addRecord(cat2.poll());
            }
            while(!this.cat3.isEmpty()){
                this.record.addRecord(cat3.poll());
            }
            while(!this.cat4.isEmpty()){
                this.record.addRecord(cat4.poll());
            }
            while(!this.cat5.isEmpty()){
                this.record.addRecord(cat5.poll());
            }
            while(!this.cat6.isEmpty()){
                this.record.addRecord(cat6.poll());
            }
            while(!this.cat7.isEmpty()){
                this.record.addRecord(cat7.poll());
            }
            while(!this.cat8.isEmpty()){
                this.record.addRecord(cat8.poll());
            }
            
        }catch(Exception e){
            System.out.println("Something went wrong in writeNewRecord" + e);
        }
        
    }
    
    LinkedList<entryContainer> getRecord(){
        return this.record.record;
    }
    
    void catagorize(){
        //Takes entryContainer from record, places in respective internal linked list.
        
        for(entryContainer test : this.record.record){
            
            if (test.category.equals("Duties and Responsibilities")){
                this.cat1.add(test);
            }
            else if (test.category.equals("Job Accomplishments & Initiative")){
                this.cat2.add(test);
            }
            else if (test.category.equals("Supervision and Leadership")){
                this.cat3.add(test);
            }
            else if (test.category.equals("Special Achievements")){
                this.cat4.add(test);
            }
            else if (test.category.equals("Off-Duty Activities")){
                this.cat5.add(test);
            }
            else if (test.category.equals("Collateral Duties")){
                this.cat6.add(test);
            }
            else if (test.category.equals("Education (Navy, Personal)")){
                this.cat7.add(test);
            }
            else if (test.category.equals("Qualifications")){
                this.cat8.add(test);
            }             
        }
    
    }
    void testSize(){
        //For debugging purposes, print size of internal linked lists.
        
        System.out.println("Cat1 = " + cat1.size());
        System.out.println("Cat2 = " + cat2.size());
        System.out.println("Cat3 = " + cat3.size());
        System.out.println("Cat4 = " + cat4.size());
        System.out.println("Cat5 = " + cat5.size());
        System.out.println("Cat6 = " + cat6.size());
        System.out.println("Cat7 = " + cat7.size());
        System.out.println("Cat8 = " + cat8.size());
    }
    
    void testContents(){
        //For debug, test internal linked lists with text format.
        
        this.str = "";
        
        if(!this.cat1.isEmpty()){
            System.out.println("Duties and Responsibilities:");
            this.str += "Duties and Responsibilities:";
            this.str += "\n";
            
            for(int i = 0; i < cat1.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat1.get(i).startDay + cat1.get(i).startMonth + cat1.get(i).startYear + " - " + cat1.get(i).endDay +  cat1.get(i).endMonth +  cat1.get(i).endYear);
                System.out.println("\t\t" + cat1.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat1.get(i).startDay + cat1.get(i).startMonth + cat1.get(i).startYear + " - " + cat1.get(i).endDay +  cat1.get(i).endMonth +  cat1.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat1.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat2.isEmpty()){
            System.out.println("Job Accomplishments & Initiative:");
            this.str += "Job Accomplishments & Initiative:";
            this.str += "\n";
            
            for(int i = 0; i < cat2.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat2.get(i).startDay + cat2.get(i).startMonth + cat2.get(i).startYear + " - " + cat2.get(i).endDay +  cat2.get(i).endMonth +  cat2.get(i).endYear);
                System.out.println("\t\t" + cat2.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat2.get(i).startDay + cat2.get(i).startMonth + cat2.get(i).startYear + " - " + cat2.get(i).endDay +  cat2.get(i).endMonth +  cat2.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat2.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat3.isEmpty()){
            System.out.println("Supervision and Leadership:");
            this.str += "Supervision and Leadership:";
            this.str += "\n";
            
            for(int i = 0; i < cat3.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat3.get(i).startDay + cat3.get(i).startMonth + cat3.get(i).startYear + " - " + cat3.get(i).endDay +  cat3.get(i).endMonth +  cat3.get(i).endYear);
                System.out.println("\t\t" + cat3.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat3.get(i).startDay + cat3.get(i).startMonth + cat3.get(i).startYear + " - " + cat3.get(i).endDay +  cat3.get(i).endMonth +  cat3.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat3.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat4.isEmpty()){
            System.out.println("Special Achievements:");
            this.str += "Special Achievements:";
            this.str += "\n";
            
            for(int i = 0; i < cat4.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat4.get(i).startDay + cat4.get(i).startMonth + cat4.get(i).startYear + " - " + cat4.get(i).endDay +  cat4.get(i).endMonth +  cat4.get(i).endYear);
                System.out.println("\t\t" + cat4.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat4.get(i).startDay + cat4.get(i).startMonth + cat4.get(i).startYear + " - " + cat4.get(i).endDay +  cat4.get(i).endMonth +  cat4.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat4.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat5.isEmpty()){
            System.out.println("Off-Duty Activities:");
            this.str += "Off-Duty Activities:";
            this.str += "\n";
            
            for(int i = 0; i < cat5.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat5.get(i).startDay + cat5.get(i).startMonth + cat5.get(i).startYear + " - " + cat5.get(i).endDay +  cat5.get(i).endMonth +  cat5.get(i).endYear);
                System.out.println("\t\t" + cat5.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat5.get(i).startDay + cat5.get(i).startMonth + cat5.get(i).startYear + " - " + cat5.get(i).endDay +  cat5.get(i).endMonth +  cat5.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat5.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat6.isEmpty()){
            System.out.println("Collateral Duties:");
            this.str += "Collateral Duties:";
            this.str += "\n";
            
            for(int i = 0; i < cat6.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat6.get(i).startDay + cat6.get(i).startMonth + cat6.get(i).startYear + " - " + cat6.get(i).endDay +  cat6.get(i).endMonth +  cat6.get(i).endYear);
                System.out.println("\t\t" + cat6.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat6.get(i).startDay + cat6.get(i).startMonth + cat6.get(i).startYear + " - " + cat6.get(i).endDay +  cat6.get(i).endMonth +  cat6.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat6.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat7.isEmpty()){
            System.out.println("Education (Navy, Personal):");
            this.str += "Education (Navy, Personal):";
            this.str += "\n";
            
            for(int i = 0; i < cat7.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat7.get(i).startDay + cat7.get(i).startMonth + cat7.get(i).startYear + " - " + cat7.get(i).endDay +  cat7.get(i).endMonth +  cat7.get(i).endYear);
                System.out.println("\t\t" + cat7.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat7.get(i).startDay + cat7.get(i).startMonth + cat7.get(i).startYear + " - " + cat7.get(i).endDay +  cat7.get(i).endMonth +  cat7.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat7.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
        if(!this.cat8.isEmpty()){
            System.out.println("Qualifications:");
            this.str += "Qualifications:";
            this.str += "\n";
            
            for(int i = 0; i < cat8.size(); i++){
                System.out.println("\t" + "[" + (i+1) + "] " + cat8.get(i).startDay + cat8.get(i).startMonth + cat8.get(i).startYear + " - " + cat8.get(i).endDay +  cat8.get(i).endMonth +  cat8.get(i).endYear);
                System.out.println("\t\t" + cat8.get(i).content);
                
                this.str += ("|\t    " + "[" + (i+1) + "] " + cat8.get(i).startDay + cat8.get(i).startMonth + cat8.get(i).startYear + " - " + cat8.get(i).endDay +  cat8.get(i).endMonth +  cat8.get(i).endYear);
                this.str += "\n";
                this.str += ("|___\t\t      " + cat8.get(i).content);
                this.str += "\n";
            }
            this.str += "\n";
        }
    }
    
    String grabValues(){
        
        return this.str;
        
    }
    
    entryContainer getFromList(String cat, int index){
        
        /**
         * 
            cat1 = Duties and Responsibilities
            cat2 = Job Accomplishments & Initiative
            cat3 = Supervision and Leadership
            cat4 = Special Achievements
            cat5 = Off-Duty Activities
            cat6 = Collateral Duties
            cat7 = Education (Navy, Personal)
            cat8 = Qualifications
         * 
         */
                
        if(cat.contains("Duties and Responsibilities")){
            System.out.println("cat size is " + this.cat1.size());
            return this.cat1.get(index);
        }
        else if(cat.contains("Job Accomplishments & Initiative")){
            System.out.println("cat size is " + this.cat2.size());
            return this.cat2.get(index);
        }
        else if(cat.contains("Supervision and Leadership")){
            System.out.println("cat size is " + this.cat3.size());
            return this.cat3.get(index);
        }
        else if(cat.contains("Special Achievements")){
            System.out.println("cat size is " + this.cat4.size());
            return this.cat4.get(index);
        }
        else if(cat.contains("Off-Duty Activities")){
            System.out.println("cat size is " + this.cat5.size());
            return this.cat5.get(index);
        }
        else if(cat.contains("Collateral Duties")){
            System.out.println("cat size is " + this.cat6.size());
            return this.cat6.get(index);
        }
        else if(cat.contains("Education (Navy, Personal)")){
            System.out.println("cat size is " + this.cat7.size());
            return this.cat7.get(index);
        }
        else if(cat.contains("Qualifications")){
            System.out.println("cat size is " + this.cat8.size());
            return this.cat8.get(index);
        }
        
        else return null;
    }
    
    void WriteOut(){
        try{
            while(!this.record.record.peek().equals(null)){
                
            entryContainer tmp = this.record.record.poll();
            System.out.println(tmp.startDay + tmp.startMonth + tmp.startYear + " - " + tmp.endDay + tmp.endMonth + tmp.endYear);
            System.out.println("\t" + tmp.content);
            
            }
        }
        catch(NullPointerException e){
            System.out.println("[*] Null Pointer Exception: from WriteOut()");
        }
    }
}
