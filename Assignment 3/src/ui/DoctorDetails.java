/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Doctor;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
import model.SystemClass;

/**
 *
 * @author Dhruvil
 */
public class DoctorDetails extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDetails
     */
    JPanel workArea;
    PersonDirectory person;
    PatientDirectory ptDirectory;
    DoctorDirectory docDirectory;
    HospitalDirectory hospDirectory;
    City commDirectory;
    SystemClass sys;
    public DoctorDetails(JPanel workArea, PersonDirectory person, PatientDirectory ptDirectory, DoctorDirectory docDirectory, 
                            HospitalDirectory hospDirectory,City commDirectory,SystemClass sys) {
        initComponents();
        this.workArea = workArea;
        this.ptDirectory = ptDirectory;
        this.person= person;
        this.docDirectory = docDirectory;
        this.hospDirectory = hospDirectory;
        this.commDirectory = commDirectory;
        this.sys = sys;
        
        populateDoctable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabDoctor = new javax.swing.JTable();

        tabDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Degree", "Experience", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabDoctor);
        if (tabDoctor.getColumnModel().getColumnCount() > 0) {
            tabDoctor.getColumnModel().getColumn(0).setResizable(false);
            tabDoctor.getColumnModel().getColumn(1).setResizable(false);
            tabDoctor.getColumnModel().getColumn(2).setResizable(false);
            tabDoctor.getColumnModel().getColumn(3).setResizable(false);
            tabDoctor.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void populateDoctable() {
        DefaultTableModel model = (DefaultTableModel) tabDoctor.getModel();
        
        model.setRowCount(0);
        
        for(Doctor doc : docDirectory.getDocDirectory()){
            Object[] row = new Object[5];
            row[0] = doc;
            row[1] = doc.getPerson().getName();
            row[2] = doc.degree;
            row[3] = doc.experience;
            row[4] = doc.avail;
            
            
            model.addRow(row);
        }
  
//        DefaultListModel list = new DefaultListModel();
//        for(Doctor doc : docDirectory.getDocDirectory()){
//            list.addElement(doc);
//        }
//        listSearch.setModel(list);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabDoctor;
    // End of variables declaration//GEN-END:variables
}