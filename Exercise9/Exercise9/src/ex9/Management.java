package ex9;

import java.util.ArrayList;
import java.util.List;

public class Management {
  private List<HouseHold> houseHolds;

  public Management() {
    houseHolds = new ArrayList<>();
  }

  public HouseHold getById(String id) {
    return this.houseHolds.stream().filter(o -> o.getElectricMeter().equals(id)).findFirst().orElse(null);
  }

  public void addNewHouseHold(HouseHold houseHold) {
    this.houseHolds.add(houseHold);
  }

  public void showInfoHouseHold() {
    this.houseHolds.stream().forEach(o -> System.out.println(o.toString()));
  }

  public void delete(String electricMeter) {
    HouseHold houseHold = this.houseHolds.stream().filter(o -> o.getElectricMeter().equals(electricMeter)).findFirst()
        .orElse(null);
    if (houseHold == null) {
      System.out.println("Fail");
      return;
    }
    houseHolds.remove(houseHold);
    System.out.println("Success");
  }

  public void edit(String electricMeter, String hostName, String address) {
    HouseHold houseHold = this.houseHolds.stream().filter(o -> o.getElectricMeter().equals(electricMeter)).findFirst()
        .orElse(null);
    if (houseHold == null) {
      System.out.println("Fail");
      return;
    }
    if (hostName != null) {
      houseHold.setHostName(hostName);
    }
    if (address != null) {
      houseHold.setAddress(address);
    }
    System.out.println("success");
    System.out.println(houseHold);
  }
}
