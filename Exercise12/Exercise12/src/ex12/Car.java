package ex12;

public class Car extends Transportation{
  private int noOfSeats;
  private String engineModel;
  public Car(String id, String brand, int manufactureYear, double price, String color, int noOfSeats,
      String engineModel) {
    super(id, brand, manufactureYear, price, color);
    this.noOfSeats = noOfSeats;
    this.engineModel = engineModel;
  }
  public int getNoOfSeats() {
    return noOfSeats;
  }
  public void setNoOfSeats(int noOfSeats) {
    this.noOfSeats = noOfSeats;
  }
  public String getEngineModel() {
    return engineModel;
  }
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }
  @Override
  public String toString() {
    return "Car [noOfSeats=" + noOfSeats + ", engineModel=" + engineModel + "]";
  }
}
