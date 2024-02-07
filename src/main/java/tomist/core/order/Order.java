package tomist.core.order;

public class Order {
  private long memberId;
  private String itemName;
  private int itemPrice;
  private int itemDiscount;

  public Order(long memberId, String itemName, int itemPrice, int itemDiscount) {
    this.memberId = memberId;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemDiscount = itemDiscount;
  }

  public int calculatePrice(){
    return itemPrice - itemDiscount;
  }

  public long getMemberId() {
    return memberId;
  }

  public String getItemName() {
    return itemName;
  }

  public int getItemPrice() {
    return itemPrice;
  }

  public int getItemDiscount() {
    return itemDiscount;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setItemPrice(int itemPrice) {
    this.itemPrice = itemPrice;
  }

  public void setItemDiscount(int itemDiscount) {
    this.itemDiscount = itemDiscount;
  }

  @Override
  public String toString() {
    return "Order{" +
            "memberId=" + memberId +
            ", itemName='" + itemName + '\'' +
            ", itemPrice=" + itemPrice +
            ", itemDiscount=" + itemDiscount +
            '}';
  }
}
