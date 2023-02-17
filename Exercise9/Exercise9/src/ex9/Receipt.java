package ex9;

public class Receipt {
  private HouseHold houseHold;
  private int oldElectricityIndex;
  private int newElectricityIndex;
  private double price;
  public Receipt(HouseHold houseHold, int oldElectricityIndex, int newElectricityIndex) {
    this.houseHold = houseHold;
    this.oldElectricityIndex = oldElectricityIndex;
    this.newElectricityIndex = newElectricityIndex;
    this.price = getPrice();
  }
  public HouseHold getHouseHold() {
    return houseHold;
  }
  public void setHouseHold(HouseHold houseHold) {
    this.houseHold = houseHold;
  }
  public int getOldElectricityIndex() {
    return oldElectricityIndex;
  }
  public void setOldElectricityIndex(int oldElectricityIndex) {
    this.oldElectricityIndex = oldElectricityIndex;
  }
  public int getNewElectricityIndex() {
    return newElectricityIndex;
  }
  public void setNewElectricityIndex(int newElectricityIndex) {
    this.newElectricityIndex = newElectricityIndex;
  }
  public double getPrice() {
    return (this.newElectricityIndex - this.oldElectricityIndex)*5;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  @Override
  public String toString() {
    return "Receipt [houseHold=" + houseHold + ", oldElectricityIndex=" + oldElectricityIndex + ", newElectricityIndex="
        + newElectricityIndex + ", price=" + price + "]";
  }

}
