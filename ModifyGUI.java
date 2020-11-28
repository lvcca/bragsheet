/**
 * Author:      Mason Palma
 * File:        ModifyGUI.java
 * Purpose:     This class provides the GUI for modify record pane
 * 
 */

package ProjectPackage;

import javax.swing.JOptionPane;

public class ModifyGUI extends javax.swing.JFrame {
    
    EntryRecord record;
    entryContainer cont, modified;
    OutputText output;
    int index;
    String cat;
    
    boolean isAlive = false;
    
    public ModifyGUI(entryContainer cont, EntryRecord record, int index, String cat, OutputText output) {
        initComponents();
        
        System.out.println("The cat is: " + cat + "\nThe index is " + index);
        
        this.index = index;
        this.cat = cat;
        this.cont = cont;
        
        this.record = record;       
        this.output = output;
        
        setDefaults();
        this.isAlive = true;
    }
    
    void setDefaults(){
        try{
            this.dayBoxStart.setSelectedItem(this.cont.getStartDay());
            this.monthBoxStart.setSelectedItem(this.cont.getStartMonth());
            this.yearBoxStart.setSelectedItem(this.cont.getStartYear());
            this.dayBoxEnd.setSelectedItem(this.cont.getEndDay());
            this.monthBoxEnd.setSelectedItem(this.cont.getEndMonth());
            this.yearBoxEnd.setSelectedItem(this.cont.getEndYear());
            this.impactBox.setSelectedItem(this.cont.getImpact());
            this.categoryBox.setSelectedItem(this.cont.getCategory());
            this.contentTextArea.setText(cont.getContent());
            
            System.out.println("The size of the record is " +  this.record.record.size());
            
        }catch(Exception e){
            System.out.println("Something went wrong in setDefaults" + e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monthBoxStart = new javax.swing.JComboBox<>();
        yearBoxStart = new javax.swing.JComboBox<>();
        startLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        yearFormatLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        impactBox = new javax.swing.JComboBox<>();
        categoryBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        endLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dayBoxEnd = new javax.swing.JComboBox<>();
        monthBoxEnd = new javax.swing.JComboBox<>();
        dayBoxStart = new javax.swing.JComboBox<>();
        yearBoxEnd = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDIT RECORD");

        monthBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthBoxStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxStartActionPerformed(evt);
            }
        });

        yearBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        startLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        startLabel.setText("Start Date");

        saveButton.setBackground(new java.awt.Color(0, 102, 0));
        saveButton.setForeground(new java.awt.Color(102, 255, 0));
        saveButton.setText("Done");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        yearFormatLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        yearFormatLabel.setText("DD/MMM/YYYY");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Content");

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoryLabel.setText("Category");

        impactBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Moderate", "High" }));
        impactBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impactBoxActionPerformed(evt);
            }
        });

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duties and Responsibilities", "Job Accomplishments & Initiative", "Supervision and Leadership", "Special Achievements", "Off-Duty Activities", "Collateral Duties", "Education (Navy, Personal)", "Qualifications" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Impact");

        endLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        endLabel.setText("End Date");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("brag sheet");

        dayBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        dayBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("EDIT");

        contentTextArea.setColumns(20);
        contentTextArea.setRows(5);
        jScrollPane2.setViewportView(contentTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startLabel)
                            .addComponent(categoryLabel)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dayBoxEnd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dayBoxStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(monthBoxStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthBoxEnd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearBoxStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearBoxEnd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearFormatLabel)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(impactBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(saveButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dayBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endLabel)
                            .addComponent(monthBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yearFormatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(impactBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryLabel)
                    .addComponent(saveButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    EntryRecord getRecord(){
    
        return this.record;
    
    }
    
    private void monthBoxStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxStartActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        try{
            this.modified = new entryContainer();
            this.modified.setStartDay(this.dayBoxStart.getSelectedItem().toString());
            this.modified.setStartMonth(this.monthBoxStart.getSelectedItem().toString());
            this.modified.setStartYear(this.yearBoxStart.getSelectedItem().toString());
            this.modified.setEndDay(this.dayBoxEnd.getSelectedItem().toString());
            this.modified.setEndMonth(this.monthBoxEnd.getSelectedItem().toString());
            this.modified.setEndYear(this.yearBoxEnd.getSelectedItem().toString());
            this.modified.setCategory(this.categoryBox.getSelectedItem().toString());
            this.modified.setImpact(this.impactBox.getSelectedItem().toString());
            this.modified.setContent(this.contentTextArea.getText());
        
            System.out.println("Modified entryContainer values are:\nCategory: " 
                + this.modified.getCategory()
                + " "
                + this.modified.getStartDay()
                + this.modified.getStartMonth()
                + this.modified.getStartYear()
                + " - "
                + this.modified.getEndDay()
                + this.modified.getEndMonth()
                + this.modified.getEndYear()
                + "\n"
                + this.modified.getContent()); 
        }
        catch(Exception e){
            System.out.println("Exception caught in saveButtonActionPerformed: " + e);
        }
        finally{
            
            this.output.replaceContainer(this.modified, this.cat, this.index);
            this.record = new EntryRecord(this.output.getRecord());
            this.isAlive = false;
            System.out.println("New record size " + this.record.record.size());
            
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed
    
    OutputText getOutput(){
        try{
            return this.output;
        }catch(Exception e){
            System.out.println("Exception caught in getOutput " + e);
            return null;
        }
    }
    
    private void impactBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impactBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impactBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextArea contentTextArea;
    private javax.swing.JComboBox<String> dayBoxEnd;
    private javax.swing.JComboBox<String> dayBoxStart;
    private javax.swing.JLabel endLabel;
    private javax.swing.JComboBox<String> impactBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> monthBoxEnd;
    private javax.swing.JComboBox<String> monthBoxStart;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel startLabel;
    private javax.swing.JComboBox<String> yearBoxEnd;
    private javax.swing.JComboBox<String> yearBoxStart;
    private javax.swing.JLabel yearFormatLabel;
    // End of variables declaration//GEN-END:variables
}
