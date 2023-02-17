package ex9;

public class HouseHold {
  private String hostName;
  private String address;
  private String electricMeter;
  public HouseHold(String hostName, String address, String electricMeter) {
    this.hostName = hostName;
    this.address = address;
    this.electricMeter = electricMeter;
  }
  public String getHostName() {
    return hostName;
  }
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getElectricMeter() {
    return electricMeter;
  }
  public void setElectricMeter(String electricMeter) {
    this.electricMeter = electricMeter;
  }
  @Override
  public String toString() {
    return "HouseHold [hostName=" + hostName + ", address=" + address + ", electricMeter=" + electricMeter + "]";
  }

}
