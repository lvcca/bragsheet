/**
 * Author:      Mason Palma
 * File:        EntryRecord.java
 * Purpose:     This class holds entryContainers in a linked list.
 */

package ProjectPackage;

import java.util.LinkedList;

public class EntryRecord {
    
    LinkedList<entryContainer> record = new LinkedList<>();
    
    //Constructors
    public EntryRecord(){    
    }
    public EntryRecord(LinkedList<entryContainer> record){
        this.record = record;
    }
    
    //Add entryContainer to record
    void addRecord(entryContainer container){
        this.record.add(container);
    }
    
}
