package ex12;

public class Transportation {
  private String id;
  private String brand;
  private int manufactureYear;
  private double price;
  private String color;
  public Transportation(String id, String brand, int manufactureYear, double price, String color) {
    this.id = id;
    this.brand = brand;
    this.manufactureYear = manufactureYear;
    this.price = price;
    this.color = color;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public int getManufactureYear() {
    return manufactureYear;
  }
  public void setManufactureYear(int manufactureYear) {
    this.manufactureYear = manufactureYear;
  }
  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  @Override
  public String toString() {
    return "Transportation [id=" + id + ", brand=" + brand + ", manufactureYear=" + manufactureYear + ", price=" + price
        + ", color=" + color + "]";
  }

}
