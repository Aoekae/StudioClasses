package Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();    private MenuItem menuItem;
    private LocalDate dateUpdated;

    //constructor
    public Menu(MenuItem menuItem, LocalDate dateUpdated) {
        this.menuItem=menuItem;
        this.dateUpdated = dateUpdated;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated (LocalDate dateUpdated) {
        this.dateUpdated=LocalDate.now();
    }

}
