
package com.myproject.View;

import com.myproject.Controller.Controller;
import com.myproject.Model.InvTableModel;
import com.myproject.Model.Invoice;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

public class InvoiceForm extends javax.swing.JFrame {

   
    public InvoiceForm() {
        initComponents();
     
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        deleteBtn.addActionListener(controller);

        invoiceDateLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceNumberLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(controller);
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoiceTable.getSelectionModel().addListSelectionListener(controller);
        createInvoiceBtn = new javax.swing.JButton();
        createInvoiceBtn.addActionListener(controller);
        invoiceNumberLabel1 = new javax.swing.JLabel();
        invoiceDateLabel1 = new javax.swing.JLabel();
        customerNameLabel1 = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        customerNameLabel2 = new javax.swing.JLabel();
        createNewItemBtn = new javax.swing.JButton();
        createNewItemBtn.addActionListener(controller);

        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        LoadFileMenuItem = new javax.swing.JMenuItem();
        LoadFileMenuItem.addActionListener(controller);
        SaveFileMenuItem = new javax.swing.JMenuItem();
        SaveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("x");

        jPanel1.setOpaque(false);

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(lineTable);

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Delete Item");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteBtn)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        invoiceDateLabel.setForeground(new java.awt.Color(105, 105, 105));
        invoiceDateLabel.setText("Invoice Date ");

        customerNameLabel.setForeground(new java.awt.Color(105, 105, 105));
        customerNameLabel.setText("Customer Name ");

        invoiceNumberLabel.setForeground(new java.awt.Color(105, 105, 105));
        invoiceNumberLabel.setText("Invoice Number ");
        invoiceNumberLabel.setToolTipText("");

        deleteInvoiceBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteInvoiceBtn.setForeground(new java.awt.Color(255, 0, 0));
        deleteInvoiceBtn.setText("Delete Invoice");
        deleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceBtnActionPerformed(evt);
            }
        });

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        createInvoiceBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createInvoiceBtn.setText("Create New Invoice");
        createInvoiceBtn.setDefaultCapable(false);
        createInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceBtnActionPerformed(evt);
            }
        });

        invoiceNumberLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invoiceNumberLabel1.setText("Invoice Number :");
        invoiceNumberLabel1.setToolTipText("");

        invoiceDateLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invoiceDateLabel1.setText("Invoice Date :");

        customerNameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerNameLabel1.setText("Customer Name :");

        InvoiceTotalLabel.setForeground(new java.awt.Color(105, 105, 105));
        InvoiceTotalLabel.setText("Invoice Total ");

        customerNameLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerNameLabel2.setText("Invoice Total : ");

        createNewItemBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createNewItemBtn.setText("Create New Item");
        createNewItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewItemBtnActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        LoadFileMenuItem.setText("Load File");
        LoadFileMenuItem.setName("Load File"); // NOI18N
        LoadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(LoadFileMenuItem);

        SaveFileMenuItem.setText("Save File");
        SaveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SaveFileMenuItem);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteInvoiceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoiceNumberLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(invoiceNumberLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceDateLabel1)
                                    .addComponent(customerNameLabel1)
                                    .addComponent(customerNameLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerNameLabel)
                                    .addComponent(InvoiceTotalLabel)
                                    .addComponent(invoiceDateLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(createInvoiceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewItemBtn)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createInvoiceBtn)
                            .addComponent(createNewItemBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteInvoiceBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNumberLabel1)
                    .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceDateLabel)
                    .addComponent(invoiceDateLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(customerNameLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel2)
                    .addComponent(InvoiceTotalLabel))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInvoiceBtnActionPerformed

    private void createInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvoiceBtnActionPerformed

    private void LoadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFileMenuItemActionPerformed

    private void SaveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileMenuItemActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createNewItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createNewItemBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JMenuItem LoadFileMenuItem;
    private javax.swing.JMenuItem SaveFileMenuItem;
    private javax.swing.JButton createInvoiceBtn;
    private javax.swing.JButton createNewItemBtn;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerNameLabel1;
    private javax.swing.JLabel customerNameLabel2;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JLabel invoiceDateLabel1;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel invoiceNumberLabel1;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    // End of variables declaration//GEN-END:variables
private ArrayList<Invoice> invoices;


private Controller controller = new Controller(this);

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
        
        
        
    }

   
  private InvTableModel invoicesTableModel;

    public InvTableModel getInvoicesTableModel() {
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(InvTableModel invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public JLabel getInvoiceDateLabel() {
        return invoiceDateLabel;
    }

    public JLabel getInvoiceNumberLabel() {
        return invoiceNumberLabel;
    }

    public JTable getInvoiceTable() {
        return invoiceTable;
    }

    public JLabel getInvoiceTotalLabel() {
        return InvoiceTotalLabel;
    }

    public JTable getLineTable() {
        return lineTable;
    }

    public Controller getController() {
        return controller;
    }
 


    public int getNextInvoiceNum()
    {
    int num=0;
            
            for ( Invoice invoice: invoices)
            {
            if(invoice.getInvoicenum()> num)
                {
                num = invoice.getInvoicenum();
                }
            }
    
     return num +1 ;
    }
    
    
}


