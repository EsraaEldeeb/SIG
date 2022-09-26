
package com.myproject.Model;


public class Line {
    
    private String item;
    private double price;
    private int count;
    private Invoice invoice;
    
    public Line(){}

    public Invoice getInvoice() {
        return invoice;
    }
   

    public Line( String item, double price, int count, Invoice invoice) {
 
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "invoiceLine{" + "num=" + invoice.getInvoicenum()+ ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
     public double getTotalLine()
    {
     return price * count ;
    }
     
      public String getASCSV() {
        return invoice.getInvoicenum()+ ","  + item+ "," +price + "," +count ;
    }
    
}
