package ex12;

public class Bike extends Transportation{
  private int capacity;

  public Bike(String id, String brand, int manufactureYear, double price, String color, int capacity) {
    super(id, brand, manufactureYear, price, color);
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public String toString() {
    return "Bike [capacity=" + capacity + "]";
  }

}
