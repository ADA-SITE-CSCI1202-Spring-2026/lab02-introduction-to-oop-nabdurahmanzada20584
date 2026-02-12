package week04;

import week04.invoice.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice(1, "A", 1, 1.0f);
        System.out.println(invoice.getInvoiceAmount());
    }
}
