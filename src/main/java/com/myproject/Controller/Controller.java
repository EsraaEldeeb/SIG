
package com.myproject.Controller;
import com.myproject.Model.InvTableModel;
import com.myproject.Model.Invoice;
import com.myproject.Model.Line;
import com.myproject.Model.LinesTableModel;
import com.myproject.View.CreateNewInvoice;
import com.myproject.View.InvoiceForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener , ListSelectionListener{

    private InvoiceForm frame;
    private CreateNewInvoice createNewInvoiceFrame;
    
    
    public Controller (InvoiceForm frame)
    {
     this.frame = frame;
    
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String actionComand = e.getActionCommand();
       System.out.println("Action:"  + actionComand);
       
        switch (actionComand) 
          {
           case "Load File":
               LoadFile();
             break;
           
           case "Save File":
               saveFile();
             break;
           
           case "Delete Invoice":
               deleteInvoice();
             break;
           
           case "Create New Item":
               createNewItem();
             break;
           
           case "Create New Invoice":
               createNewInvoice();
             break;
          
           case "Delete Item":
               deleteItem();
             break;
             
           case "Ok":
                SaveInvoice();
           break;
           
           case "CancelCreate":
               CancelCreate();
               break;
           
           
      
          }  
    }
    
    
    

    private void LoadFile()
    {
      
     JFileChooser fc = new JFileChooser();
     
     try {
         
     int result=fc.showOpenDialog(frame);
    
     if (result == JFileChooser.APPROVE_OPTION)
           {    
           File headerFile = fc.getSelectedFile();
           Path headerPath = Paths.get (headerFile.getAbsolutePath());
          List<String> headerLines = Files.readAllLines(headerPath);
      System.out.println("InvoiceHeader read sucessfully");
    
          //1,22-11-2020,Ali      
          ArrayList<Invoice> invoicesArray = new  ArrayList<>() ;
        for (String headerLine : headerLines )
           {
            String[] headerParts = headerLine.split(",");
            int invoiceNum = Integer.parseInt(headerParts[0]);
            String invoceDate = headerParts[1];
            String customerName = headerParts[2];  
            
            
            Invoice invoice = new Invoice( invoiceNum,  invoceDate ,   customerName);
             
            invoicesArray.add(invoice);
            
              }
  
       System.out.println("Check point");
      
      result = fc.showOpenDialog(frame);
      if (result == JFileChooser.APPROVE_OPTION)
      {
      File lineFile= fc.getSelectedFile();       
      Path linePath = Paths.get (lineFile.getAbsolutePath());
        List<String> lineLines = Files.readAllLines(linePath);
      System.out.println("Lines have been red sucessfully");
           
     
// 1,Mobile,3200,1

  for (String lineLine : lineLines )
           {
            String[] lineParts = lineLine.split(",");
            int invoiceNum = Integer.parseInt(lineParts[0]);
            String itemName = lineParts[1];  
             double itemPrice =  Double.parseDouble(lineParts[2]);
             int count = Integer.parseInt(lineParts[3]);

           Invoice inv = null;
for ( Invoice invoice : invoicesArray)
        { 
         if (invoice.getInvoicenum() == invoiceNum )
           {  inv = invoice;
             break;
           }
       }

Line line = new Line (itemName ,itemPrice ,count , inv);
 inv.getLines().add(line);
           }
  
  System.out.println( "Lines added sucessfully");

      }
         
           
           frame.setInvoices(invoicesArray);
           InvTableModel invoicesTableModel = new  InvTableModel(invoicesArray);
           frame.setInvoicesTableModel(invoicesTableModel);
           frame.getInvoiceTable().setModel(invoicesTableModel);
           frame.getInvoicesTableModel().fireTableDataChanged();
   
           
           
           
           
           
           }
     
          }
      
        catch (IOException ex)  
        {ex.printStackTrace();}
            
       }

    public Controller() {
    }
    
 
   
    private void saveFile() {
     
    }

    private void deleteInvoice() {
      int selectedRow  =frame.getInvoiceTable().getSelectedRow();
        if( selectedRow != -1)
                {
                    frame.getInvoices().remove(selectedRow);
                    frame.getInvoicesTableModel().fireTableDataChanged();
                }
              
    }

    private void createNewItem() {
     
    }

    private void createNewInvoice() {
        
        createNewInvoiceFrame = new CreateNewInvoice(frame);
        createNewInvoiceFrame.setVisible(true);
                
        
        
    }
    
    
    

    private void deleteItem() {
      
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
         int selectedIndex  =frame.getInvoiceTable().getSelectedRow();
        if(selectedIndex != -1){    
        System.out.println("You have selected row :" +selectedIndex  );
        Invoice CurrentInvoice =frame.getInvoices().get(selectedIndex);
       frame.getInvoiceNumberLabel().setText(" " +CurrentInvoice.getInvoicenum());
       frame.getInvoiceDateLabel().setText(CurrentInvoice.getDate());
       frame.getCustomerNameLabel().setText (CurrentInvoice.getCustomer());
       frame.getInvoiceTotalLabel().setText(" " +CurrentInvoice.getTotalInvoice());
      LinesTableModel linesTableModel = new  LinesTableModel (CurrentInvoice.getLines());
      frame.getLineTable().setModel(linesTableModel);
      linesTableModel.fireTableDataChanged();
        }
                
                
                
        
        
    }

    private void SaveInvoice() {
     
    String customerName = createNewInvoiceFrame.getCustomerNameTXTField().getText();
    String date = createNewInvoiceFrame.getDateTXTField().getText();
    int invoiceNum = frame.getNextInvoiceNum();
  
    
   Invoice inv = new Invoice(invoiceNum, date, customerName);
   
    createNewInvoiceFrame.setVisible(false);
    
    frame.getInvoices().add(inv);
    frame.getInvoicesTableModel().fireTableDataChanged();
    
    
    
    
    
    
    
    }

    private void CancelCreate() {
    createNewInvoiceFrame.setVisible(false);
    }
    
    
}
