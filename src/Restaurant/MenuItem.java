package Restaurant;

import java.time.LocalDate;

public class MenuItem {

    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private String itemCategory;
    private boolean isNewItem = false;

    public MenuItem(String itemName, String itemDescription, double itemPrice, String itemCategory, boolean isNewItem) {
        this.itemName=itemName;
        this.itemDescription=itemDescription;
        this.itemPrice=itemPrice;
        this.itemCategory=itemCategory;
        this.isNewItem=isNewItem;
    }

    //getters
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

    public Boolean getIsNewItem() {return isNewItem;}

    //setters

    public void setItemName(String aItemName) {
        this.itemName = aItemName;
    }

    public void setItemDescription(String aItemDescription) {
        this.itemDescription = aItemDescription;
    }

    public void setItemPrice(double aItemPrice) {
        this.itemPrice = aItemPrice;
    }

    public void setItemCategory(String aItemCategory) {
        this.itemCategory=aItemCategory;
    }

    public void setIsNewItem (boolean isNewItem) {
        this.isNewItem = isNewItem;
    }

    //methods

}
