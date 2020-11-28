/**
 * Author:      Mason Palma
 * File:        ModifyRecordGUI.java
 * Purpose:     This class provides the GUI for record management pane.
 * 
 */
package ProjectPackage;

import javax.swing.JOptionPane;

public class ModifyRecordGUI extends javax.swing.JFrame {
    
    EntryRecord record;
    entryContainer fromMod;
    OutputText output;
    String[] strings2;
    ModifyGUI mod;
    entryContainer tmp2;
    int tmpint2;
    String tmpstr2;
    

    public ModifyRecordGUI(EntryRecord record, OutputText output){
        
        this.record = record;
        this.output = new OutputText(record);
        this.output.catagorize();
        initComponents();
        catCombo();
    }
    
    void grabValues(){
        
        String str = "";
        
        for(entryContainer cont : this.record.record){
            
            if(!cont.content.isEmpty() & !cont.getContent().isEmpty()){
            
                if(!str.contains(cont.getCategory())){
                    System.out.println("Selected Category: " + cont.category);
                    str += cont.getCategory();
                    str += "\n";
                }
                
            }
            else{
                System.out.println("Container empty" + cont);
            }
        }
        JOptionPane.showMessageDialog(catComboBox, str);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        catComboBox = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        infoButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modify Record");
        setLocation(new java.awt.Point(400, 400));
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("brag sheet");

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel1.setText("Record Management");

        catComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duties and Responsibilities", "Job Accomplishments & Initiative", "Supervision and Leadership", "Special Achievements", "Off-Duty Activities", "Collateral Duties", "Education (Navy, Personal)", "Qualifications" }));
        catComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catComboBoxActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 51, 0));
        deleteButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteButton.setText("Delete Record");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        modifyButton.setBackground(new java.awt.Color(255, 153, 0));
        modifyButton.setForeground(new java.awt.Color(204, 204, 204));
        modifyButton.setText("Modify ");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        itemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(itemList);

        infoButton.setBackground(new java.awt.Color(102, 153, 255));
        infoButton.setForeground(new java.awt.Color(0, 255, 255));
        infoButton.setText("Info");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel2.setText("Record #");

        saveButton.setBackground(new java.awt.Color(0, 102, 0));
        saveButton.setForeground(new java.awt.Color(102, 255, 0));
        saveButton.setText("Save ");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(catComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(saveButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modifyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, modifyButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(catComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(infoButton)))
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(modifyButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addGap(28, 28, 28))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catComboBoxActionPerformed
        catCombo();
    }//GEN-LAST:event_catComboBoxActionPerformed
    
    void catCombo(){
        
        try{
            System.out.println("Selected Category " + catComboBox.getSelectedItem());
            int tmpint = 1;
            String tmp = "";

            for(entryContainer cont : this.record.record){
                if(cont.category.equals(catComboBox.getSelectedItem().toString())){
                    tmp += (cont.category + " : " + cont.content + "\n");
                    tmpint++;
                }
            }
            
            if (tmpint <= 1) {
                this.textArea.setText("There is no associated record with this category.");
            }

            this.strings2 = new String[tmpint];

            for(int i = 1; i < (tmpint); i++){ strings2[i] = Integer.toString(i); }

            itemList.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = strings2;

                public int getSize() { return this.strings.length; }
                public String getElementAt(int i) { return this.strings[i]; }

            });
        }catch(Exception e){
            System.out.println("Exception caught in catComboBoxActionPerformed" + e);
            this.textArea.setText("There is no associated record with this category.");
        }  
    }
    
    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        grabValues();
    }//GEN-LAST:event_infoButtonActionPerformed

    private void itemListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemListValueChanged
        
        this.textArea.setText("");
        
        try{
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

            System.out.println("Selected Item: "+(itemList.getSelectedIndex()-1));

            int tmpint = (this.itemList.getSelectedIndex()-1);
            String tmpstr = (this.catComboBox.getSelectedItem().toString());

            entryContainer tmp = this.output.getFromList(tmpstr, tmpint);

            String string1 = ("Impact - " + tmp.getImpact() + "\n" + "Category - " + 
                    tmp.getCategory() + "\n\t" + tmp.getStartDay() + 
                    tmp.getStartMonth() + tmp.getStartYear() + " - " + tmp.getEndDay() + 
                    tmp.getEndMonth() + tmp.getEndYear() + "\n" + tmp.getContent());

            this.textArea.setText(string1);
        }
        catch(Exception e){
            if(this.itemList.getSelectedIndex() >= 0)
            this.textArea.setText("There is no record associated with this number");
        }
        
    }//GEN-LAST:event_itemListValueChanged

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            int tmpint = (this.itemList.getSelectedIndex()-1);
            String tmpstr = (this.catComboBox.getSelectedItem().toString());

            this.output.deleteContainer(tmpstr, tmpint);
            
        }catch(Exception e){
            System.out.println("Something went wrong" + e);
        }
        finally{
            this.record = new EntryRecord(this.output.getRecord());
            this.output = new OutputText(record);
            this.output.catagorize();
                       
            System.out.println("Size = " + this.output.getRecord().size());
            
            for(entryContainer cont : this.output.getRecord()){
                System.out.println("Remaining categories are: " + cont.category + cont.content);
            }
            catCombo();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        
        try{
            this.tmpint2 = (this.itemList.getSelectedIndex()-1);
            this.tmpstr2 = (this.catComboBox.getSelectedItem().toString());
            
            this.tmp2 = this.output.getFromList(this.tmpstr2, this.tmpint2);
            
            System.out.println("from list " + this.tmpint2);
            System.out.println("from catComboBox " + this.tmpstr2);
            System.out.println("from Container " + this.tmp2.getContent());
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    mod = new ModifyGUI(tmp2, record, tmpint2, tmpstr2, output);
                    mod.setVisible(true);      
                }
                
            });
        }
        catch(Exception e){
            System.out.println("Something went wrong in modifyButtonActionPerformed... " + e);
        }
        
        
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            if(!mod.isAlive){
                
                //Object instantiated, good condition
                this.record = new EntryRecord(mod.getRecord().record);
                this.output = new OutputText(mod.getRecord());
                this.output.catagorize();
                catCombo();
                
                System.out.println("Saved...");              
            }
            else if(mod.isAlive){
                System.out.println("No changes to save...");
            }
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException in saveButtonActionPerformed..."
                    + "\nmod never instantiated...");
            System.out.println("No changes to save...");
        }
    }//GEN-LAST:event_saveButtonActionPerformed
    
    EntryRecord update(){
        return this.record;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JList<String> itemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
