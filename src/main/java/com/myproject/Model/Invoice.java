
package com.myproject.Model;

import java.util.ArrayList;



public class Invoice {
    
    private int invoicenum;
    private String date;
    private String customer;
    private ArrayList<Line> lines;
  
    
      public Invoice() {
    }

    public Invoice(int invoicenum, String date, String customer) {
        this.invoicenum = invoicenum;
        this.date = date;
        this.customer = customer;
    }
    
    public double getTotalInvoice()
    {
        double total = 0.0;
        for ( Line line : getLines())
        {total += line.getTotalLine();}
        return total ;
    
  
    
    }

    public ArrayList<Line> getLines() {
      if (lines == null)
      {lines = new ArrayList<>();}
        return lines;
        
    }
    

    public int getInvoicenum() {
        return invoicenum;
    }

    public void setInvoicenum(int invoicenum) {
        this.invoicenum = invoicenum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

  
     
     @Override
    public String toString() {
        return "Invoice{" + "num=" + invoicenum + ", date=" + date + ", customer=" + customer + '}';
    }
    
    
}
