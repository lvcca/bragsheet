/**
 * Author:      Mason Palma
 * File:        FromFile.java
 * Purpose:     This class reads '.bragsheet' extension files and converts them
 *              to usable record objects.
 */

package ProjectPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FromFile {
    
    String loadedFilePath;
    entryContainer current;
    EntryRecord record = new EntryRecord();
    
    String[] adminData = new String[6];
    
    Matcher recordMatch, catMatch, startDayMatch, startMonthMatch, startYearMatch,
            endDayMatch, endMonthMatch, endYearMatch, impactMatch, contentMatch,
            fullNameMatch, rateDesignatorMatch, branchMatch, dateReportedMatch, lastEvalMatch, dateOfRateMatch;
    
    Pattern recordPattern = Pattern.compile("(?s)([<]record[>])(.*?)([<][\\/]record[>])");
    Pattern catPattern = Pattern.compile("(?s)([<]Category[>])(.*?)([<][\\/]Category[>])");
    Pattern startDayPattern = Pattern.compile("(?s)([<]startDay[>])(.*?)([<][\\/]startDay[>])");
    Pattern startMonthPattern = Pattern.compile("(?s)([<]startMonth[>])(.*?)([<][\\/]startMonth[>])");
    Pattern startYearPattern = Pattern.compile("(?s)([<]startYear[>])(.*?)([<][\\/]startYear[>])");
    Pattern endDayPattern = Pattern.compile("(?s)([<]endDay[>])(.*?)([<][\\/]endDay[>])");
    Pattern endMonthPattern = Pattern.compile("(?s)([<]endMonth[>])(.*?)([<][\\/]endMonth[>])");
    Pattern endYearPattern = Pattern.compile("(?s)([<]endYear[>])(.*?)([<][\\/]endYear[>])");
    Pattern impactPattern = Pattern.compile("(?s)([<]impact[>])(.*?)([<][\\/]impact[>])");
    Pattern contentPattern = Pattern.compile("(?s)([<]content[>])(.*?)([<][\\/]content[>])");
    
    Pattern fullNamePattern = Pattern.compile("(?s)([<]fullName[>])(.*?)([<][\\/]fullName[>])");
    Pattern rateDesignatorPattern = Pattern.compile("(?s)([<]rateDesignator[>])(.*?)([<][\\/]rateDesignator[>])");
    Pattern branchPattern = Pattern.compile("(?s)([<]branch[>])(.*?)([<][\\/]branch[>])");
    Pattern dateReportedPattern = Pattern.compile("(?s)([<]dateReported[>])(.*?)([<][\\/]dateReported[>])");
    Pattern lastEvalPattern = Pattern.compile("(?s)([<]lastEval[>])(.*?)([<][\\/]lastEval[>])");
    Pattern dateOfRatePattern = Pattern.compile("(?s)([<]dateOfRate[>])(.*?)([<][\\/]dateOfRate[>])");
    
    String str = "<record><Category>Duties and Responsibilities</Category><startDay>02</startDay><startMonth>Sep</startMonth><startYear>2020</startYear><endDay>05</endDay><endMonth>Sep</endMonth><endYear>2020</endYear><impact>High</impact><content>This is test content description. \nTest new line.</content></record>";
    
    public FromFile(){
        
    }
    
    public FromFile(String file){
        this.loadedFilePath = file;    
    }
    
    void openFile(){
        
        try{
            
            File loadedFile = new File(this.loadedFilePath);
            Scanner myReader = new Scanner(loadedFile);
            
            
            while(myReader.hasNextLine()){
                if(myReader.nextLine().contains("<record>")){
                
                }
                String data = myReader.nextLine();
                System.out.println(data);
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("[*] Somthing went wrong...\nFile not found...");
        }
    }
    
    void getLine(){
        String line = "";
        
        try{
            
            File myObj = new File(this.loadedFilePath);
            Scanner myReader = new Scanner(myObj);
                        
            while(myReader.hasNextLine()){
                line = myReader.nextLine();
                
                if(line.contains("<record><fullName>")){
                    parseAdminData(line);
                    line = myReader.nextLine();
                }
              
                parseRecord(line);
                
                
            }
            
        }catch(FileNotFoundException e){
            System.out.println("File not found..." + e);
        }
    }
    
    void parseAdminData(String line){
        
        String tmp;
        String[] tmpArray;
        
        this.recordMatch = recordPattern.matcher(line);
        
        while(recordMatch.find()){
            
            this.fullNameMatch = fullNamePattern.matcher(recordMatch.group());
            this.rateDesignatorMatch = rateDesignatorPattern.matcher(recordMatch.group());
            this.branchMatch = branchPattern.matcher(recordMatch.group());
            this.dateReportedMatch = dateReportedPattern.matcher(recordMatch.group());
            this.lastEvalMatch = lastEvalPattern.matcher(recordMatch.group());
            this.dateOfRateMatch = dateOfRatePattern.matcher(recordMatch.group());
            
            if(fullNameMatch.find()){
                tmp = fullNameMatch.group();
                tmpArray = tmp.split("([<]fullName[>])|([<][\\/]fullName[>])");
                
                
                adminData[0] = (tmpArray[1]);
            }
            if(rateDesignatorMatch.find()){
                tmp = rateDesignatorMatch.group();
                tmpArray = tmp.split("([<]rateDesignator[>])|([<][\\/]rateDesignator[>])");
                
                
                adminData[1] = (tmpArray[1]);
            }
            if(branchMatch.find()){
                tmp = branchMatch.group();
                tmpArray = tmp.split("([<]branch[>])|([<][\\/]branch[>])");
                
                
                adminData[2] = (tmpArray[1]);
            }
            if(dateReportedMatch.find()){
                tmp = dateReportedMatch.group();
                tmpArray = tmp.split("([<]dateReported[>])|([<][\\/]dateReported[>])");
                
                
                adminData[3] = (tmpArray[1]);
            }
            if(lastEvalMatch.find()){
                tmp = lastEvalMatch.group();
                tmpArray = tmp.split("([<]lastEval[>])|([<][\\/]lastEval[>])");
                
                
                adminData[4] = (tmpArray[1]);
            }
            if(dateOfRateMatch.find()){
                tmp = dateOfRateMatch.group();
                tmpArray = tmp.split("([<]dateOfRate[>])|([<][\\/]dateOfRate[>])");
                
                
                adminData[5] = (tmpArray[1]);
            }
            
        }
        
    }
    
    void parseRecord(String line){
        
        String tmp;
        String[] tmpArray;
        entryContainer cont = new entryContainer();
        
        this.recordMatch = recordPattern.matcher(line);
        
        while(recordMatch.find()){
            
            this.catMatch = catPattern.matcher(recordMatch.group());
            this.startDayMatch = startDayPattern.matcher(recordMatch.group());
            this.startMonthMatch = startMonthPattern.matcher(recordMatch.group());
            this.startYearMatch = startYearPattern.matcher(recordMatch.group());
            this.endDayMatch = endDayPattern.matcher(recordMatch.group());
            this.endMonthMatch = endMonthPattern.matcher(recordMatch.group());
            this.endYearMatch = endYearPattern.matcher(recordMatch.group());
            this.impactMatch = impactPattern.matcher(recordMatch.group());
            this.contentMatch = contentPattern.matcher(recordMatch.group());
            
            
            if(catMatch.find()){
                tmp = catMatch.group();
                tmpArray = tmp.split("([<]Category[>])|([<][\\\\/]Category[>])");
                System.out.println(tmpArray[1]);
                
                cont.setCategory(tmpArray[1]);
            }
            if(startDayMatch.find()){
                tmp = startDayMatch.group();
                tmpArray = tmp.split("([<]startDay[>])|([<][\\/]startDay[>])");
                System.out.println(tmpArray[1]);
                
                cont.setStartDay(tmpArray[1]);
            }
            if(startMonthMatch.find()){
                tmp = startMonthMatch.group();
                tmpArray = tmp.split("([<]startMonth[>])|([<][\\/]startMonth[>])");
                System.out.println(tmpArray[1]);
                
                cont.setStartMonth(tmpArray[1]);
            }
            if(startYearMatch.find()){               
                tmp = startYearMatch.group();
                tmpArray = tmp.split("([<]startYear[>])|([<][\\/]startYear[>])");
                System.out.println(tmpArray[1]);
                
                cont.setStartYear(tmpArray[1]);
            }
            if(endDayMatch.find()){
                tmp = endDayMatch.group();
                tmpArray = tmp.split("([<]endDay[>])|([<][\\/]endDay[>])");
                System.out.println(tmpArray[1]);
                
                cont.setEndDay(tmpArray[1]);
            }
            if(endMonthMatch.find()){
                tmp = endMonthMatch.group();
                tmpArray = tmp.split("([<]endMonth[>])|([<][\\/]endMonth[>])");
                System.out.println(tmpArray[1]);
                
                cont.setEndMonth(tmpArray[1]);
            }
            if(endYearMatch.find()){
                tmp = endYearMatch.group();
                tmpArray = tmp.split("([<]endYear[>])|([<][\\/]endYear[>])");
                System.out.println(tmpArray[1]);
                
                cont.setEndYear(tmpArray[1]);
            }
            if(impactMatch.find()){
                tmp = impactMatch.group();
                tmpArray = tmp.split("([<]impact[>])|([<][\\/]impact[>])");
                System.out.println(tmpArray[1]);
                
                cont.setImpact(tmpArray[1]);
            }
            if(contentMatch.find()){
                tmp = contentMatch.group();
                tmpArray = tmp.split("([<]content[>])|([<][\\/]content[>])");
                System.out.println(tmpArray[1]);
                
                cont.setContent(tmpArray[1]);
            }
        }
        this.record.addRecord(cont);
    }
    
    EntryRecord getRecord(){
            return this.record;
    }
    
    String[] getAdminData(){
        try{
            return this.adminData;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    boolean adminDataSentinalCheck(){
        try{
            if(!this.adminData[0].equals("")){
                return true;
            }
            else
                return false;
        }
        catch(Exception e){
            return false;
        }
    }
}
