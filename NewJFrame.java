/**
 * Author:      Mason Palma
 * File:        ModifyGUI.java
 * Purpose:     This class provides main GUI and main class.
 * 
 */

package ProjectPackage;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    
    String impact, startDay, startMonth, startYear, endDay, endMonth, endYear, 
            content, category;
    
    String[] adminInfo = new String[6];
    
    LocalDateTime dateObject = LocalDateTime.now();
    DateTimeFormatter dateObjectDay = DateTimeFormatter.ofPattern("dd");
    DateTimeFormatter dateObjectMonth = DateTimeFormatter.ofPattern("MMM");
    DateTimeFormatter dateObjectYear = DateTimeFormatter.ofPattern("yyyy");
    
    //entry record holds linked list of entryContainers
    entryContainer current,tmp;
    EntryRecord record;
    ToFile toFile = new ToFile();
    AdminToFile adminToFile = new AdminToFile();
    AdminDataPane adminDataPane;
    writeToFile wr = new writeToFile();
    FromFile fromfile = new FromFile(wr.myObj.getAbsolutePath());
    
    OutputText test;
    ExportRecord exportRecord;
    ModifyRecordGUI modrecgui;
    File loadedFile;
    
    ImageIcon icon = new ImageIcon("us-navy-icon-7.jpg");
    
    String adminData;
    
    public NewJFrame() {
        initComponents();
        setDefaultDateValues();
        this.fromfile.getLine();
        
        if (fromfile.adminDataSentinalCheck() == true){
            this.adminInfo = fromfile.getAdminData();
        }
        
        this.record = this.fromfile.getRecord();
        this.pathLabel.setText(this.wr.myObj.getAbsolutePath());
        
        makeAdminData();
        
    }
    
    void setDefaultDateValues(){
        this.dayBoxStart.setSelectedItem(this.dateObject.format(dateObjectDay));
        this.monthBoxStart.setSelectedItem(this.dateObject.format(dateObjectMonth));
        this.yearBoxStart.setSelectedItem(this.dateObject.format(dateObjectYear));
        
        this.dayBoxEnd.setSelectedItem(this.dateObject.format(this.dateObjectDay));
        this.monthBoxEnd.setSelectedItem(this.dateObject.format(this.dateObjectMonth));
        this.yearBoxEnd.setSelectedItem(this.dateObject.format(this.dateObjectYear));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        impactBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        dayBoxStart = new javax.swing.JComboBox<>();
        monthBoxStart = new javax.swing.JComboBox<>();
        yearBoxStart = new javax.swing.JComboBox<>();
        startLabel = new javax.swing.JLabel();
        yearFormatLabel = new javax.swing.JLabel();
        pathLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        categoryBox = new javax.swing.JComboBox<>();
        endLabel = new javax.swing.JLabel();
        dayBoxEnd = new javax.swing.JComboBox<>();
        monthBoxEnd = new javax.swing.JComboBox<>();
        yearBoxEnd = new javax.swing.JComboBox<>();
        viewButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        sameButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        sortButton = new javax.swing.JButton();
        adminDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("brag sheet");
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(234, 228, 216));
        setMinimumSize(new java.awt.Dimension(448, 361));
        setResizable(false);

        textBox.setColumns(20);
        textBox.setRows(5);
        textBox.setMaximumSize(new java.awt.Dimension(232, 84));
        jScrollPane1.setViewportView(textBox);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Content");

        impactBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Moderate", "High" }));
        impactBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impactBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Impact");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setText("brag sheet");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        dayBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthBoxStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxStartActionPerformed(evt);
            }
        });

        yearBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        startLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        startLabel.setText("Start Date");

        yearFormatLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        yearFormatLabel.setText("DD/MMM/YYYY");

        pathLabel.setBackground(new java.awt.Color(204, 204, 204));
        pathLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        pathLabel.setForeground(new java.awt.Color(0, 102, 0));
        pathLabel.setText("                                               ");

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoryLabel.setText("Category");

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duties and Responsibilities", "Job Accomplishments & Initiative", "Supervision and Leadership", "Special Achievements", "Off-Duty Activities", "Collateral Duties", "Education (Navy, Personal)", "Qualifications" }));

        endLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        endLabel.setText("End Date");

        dayBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        yearBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        viewButton.setText("View Record");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load Record");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        modifyButton.setBackground(new java.awt.Color(255, 153, 0));
        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        exportButton.setBackground(new java.awt.Color(0, 51, 51));
        exportButton.setForeground(new java.awt.Color(51, 255, 51));
        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        sameButton.setText("same");
        sameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sameButtonActionPerformed(evt);
            }
        });

        resetButton.setText("reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*.txt", "*.docx", "*.pdf" }));

        jLabel4.setText("as");

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        adminDataButton.setText("Admin Data");
        adminDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoryLabel)
                                    .addComponent(endLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dayBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dayBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(monthBoxStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(monthBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(yearBoxStart, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(yearBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(resetButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(yearFormatLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sameButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)))
                                        .addGap(41, 41, 41))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4))
                                            .addComponent(impactBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adminDataButton))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(createButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(pathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {resetButton, sameButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearFormatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dayBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBoxStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endLabel)
                            .addComponent(monthBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sameButton))))
                .addComponent(pathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(impactBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDataButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportButton)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton)
                    .addComponent(saveButton)
                    .addComponent(modifyButton)
                    .addComponent(loadButton)
                    .addComponent(viewButton)
                    .addComponent(sortButton))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    void makeAdminData(){
        
        this.adminData = (
        "Administrative data:\n" + 
        "\ta.  Full Name: \n\t\t" + this.adminInfo[0] + "\n" +
        "\tb.  Rate and warfare/qualification designators(s): \n\t\t" + this.adminInfo[1] + "\n" +
        "\tc.  SSN: \n\t\t" + "\n" +
        "\td.  Branch: \n\t\t" + this.adminInfo[4] + "\n" +
        "\te.  Date reported: \n\t\t" + this.adminInfo[2] + "\n" +
        "\tf.  Ending date of last evaluation: \n\t\t" + this.adminInfo[3] + "\n" +
        "\tg.  Date of rate: \n\t\t" + this.adminInfo[5] + "\n\n"
        );
        
    }
    
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        getUpdate();
        
        if(!this.textBox.getText().equals("")){
        
        this.impact = impactBox.getSelectedItem().toString();
        this.startDay = dayBoxStart.getSelectedItem().toString();
        this.startMonth = monthBoxStart.getSelectedItem().toString();
        this.startYear = yearBoxStart.getSelectedItem().toString();
        this.category = categoryBox.getSelectedItem().toString();
        this.endDay = dayBoxEnd.getSelectedItem().toString();
        this.endMonth = monthBoxEnd.getSelectedItem().toString();
        this.endYear = yearBoxEnd.getSelectedItem().toString();
        this.content = textBox.getText();
        
        System.out.println("Category: " + this.category);
        System.out.println("Impact: " + this.impact);
        System.out.println("Start Date: " + this.startDay + this.startMonth + this.startYear);
        System.out.println("End Date: " + this.endDay + this.endMonth + this.endYear);
        System.out.println(this.content);
        
        //String category, String startDay, String startMonth, String startYear, 
        //    String endDay, String endMonth, String endYear, String impact, 
        //    String content
        this.current = new entryContainer(this.category, this.startDay, 
                this.startMonth, this.startYear, this.endDay, this.endMonth, 
                this.endYear, this.impact, this.content);
        
        this.record.addRecord(this.current);
        
        textBox.setText("");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Content cannot be empty.. ", "Whoops! ", JOptionPane.INFORMATION_MESSAGE, this.icon);
        }
    }                                            
    
    private void monthBoxStartActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try{
        
        JButton open = new JButton();
        this.fileChooser = new JFileChooser();
        this.fileChooser.setCurrentDirectory(new java.io.File("."));
        this.fileChooser.setDialogTitle("Open Bragsheet Record");
        this.fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        if (this.fileChooser.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
            
        }
        
        if (this.fileChooser.getSelectedFile().getName().contains(".bragsheet")){
        
        this.pathLabel.setText("");
        this.pathLabel.setText("Brag Sheet Record: " + this.fileChooser.getSelectedFile().getName());
        this.loadedFile = new File(this.fileChooser.getSelectedFile().getAbsolutePath());
        
        this.fromfile = new FromFile(this.fileChooser.getSelectedFile().getAbsolutePath());
        fromfile.getLine();
        
        if (fromfile.adminDataSentinalCheck() == true){
            this.adminInfo = fromfile.getAdminData();
        }
        
        this.record = fromfile.getRecord();
        
        System.out.println("Loaded File = " + this.loadedFile.getName());
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "File not compatible..", "Whoops! ", JOptionPane.INFORMATION_MESSAGE, this.icon);
        }
  
        
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception caught: " + e);
        }
    }                                          
    
    void getUpdate(){
        try{
            if(this.modrecgui.update().record != null){
                this.record = this.modrecgui.update();    
            }
            else{
                System.out.println("Record has not been instantiated...");
            }
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException in getUpdate");
        }
    }
    
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        getUpdate();
        
        this.test = new OutputText();
        this.test.setRecord(this.record);
        this.test.catagorize();
        this.test.testContents();
        
        JOptionPane.showMessageDialog(rootPane, test.grabValues(), "Current Record..", JOptionPane.INFORMATION_MESSAGE, this.icon);
        
    }                                          

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        getUpdate();
        
        String tmp = "";
        String tmp2 = "";
        String tmp3 = "";
        
        if (this.adminDataPane.changedFromDefault == true){
            System.out.println("adminDataPane changed from default...");
            this.adminInfo = this.adminDataPane.getValues();
            
            if (adminInfo[0] != null && adminInfo[1] != null && adminInfo[2] != null
                && adminInfo[3] != null && adminInfo[4] != null && adminInfo[5] != null
                ){

                tmp3 = adminToFile.formatText(adminInfo);
                System.out.println(tmp);
            }
        }
        
        for(entryContainer cont : this.record.record){
            tmp = toFile.formatText(cont);
            System.out.println(tmp);
            tmp2 += tmp;
        }
        tmp3 += tmp2;
        wr.writeOut(tmp3);
        System.out.println("The current record size " + this.record.record.size());
        
        tmp = "";
        
        
    }                                          

    private void impactBoxActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    modrecgui = new ModifyRecordGUI(record, test);
                    modrecgui.setVisible(true);
                }
            });}
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("TEST");
        }
    }                                            

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             

        try{
            getUpdate();
            makeAdminData();
            this.test = new OutputText();
            this.test.setRecord(this.record);
            this.test.catagorize();
            this.test.testContents();

            this.exportRecord = new ExportRecord();
            this.exportRecord.writeOut(this.adminData + this.test.grabValues());
            
            JOptionPane.showMessageDialog(rootPane, ("Record exported! \n" + exportRecord.getfilepath()), "Successful export!" , JOptionPane.INFORMATION_MESSAGE , this.icon);
            
        }
        catch(Exception e){
            System.out.println("Something went wrong.." + e);
        }
    }                                            

    private void sameButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        try{
            this.dayBoxEnd.setSelectedItem(this.dayBoxStart.getSelectedItem());
            this.monthBoxEnd.setSelectedItem(this.monthBoxStart.getSelectedItem());
            this.yearBoxEnd.setSelectedItem(this.yearBoxStart.getSelectedItem());
        }catch(Exception e){
            System.out.println("Exception thrown from " + e);
        }
    }                                          

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        setDefaultDateValues();
    }                                           

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(rootPane, "This feature has not been finished.");
    }                                          

    private void adminDataButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        adminDataPane = new AdminDataPane(this.adminInfo);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adminDataPane.setVisible(true);
            }
        });
    }                                               

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame prog = new NewJFrame();
                prog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton adminDataButton;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JComboBox<String> dayBoxEnd;
    private javax.swing.JComboBox<String> dayBoxStart;
    private javax.swing.JLabel endLabel;
    private javax.swing.JButton exportButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JComboBox<String> impactBox;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton modifyButton;
    private javax.swing.JComboBox<String> monthBoxEnd;
    private javax.swing.JComboBox<String> monthBoxStart;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton sameButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel startLabel;
    private javax.swing.JTextArea textBox;
    private javax.swing.JButton viewButton;
    private javax.swing.JComboBox<String> yearBoxEnd;
    private javax.swing.JComboBox<String> yearBoxStart;
    private javax.swing.JLabel yearFormatLabel;
    // End of variables declaration                   
}
