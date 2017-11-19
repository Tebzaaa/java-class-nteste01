package exercise8;

/**
 * Class Item
 * @author Teboho Samuel Nteso
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    if (quantity > 0){
        return true;
    }else{
        return false;
    }
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if (quantity >= 1){
        quantity -= 1;
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      quantity++;
  }
  
  @Override
  public String toString() {
    System.out.println("We have "+quantity+" copies of "+title);
    return toString();
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
