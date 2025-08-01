/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hirusha
 */
public class RoutePanel extends javax.swing.JPanel
{

    /**
     * Creates new form RoutePanel
     */
    public RoutePanel()
    {
        initComponents();
        
        jTableR.addMouseListener(new java.awt.event.MouseAdapter()
        {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                int selectedRow = jTableR.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) jTableR.getModel();

                txtRid.setText(model.getValueAt(selectedRow, 0).toString());
                textDist.setText(model.getValueAt(selectedRow, 1).toString());
                txtSloc.setText(model.getValueAt(selectedRow, 2).toString());
                txtEloc.setText(model.getValueAt(selectedRow, 3).toString()); 
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSloc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRid = new javax.swing.JTextField();
        txtEloc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textDist = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableR = new javax.swing.JTable();
        btnUpd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(821, 612));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.setActionCommand("ADD");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 110, 40));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Route ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txtSloc.setBackground(new java.awt.Color(236, 236, 236));
        txtSloc.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        txtSloc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlocActionPerformed(evt);
            }
        });
        add(txtSloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 150, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Start Location");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, -1));

        txtRid.setBackground(new java.awt.Color(236, 236, 236));
        txtRid.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        txtRid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtRid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 150, 30));

        txtEloc.setBackground(new java.awt.Color(236, 236, 236));
        txtEloc.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        txtEloc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElocActionPerformed(evt);
            }
        });
        add(txtEloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 150, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("End Location");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, -1));

        textDist.setBackground(new java.awt.Color(236, 236, 236));
        textDist.setFont(new java.awt.Font("Poppins", 0, 17)); // NOI18N
        textDist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDistActionPerformed(evt);
            }
        });
        add(textDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 150, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Distance");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, -1));

        btnAdd.setBackground(new java.awt.Color(249, 93, 44));
        btnAdd.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 90, 40));

        btnDel.setBackground(new java.awt.Color(249, 93, 44));
        btnDel.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("DELETE");
        btnDel.setActionCommand("ADD");
        btnDel.setBorder(null);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 90, 40));

        jTableR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RouteID", "Distance", "Start", "End"
            }
        ));
        jScrollPane2.setViewportView(jTableR);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 720, 220));

        btnUpd.setBackground(new java.awt.Color(249, 93, 44));
        btnUpd.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnUpd.setForeground(new java.awt.Color(255, 255, 255));
        btnUpd.setText("UPDATE");
        btnUpd.setActionCommand("ADD");
        btnUpd.setBorder(null);
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });
        add(btnUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlocActionPerformed

    private void txtElocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElocActionPerformed

    private void textDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDistActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File file = new File("data/route_data.txt");
        try
        {
            FileWriter fw = new FileWriter("data/route_data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0; i<jTableR.getRowCount(); i++)
            {//Rows Table
                for(int j = 0; j<jTableR.getColumnCount(); j++)
                {
                    bw.write(jTableR.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(this, "Saved successfully.");
        }
        catch(IOException ex)
        {
            Logger.getLogger(AssetPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to save. Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtRid.getText().equals("")||textDist.getText().equals("")||txtSloc.getText().equals("")||txtEloc.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter all the details");
        }
        
        else
        {
            String data[] = {txtRid.getText(),textDist.getText(),txtSloc.getText(),txtEloc.getText()};
            DefaultTableModel tbModel = (DefaultTableModel)jTableR.getModel();
               
            tbModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Data added successfully");
               
            txtRid.setText("");
            textDist.setText("");
            txtSloc.setText("");
            txtEloc.setText("");
        }   
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        DefaultTableModel tbModel = (DefaultTableModel)jTableR.getModel();
        
        if(jTableR.getSelectedRowCount()==1)
        {
           tbModel.removeRow(jTableR.getSelectedRow());
        }
        
        else
        {
           if(jTableR.getSelectedRow()==0)
           {
               JOptionPane.showMessageDialog(this, "The table is empty");
           } 
           else
           {
               JOptionPane.showMessageDialog(this, "Please select a single row to delete");
           }
        }
        
        txtRid.setText("");
        textDist.setText("");
        txtSloc.setText("");
        txtEloc.setText("");
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        int selectedRow = jTableR.getSelectedRow();
        
        if (selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
       
        DefaultTableModel model = (DefaultTableModel) jTableR.getModel();
       
        model.setValueAt(txtRid.getText(), selectedRow, 0);
        model.setValueAt(textDist.getText(), selectedRow, 1);
        model.setValueAt(txtSloc.getText(), selectedRow, 2);
        model.setValueAt(txtEloc.getText(), selectedRow, 3);
        
        JOptionPane.showMessageDialog(this, "Row updated successfully.");
        
        txtRid.setText("");
        textDist.setText("");
        txtSloc.setText("");
        txtEloc.setText("");
    }//GEN-LAST:event_btnUpdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnUpd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableR;
    private javax.swing.JTextField textDist;
    private javax.swing.JTextField txtEloc;
    private javax.swing.JTextField txtRid;
    private javax.swing.JTextField txtSloc;
    // End of variables declaration//GEN-END:variables
}