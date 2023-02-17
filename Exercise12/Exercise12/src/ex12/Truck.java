package ex12;

public class Truck extends Transportation{
  private int load;

  public Truck(String id, String brand, int manufactureYear, double price, String color, int load) {
    super(id, brand, manufactureYear, price, color);
    this.load = load;
  }

  public int getLoad() {
    return load;
  }

  public void setLoad(int load) {
    this.load = load;
  }

  @Override
  public String toString() {
    return "Truck [load=" + load + "]";
  }

}
