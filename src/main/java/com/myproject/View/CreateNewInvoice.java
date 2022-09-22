
package com.myproject.View;

import com.myproject.Controller.Controller;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class CreateNewInvoice extends javax.swing.JDialog {


    public CreateNewInvoice(InvoiceForm parent) {
        initComponents();
        CancelButton.addActionListener(parent.getController());
        OkButton.addActionListener(parent.getController());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OkButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        CustomerNameTXTField = new javax.swing.JTextField();
        DateTXTField = new javax.swing.JTextField();
        CustomerNameLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OkButton.setText("Ok");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.setActionCommand("CancelCreate");

        CustomerNameLabel.setText("Customer Name :");

        DateLabel.setText("Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(OkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(CancelButton)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomerNameLabel)
                    .addComponent(DateLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CustomerNameTXTField, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(DateTXTField))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerNameLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel)
                    .addComponent(DateTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkButton)
                    .addComponent(CancelButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JTextField CustomerNameTXTField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField DateTXTField;
    private javax.swing.JButton OkButton;
    // End of variables declaration//GEN-END:variables

    public JTextField getCustomerNameTXTField() {
        return CustomerNameTXTField;
    }

    public void setCustomerNameTXTField(JTextField CustomerNameTXTField) {
        this.CustomerNameTXTField = CustomerNameTXTField;
    }

    public JTextField getDateTXTField() {
        return DateTXTField;
    }

    public void setDateTXTField(JTextField DateTXTField) {
        this.DateTXTField = DateTXTField;
    }




}








