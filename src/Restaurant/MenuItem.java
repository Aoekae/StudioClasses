package Restaurant;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {

    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private String itemCategory;
    private LocalDate dateAdded;
    private boolean newItem = false;

    public MenuItem(String itemName, String itemDescription, double itemPrice, String itemCategory, LocalDate dateAdded, boolean newItem) {
        this.itemName=itemName;
        this.itemDescription=itemDescription;
        this.itemPrice=itemPrice;
        this.itemCategory=itemCategory;
        this.dateAdded= dateAdded;
        this.newItem=newItem;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription(){
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setItemName(String aItemName) {
        itemName = aItemName;
    }

    public void setItemDescription(String aItemDescription) {
        itemDescription = aItemDescription;
    }

    public void setItemPrice(double aItemPrice) {
        itemPrice = aItemPrice;
    }

    public void setItemCategory(String aItemCategory) {
        itemCategory=aItemCategory;
    }

    public void setDateAdded (Date aDateAdded) {
        dateAdded = aDateAdded;
    }

    public void setNewItem (boolean isNewItem) {
        newItem = isNewItem;
    }
}
