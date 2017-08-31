public class InventoryItem {

    int itemQty;
    String itemName;

    public InventoryItem(int itemQty, String itemName) {
        this.itemQty = itemQty;
        this.itemName = itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
