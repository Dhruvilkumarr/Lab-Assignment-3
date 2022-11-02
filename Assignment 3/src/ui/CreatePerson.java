/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.City;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.SystemClass;

/**
 *
 * @author Dhruvil
 */
public class CreatePerson extends javax.swing.JPanel {

    /**
     * Creates new form CreatePerson
     */
    JPanel workArea;
    PatientDirectory ptDirectory;
    PersonDirectory person;
    DoctorDirectory docDirectory;
    HospitalDirectory hospDirectory;
    City commDirectory;
    SystemClass sys;
    
    public CreatePerson(JPanel workArea,PatientDirectory ptDirectory,PersonDirectory person,DoctorDirectory docDirectory,
                            HospitalDirectory hospDirectory,City commDirectory,SystemClass sys) {
        initComponents();
        this.person = person;
        this.workArea = workArea;
        this.ptDirectory = ptDirectory;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCity = new javax.swing.JComboBox<>();
        cmbcomm = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtaptno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtcellph = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        cmbgender = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtstreet = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        calculateAge = new javax.swing.JButton();
        cmbDate = new com.toedter.calendar.JDateChooser();

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Toronto", "Brampton","Scarborough","Vancouver", "" }));

        cmbcomm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "William Osler Health System", "North York General Hospital", "	Humber River Hospital" }));
        cmbcomm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcommActionPerformed(evt);
            }
        });

        jLabel1.setText("Select City");

        jLabel2.setText("Select Community");

        jLabel3.setText("Name");

        jLabel4.setText("Gender");

        jLabel5.setText("Date of Birth");

        jLabel7.setText("House No.");

        jLabel6.setText("Cell Phone");

        txtaptno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaptnoActionPerformed(evt);
            }
        });
        txtaptno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaptnoKeyPressed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtage.setEditable(false);
        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtageKeyPressed(evt);
            }
        });

        txtcellph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcellphKeyPressed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female", "Other", " " }));

        jLabel8.setText("Street Name");

        jLabel9.setText("Age");

        calculateAge.setText("Calculate age");
        calculateAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtstreet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtcellph))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calculateAge)))
                                .addGap(0, 13, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtaptno)
                    .addComponent(cmbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbcomm, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbcomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtaptno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtstreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(calculateAge))
                    .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcellph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtaptnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaptnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaptnoActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtname.getText();
        String gender = cmbgender.getSelectedItem().toString();
        String cellph = txtcellph.getText();
        String street = txtstreet.getText();
        String city = cmbCity.getSelectedItem().toString();
        String comm = cmbcomm.getSelectedItem().toString();
        String agechk = txtage.getText();
        String aptnochk = txtaptno.getText();
        
        
        
        if (name.isEmpty() || gender.isEmpty() || agechk.isEmpty() || cellph.isEmpty() || city.isEmpty()
                 || comm.isEmpty() || aptnochk.isEmpty() || street.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Fill in all the details");
        } else if(cellph.length() != 10) {
                    JOptionPane.showMessageDialog(null, "Incorrect cellphone number");

        } else {
            
             int age = Integer.parseInt(txtage.getText());
             int aptno = Integer.parseInt(txtaptno.getText());
             Person pc = person.addNewPerson();
             
             pc.setName(name);
             pc.setAge(age);
             pc.setCellph(cellph);
             pc.setGender(gender);
             pc.setAptno(aptno);
             pc.setStreet(street);
             pc.setCity(city);
             pc.setComm(comm);
             
             
             int x = JOptionPane.showConfirmDialog(null, "Do you want to proceed to register as Patient ?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
             if(x == JOptionPane.YES_OPTION){
                    CreatePatient panpatient = new CreatePatient(workArea, person, ptDirectory, docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("CreatePatient", panpatient );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.next(workArea);
                 
             }else if(x == JOptionPane.NO_OPTION){
                    PatientPanel patty = new PatientPanel( workArea, person,  ptDirectory,  docDirectory,  hospDirectory, commDirectory, sys);
                    workArea.add("Patient", patty );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.previous(workArea);
             }
             
             
            
         }
        
       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void cmbcommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcommActionPerformed

    private void txtageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == 8){
            txtage.setEditable(true);
            
        } else {
            txtage.setEditable(false);
            
        }
    }//GEN-LAST:event_txtageKeyPressed

    private void txtcellphKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcellphKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == 8){
            txtcellph.setEditable(true);
            
        } else {
            txtcellph.setEditable(false);
            
        }
    }//GEN-LAST:event_txtcellphKeyPressed

    private void txtaptnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaptnoKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == 8){
            txtaptno.setEditable(true);
            
        } else {
            txtaptno.setEditable(false);
            
        }
    }//GEN-LAST:event_txtaptnoKeyPressed

    private void calculateAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateAgeActionPerformed
        // TODO add your handling code here:
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-y");
            String thedate = dateFormat.format(cmbDate.getDate());
        
            String dob = ((JTextField)(cmbDate.getDateEditor().getUiComponent())).getText();
    //        System.out.println("" +dob);
            String dob2[] = dob.split("-");
            int date = Integer.parseInt(dob2[0]);
            int month = Integer.parseInt(dob2[1]);
            int year = Integer.parseInt(dob2[2]);

            LocalDate selectedDate = LocalDate.of(year, month, date);
            LocalDate currentDate = LocalDate.now();
            int resultyear = Period.between(selectedDate,currentDate).getYears();
            txtage.setText(String.valueOf(resultyear));
            
        } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid date");
        }

    }//GEN-LAST:event_calculateAgeActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JButton calculateAge;
    private javax.swing.JComboBox<String> cmbCity;
    private com.toedter.calendar.JDateChooser cmbDate;
    private javax.swing.JComboBox<String> cmbcomm;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtaptno;
    private javax.swing.JTextField txtcellph;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstreet;
    // End of variables declaration//GEN-END:variables
}
