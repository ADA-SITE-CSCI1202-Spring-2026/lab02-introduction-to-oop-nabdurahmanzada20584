package week04.invoice;

public class Invoice {

    private int partNumber;
    private String partDescription;
    private int quantity;
    private float price;

    public Invoice() {
        partNumber = 0;
        partDescription = "0";
        quantity = 0;
        price = 0.0f;
    }

    public Invoice(int partNumber, String partDescription, int quantity, float  price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0.0) {
            price = 0.0f;
        }
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity < 0) {
            this.quantity = 0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
